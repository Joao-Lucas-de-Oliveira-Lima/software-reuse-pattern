package dev.jl.reuse_pattern.service.tenant.tenant_c;

import dev.jl.reuse_pattern.service.interfaces.ShowcaseTenant;
import org.springframework.stereotype.Component;

@Component
public class ShowcaseTenantC implements ShowcaseTenant {
    @Override
    public String createShowCase() {
        return "Showcase created according to Tenant C's preferences";
    }
}
