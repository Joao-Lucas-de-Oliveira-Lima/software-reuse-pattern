package dev.jl.reuse_pattern.service.interfaces;

public interface FactoryTenant {
    PaymentTenant getPayment();
    ShowcaseTenant getShowcase();
    AuthenticationTenant getAuthentication();
}
