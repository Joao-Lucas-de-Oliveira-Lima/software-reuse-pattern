package dev.jl.reuse_pattern.controller;

import dev.jl.reuse_pattern.exception.InvalidTenantException;
import dev.jl.reuse_pattern.service.EcommerceService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class EcommerceController {
    private final String pattern = "^[a-zA-Z]+\\d*\\.localhost";

    private final EcommerceService ecommerceService;

    public EcommerceController(EcommerceService ecommerceService) {
        this.ecommerceService = ecommerceService;
    }

    @GetMapping("/payment")
    public ResponseEntity<Message> performPayment(HttpServletRequest request) {
        String tenant = request.getAttribute("Tenant") != null ? request.getAttribute("Tenant").toString() : null;
        if (tenant == null) {
            throw new InvalidTenantException(
                    String.format("Tenant is missing or does not match the expected pattern. Please provide a valid tenant following the pattern: %s", pattern)
            );
        }
        return ResponseEntity.ok(new Message(ecommerceService.performPayment(tenant)));
    }

    @GetMapping("/auth")
    public ResponseEntity<Message> performAuthentication(HttpServletRequest request) {
        String tenant = request.getAttribute("Tenant") != null ? request.getAttribute("Tenant").toString() : null;
        if (tenant == null) {
            throw new InvalidTenantException(
                    String.format("Tenant is missing or does not match the expected pattern. Please provide a valid tenant following the pattern: %s", pattern)
            );
        }
        return ResponseEntity.ok(new Message(ecommerceService.performAuthentication(tenant)));
    }

    @GetMapping("/showcase")
    public ResponseEntity<Message> createShowCase(HttpServletRequest request) {
        String tenant = request.getAttribute("Tenant") != null ? request.getAttribute("Tenant").toString() : null;
        if (tenant == null) {
            throw new InvalidTenantException(
                    String.format("Tenant is missing or does not match the expected pattern. Please provide a valid tenant following the pattern: %s", pattern)
            );
        }
        return ResponseEntity.ok(new Message(ecommerceService.createShowcase(tenant)));
    }

    public record Message(String message) {}
}
