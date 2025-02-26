package dev.jl.reuse_pattern.service.tenant.tenant_a;

import dev.jl.reuse_pattern.service.interfaces.ShowcaseTenant;
import org.springframework.stereotype.Component;

@Component
public class ShowcaseTenantA implements ShowcaseTenant {
    @Override
    public String createShowCase() {
        return "Showcase created according to Tenant A's preferences";
    }
}
