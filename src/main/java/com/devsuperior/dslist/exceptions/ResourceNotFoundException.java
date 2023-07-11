package com.devsuperior.dslist.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long SerialVersionUID = 1L;
    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
