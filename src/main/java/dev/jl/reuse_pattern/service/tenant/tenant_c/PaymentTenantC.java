package dev.jl.reuse_pattern.service.tenant.tenant_c;

import dev.jl.reuse_pattern.service.interfaces.PaymentTenant;
import org.springframework.stereotype.Component;

@Component
public class PaymentTenantC implements PaymentTenant {
    @Override
    public String performPayment() {
        return "Performing payment according to Tenant C's rules";
    }
}
