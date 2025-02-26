package dev.jl.reuse_pattern.service.tenant.tenant_b;

import dev.jl.reuse_pattern.service.interfaces.AuthenticationTenant;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationTenantB implements AuthenticationTenant {
    @Override
    public String performAuthentication() {
        return "Performing authentication according to Tenant B's rules";
    }
}
