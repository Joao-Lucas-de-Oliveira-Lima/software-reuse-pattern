package dev.jl.reuse_pattern.service.tenant.tenant_a;

import dev.jl.reuse_pattern.service.interfaces.PaymentTenant;
import org.springframework.stereotype.Component;

@Component
public class PaymentTenantA implements PaymentTenant {
    @Override
    public String performPayment() {
        return "Performing payment according to Tenant A's rules";
    }
}
