package dev.jl.reuse_pattern.service.tenant.tenant_a;

import dev.jl.reuse_pattern.service.interfaces.AuthenticationTenant;
import dev.jl.reuse_pattern.service.interfaces.PaymentTenant;
import dev.jl.reuse_pattern.service.interfaces.ShowcaseTenant;
import dev.jl.reuse_pattern.service.interfaces.FactoryTenant;
import org.springframework.stereotype.Component;

@Component
public class FactoryTenantA implements FactoryTenant {
    @Override
    public PaymentTenant getPayment() {
        return new PaymentTenantA();
    }

    @Override
    public ShowcaseTenant getShowcase() {
        return new ShowcaseTenantA();
    }

    @Override
    public AuthenticationTenant getAuthentication() {
        return new AuthenticationTenantA();
    }
}
