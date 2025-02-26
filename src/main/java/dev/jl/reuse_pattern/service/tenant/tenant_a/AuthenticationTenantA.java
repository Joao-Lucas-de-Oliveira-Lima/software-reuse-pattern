package dev.jl.reuse_pattern.service.tenant.tenant_a;

import dev.jl.reuse_pattern.service.interfaces.AuthenticationTenant;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationTenantA implements AuthenticationTenant {
    @Override
    public String performAuthentication() {
        return "Performing authentication according to Tenant A's rules";
    }
}
