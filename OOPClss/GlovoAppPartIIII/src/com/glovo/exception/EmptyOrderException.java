package com.glovo.exception;

public class EmptyOrderException extends Exception{
    public EmptyOrderException(String message){
        super(message);
    }

    public String recoverFromException(){
        return("Please add at least one order before performing this operation: ");
    }
}