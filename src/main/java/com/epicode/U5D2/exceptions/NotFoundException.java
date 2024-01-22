package com.epicode.U5D2.exceptions;

import java.util.UUID;

public class NotFoundException extends RuntimeException{
    public NotFoundException(UUID id) {
        super("Element with id " + id + " does not found!" );
    }

    public NotFoundException(String message) {
        super(message);
    }
}
