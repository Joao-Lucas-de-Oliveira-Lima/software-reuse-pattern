package dev.jl.reuse_pattern.service.tenant.tenant_b;

import dev.jl.reuse_pattern.service.interfaces.PaymentTenant;
import org.springframework.stereotype.Component;

@Component
public class PaymentTenantB implements PaymentTenant {
    @Override
    public String performPayment() {
        return "Performing payment according to Tenant B's rules";
    }
}
