package dev.jl.reuse_pattern.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class InvalidTenantException extends RuntimeException{
    public InvalidTenantException(String message) {
        super(message);
    }

    public InvalidTenantException(String message, Throwable cause) {
        super(message, cause);
    }
}
