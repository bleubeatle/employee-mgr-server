package com.abdullah.deen.employeemgrserver.domain.core.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (value = HttpStatus.CONFLICT) // indicates a business exception
// the label for a specific conflict code
public class ResourceCreationException extends RuntimeException{
    public ResourceCreationException(String message) {
        super(message);
    }
}
