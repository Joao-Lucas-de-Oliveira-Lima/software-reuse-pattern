package dev.jl.reuse_pattern.service.tenant.tenant_c;

import dev.jl.reuse_pattern.service.interfaces.AuthenticationTenant;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationTenantC implements AuthenticationTenant {
    @Override
    public String performAuthentication() {
        return "Performing authentication according to Tenant C's rules";
    }
}
