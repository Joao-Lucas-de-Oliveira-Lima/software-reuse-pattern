package dev.jl.reuse_pattern.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.Instant;

@RestController
@ControllerAdvice
class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(InvalidTenantException.class)
    ResponseEntity<ExceptionDto> handleInvalidTenantException(WebRequest webRequest, Exception e){
        HttpStatus status = HttpStatus.FORBIDDEN;

        return ResponseEntity
                .status(HttpStatus.FORBIDDEN)
                .body(new ExceptionDto(e.getMessage(), status.value(), status.getReasonPhrase(), Instant.now(), webRequest.getDescription(false)));
    }
}
