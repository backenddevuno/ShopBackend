package com.allshop.framework.core.exception;

import com.allshop.framework.core.ws.common.excepciongeneral.ExcepcionGenericaType;

public class ServiceFaultException extends RuntimeException {

	private static final long serialVersionUID = 7885514313311177523L;
	
	private ExcepcionGenericaType excepcionGenericaType;
	
    public ServiceFaultException(String message) {
        super(message);
    }
    
    public ServiceFaultException(Throwable e) {
        super(e);
    }
    
    public ServiceFaultException(String message, Throwable e) {
        super(message, e);
    }
    
    public ServiceFaultException(String message, ExcepcionGenericaType excepcionGenericaType) {
        super(message);
        this.excepcionGenericaType = excepcionGenericaType;
    }
    
    public ServiceFaultException(String message, Throwable e, ExcepcionGenericaType excepcionGenericaType) {
        super(message, e);
        this.excepcionGenericaType = excepcionGenericaType;
    }

    public ExcepcionGenericaType getExcepcionGenericaType() {
        return excepcionGenericaType;
    }

    public void setExcepcionGenericaType(ExcepcionGenericaType excepcionGenericaType) {
        this.excepcionGenericaType = excepcionGenericaType;
    }

}
