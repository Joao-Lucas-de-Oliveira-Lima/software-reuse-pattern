package dev.jl.reuse_pattern.service.tenant.tenant_b;

import dev.jl.reuse_pattern.service.interfaces.ShowcaseTenant;
import org.springframework.stereotype.Component;

@Component
public class ShowcaseTenantB implements ShowcaseTenant {
    @Override
    public String createShowCase() {
        return "Showcase created according to Tenant B's preferences";
    }
}
