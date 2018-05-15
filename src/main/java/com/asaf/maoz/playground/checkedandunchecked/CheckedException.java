package com.asaf.maoz.playground.checkedandunchecked;

/**
 * checked at compile time.
 * Must be either caught or declared in the method in which it is thrown
 * The compilation error can be resolved by catching the exception and handling it, or by declaring the exception
 *
 * All the application or business logic exceptions should be checked exceptions.
 *
 * If a client can reasonably be expected to recover from an exception
 */
public class CheckedException extends Exception{

    private String exceptionMessage;
    private Integer exceptionCode;

    public CheckedException(String message, Integer errorCode) {
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
