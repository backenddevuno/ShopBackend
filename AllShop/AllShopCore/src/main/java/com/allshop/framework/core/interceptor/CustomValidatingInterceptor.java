package com.allshop.framework.core.interceptor;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.XMLConstants;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.log4j.Logger;
import org.springframework.core.io.ResourceLoader;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.WebServiceTransformerException;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class CustomValidatingInterceptor extends PayloadValidatingInterceptor{
	   private static final String REQUEST = "request";
	    private static final String RESPONSE = "response";

	    private boolean createFaultWhenRequestNotValid = true;
	    private boolean createFaultWhenResponseNotValid = false;

	    @Override
	    protected Source getValidationRequestSource(WebServiceMessage request) {
	        return transformSourceToStreamSourceWithStringReader(request.getPayloadSource());
	    }

	    @Override
	    protected Source getValidationResponseSource(WebServiceMessage response) {
	        return transformSourceToStreamSourceWithStringReader(response.getPayloadSource());
	    }

	    protected Source transformSourceToStreamSourceWithStringReader(Source notValidatableSource) {
	        final Source source;
	        try {
	            Transformer transformer = TransformerFactory.newInstance().newTransformer();

	            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION,
	                                          "yes");
	            transformer.setOutputProperty(OutputKeys.INDENT, "no");
	            StringWriter writer = new StringWriter();
	            transformer.transform(notValidatableSource, new StreamResult(
	                    writer));

	            String transformed = writer.toString();
	            StringReader reader = new StringReader(transformed);
	            source = new StreamSource(reader);

	        } catch (TransformerException transformerException) {
	            throw new WebServiceTransformerException(
	                    "Could not convert the source to a StreamSource with a StringReader",
	                    transformerException);
	        }

	        return source;
	    }
}
