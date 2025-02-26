package dev.jl.reuse_pattern.service.tenant.tenant_c;

import dev.jl.reuse_pattern.service.interfaces.AuthenticationTenant;
import dev.jl.reuse_pattern.service.interfaces.FactoryTenant;
import dev.jl.reuse_pattern.service.interfaces.PaymentTenant;
import dev.jl.reuse_pattern.service.interfaces.ShowcaseTenant;
import org.springframework.stereotype.Component;

@Component
public class FactoryTenantC implements FactoryTenant {
    @Override
    public PaymentTenant getPayment() {
        return new PaymentTenantC();
    }

    @Override
    public ShowcaseTenant getShowcase() {
        return new ShowcaseTenantC();
    }

    @Override
    public AuthenticationTenant getAuthentication() {
        return new AuthenticationTenantC();
    }
}
