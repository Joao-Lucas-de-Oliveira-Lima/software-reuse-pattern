package dev.jl.reuse_pattern.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GreetingsController {
    @GetMapping
    public ResponseEntity<Greeting> greet(){
        return ResponseEntity.ok(new Greeting("Olá"));
    }
    public record Greeting (String text){}
}
