package com.allshop.framework.core.handler;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ws.InvalidXmlException;
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.support.DefaultStrategiesHelper;
import org.springframework.ws.transport.WebServiceConnection;
import org.springframework.ws.transport.WebServiceMessageReceiver;
import org.springframework.ws.transport.http.HttpServletConnection;
import org.springframework.ws.transport.http.HttpTransportConstants;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.transport.http.WebServiceMessageReceiverHandlerAdapter;

import com.allshop.framework.core.exception.CodigosError;

public class CustomWebServiceMessageReceiverHandlerAdapter extends WebServiceMessageReceiverHandlerAdapter
implements HandlerAdapter, Ordered, InitializingBean, ApplicationContextAware {

	 private ApplicationContext context;
	    @Override
	    public void setApplicationContext(ApplicationContext applicationContext)
	            throws BeansException {
	        this.context = applicationContext;
	    }

	    @Override
	    public void afterPropertiesSet() {
	        DefaultStrategiesHelper defaultStrategiesHelper = new DefaultStrategiesHelper(MessageDispatcherServlet.class);
	        WebServiceMessageFactory factory = defaultStrategiesHelper
	                .getDefaultStrategy(WebServiceMessageFactory.class, context);
	        setMessageFactory(factory);
	    }

	    public ModelAndView handle(HttpServletRequest httpServletRequest,
	                               HttpServletResponse httpServletResponse,
	                               Object handler) throws Exception {
	        if (HttpTransportConstants.METHOD_POST.equals(httpServletRequest.getMethod())) {
	            WebServiceConnection connection = new MyWebServiceConnection(httpServletRequest, httpServletResponse);
	            try {
	                handleConnection(connection, (WebServiceMessageReceiver) handler);
	            } catch (InvalidXmlException ex) {
	                handleInvalidXmlException(httpServletRequest, httpServletResponse, handler, ex);
	            } catch (Exception ex) {
	                handleGeneralException(httpServletRequest, httpServletResponse, handler, ex);
	            }
	        }
	        else {
	            handleNonPostMethod(httpServletRequest, httpServletResponse, handler);
	        }
	        return null;
	    }


	    private void handleGeneralException(
	            HttpServletRequest httpServletRequest,
	            HttpServletResponse response, Object handler,
	            Exception ex) throws IOException {
	    	writeErrorResponseWithMessage(httpServletRequest, response, ex);
//	        writeErrorResponseWithMessage(httpServletRequest, response, ex.getClass().getName() + ": " + ex.getMessage());
	    }

	    /**
	     * By default, sets SC_BAD_REQUEST as response in Spring, so overwritten to
	     * provide HTTP_OK and reasonable SOAP fault response.
	     */
	    protected void handleInvalidXmlException(
	            HttpServletRequest httpServletRequest,
	            HttpServletResponse response, Object handler, InvalidXmlException ex)
	            throws IOException {
	        writeErrorResponseWithMessage(httpServletRequest, response, ex);
//	        writeErrorResponseWithMessage(httpServletRequest, response, ex.getClass().getName() + ": " + ex.getMessage());
	    }

	    /**
	     * By default, sets SC_METHOD_NOT_ALLOWED as response in Spring, so overwritten to
	     * provide HTTP_OK and reasonable SOAP fault response.
	     */
	    protected void handleNonPostMethod(HttpServletRequest httpServletRequest,
	                                       HttpServletResponse response,
	                                       Object handler) throws Exception {
	    	writeErrorResponseWithMessage(httpServletRequest, response, new Exception());
//	        writeErrorResponseWithMessage(httpServletRequest, response, "HTTP Method not allowed");
	    }

	    private void writeErrorResponseWithMessage(HttpServletRequest httpServletRequest, HttpServletResponse response, Exception ex)
	            throws IOException {
	    	String errorXml = null;
	    	if(ex.getMessage() != null){
		      errorXml = String.format(
		                 "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">"
		                         +"    <SOAP-ENV:Header/>"
		                         +"    <SOAP-ENV:Body>"
		                         +"        <SOAP-ENV:Fault>"
		                         +"            <faultcode>SOAP-ENV:Server</faultcode>"
		                         +"            <faultstring xml:lang=\"en\">FaultMsg</faultstring>"
		                         +"			   <detail>"
		                         +"            		<ns3:Excepcion xmlns:ns3=\"http://www.allshop.com/framework/core/ws/common/ExcepcionGeneral\">"
		                         +"            			<Codigo>"+CodigosError.PANIC.toString()+"</Codigo>"
		                         +"            			<Componente>"+ex.getCause().toString().replaceAll("\"", "").replaceAll("<", "").replaceAll(">", "")+"</Componente>"
		                         +"            			<Metodo>"+ex.getStackTrace()[0].getClassName().replaceAll("\"", "").replaceAll("<", "").replaceAll(">", "")+"</Metodo>"
		                         +"            			<Descripcion>"+ex.getStackTrace()[0].getMethodName().replaceAll("\"", "").replaceAll("<", "").replaceAll(">", "")+"</Descripcion>"
		                         +"            		</ns3:Excepcion>"
		                         +"            </detail>"
		                         +"        </SOAP-ENV:Fault>"
		                         +"    </SOAP-ENV:Body>"
		                         +"</SOAP-ENV:Envelope>"
		                );
	    	}else{
		        errorXml = String.format(
		                 "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">"
		                         +"    <SOAP-ENV:Header/>"
		                         +"    <SOAP-ENV:Body>"
		                         +"        <SOAP-ENV:Fault>"
		                         +"            <faultcode>SOAP-ENV:Server</faultcode>"
		                         +"            <faultstring xml:lang=\"en\">%s</faultstring>"
		                         +"        </SOAP-ENV:Fault>"
		                         +"    </SOAP-ENV:Body>"
		                         +"</SOAP-ENV:Envelope>",
		                StringEscapeUtils.escapeXml("PANIC ERROR : HTTP Method not allowed - Spin in circles")
		                );
	    	}
	        
	        response.setStatus(HttpServletResponse.SC_OK);
	        response.setContentType("text/xml");
	        response.getWriter().write(errorXml);
	        response.getWriter().flush();
	    }
	    @Override
	    public int getOrder() {
	        return 1;
	    }

	    /**
	     * This class is needed as org.springframework.ws.transport.http.HttpServletConnection will throw an
	     * exception if it is used outside Spring framework files. However, extending it and using the same
	     * implementation seems to be fine.
	     *
	     */
	    static class MyWebServiceConnection extends HttpServletConnection {
	        protected MyWebServiceConnection(HttpServletRequest httpServletRequest,
	                HttpServletResponse httpServletResponse) {
	            super(httpServletRequest, httpServletResponse);
	        }
	    }    

	    
}
