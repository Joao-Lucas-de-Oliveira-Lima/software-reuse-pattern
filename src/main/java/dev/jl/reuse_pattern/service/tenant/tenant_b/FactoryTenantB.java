package dev.jl.reuse_pattern.service.tenant.tenant_b;

import dev.jl.reuse_pattern.service.interfaces.AuthenticationTenant;
import dev.jl.reuse_pattern.service.interfaces.FactoryTenant;
import dev.jl.reuse_pattern.service.interfaces.PaymentTenant;
import dev.jl.reuse_pattern.service.interfaces.ShowcaseTenant;
import org.springframework.stereotype.Component;

@Component
public class FactoryTenantB implements FactoryTenant {
    @Override
    public PaymentTenant getPayment() {
        return new PaymentTenantB();
    }

    @Override
    public ShowcaseTenant getShowcase() {
        return new ShowcaseTenantB();
    }

    @Override
    public AuthenticationTenant getAuthentication() {
        return new AuthenticationTenantB();
    }
}
