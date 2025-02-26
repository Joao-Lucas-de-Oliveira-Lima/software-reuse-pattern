package dev.jl.reuse_pattern.service.strategy;

import dev.jl.reuse_pattern.service.interfaces.FactoryTenant;
import dev.jl.reuse_pattern.service.tenant.tenant_a.FactoryTenantA;
import dev.jl.reuse_pattern.service.tenant.tenant_b.FactoryTenantB;
import dev.jl.reuse_pattern.service.tenant.tenant_c.FactoryTenantC;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TenantStrategy {
    private final Map<String, FactoryTenant> map;

    public TenantStrategy() {
        this.map = Map.of(
                "tenanta", new FactoryTenantA(),
                "tenantb", new FactoryTenantB(),
                "tenantc", new FactoryTenantC()
        );
    }

    public FactoryTenant getStrategy(String tenant){
        if(!map.containsKey(tenant)){
            return null;
        }
        return map.get(tenant);
    }
}
