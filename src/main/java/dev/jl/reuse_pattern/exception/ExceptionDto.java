package dev.jl.reuse_pattern.exception;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.Instant;

@JsonPropertyOrder(alphabetic = true)
public record ExceptionDto (
        String detail,
        Integer status,
        String title,
        Instant timestamp,
        String instance){
}