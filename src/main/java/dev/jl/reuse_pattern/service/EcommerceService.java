package dev.jl.reuse_pattern.service;

import dev.jl.reuse_pattern.exception.InvalidTenantException;
import dev.jl.reuse_pattern.service.interfaces.FactoryTenant;
import dev.jl.reuse_pattern.service.strategy.TenantStrategy;
import org.springframework.stereotype.Service;

@Service
public class EcommerceService {
    private final TenantStrategy tenantStrategy;

    public EcommerceService(TenantStrategy tenantStrategy) {
        this.tenantStrategy = tenantStrategy;
    }

    public String performPayment(String tenant) throws InvalidTenantException {
        FactoryTenant factoryTenant = tenantStrategy.getStrategy(tenant);
        if (factoryTenant == null) {
            throw new InvalidTenantException(
                    String.format("The tenant '%s' is not registered. Please provide a valid tenant.", tenant)
            );
        }
        return factoryTenant.getPayment().performPayment();
    }

    public String performAuthentication(String tenant) throws InvalidTenantException {
        FactoryTenant factoryTenant = tenantStrategy.getStrategy(tenant);
        if (factoryTenant == null) {
            throw new InvalidTenantException(
                    String.format("The tenant '%s' is not registered. Please provide a valid tenant.", tenant)
            );
        }
        return factoryTenant.getAuthentication().performAuthentication();
    }

    public String createShowcase(String tenant) throws InvalidTenantException {
        FactoryTenant factoryTenant = tenantStrategy.getStrategy(tenant);
        if (factoryTenant == null) {
            throw new InvalidTenantException(
                    String.format("The tenant '%s' is not registered. Please provide a valid tenant.", tenant)
            );
        }
        return factoryTenant.getShowcase().createShowCase();
    }
}
