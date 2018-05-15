package com.asaf.maoz.playground.checkedandunchecked;

/**
 * not checked at compiled time.
 * Unchecked, uncaught or runtime exceptions are exceptions that can be thrown without being caught or declared.
 * Sometime it is desirable to catch all exceptions for logging purposes, then throw them back in.
 *
 * If a client cannot do anything to recover from the exception, make it an unchecked exception
 */
public class UnCheckedException extends RuntimeException{

    private static final long serialVersionUID = -8560356960632230194L;

    private String exceptionMessage;
    private Integer exceptionCode;

    public UnCheckedException(String message, Integer errorCode) {
        super();
        //you can add log for the message and code here
        this.exceptionCode = errorCode;
        this.exceptionMessage = message;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public Integer getExceptionCode() {
        return exceptionCode;
    }
}
