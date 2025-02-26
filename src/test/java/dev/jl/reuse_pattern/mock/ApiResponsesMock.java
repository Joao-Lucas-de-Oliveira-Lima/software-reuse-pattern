package dev.jl.reuse_pattern.mock;

public abstract class ApiResponsesMock {
    protected String showcaseMessageForTenantA = "Showcase created according to Tenant A's preferences";
    protected String showcaseMessageForTenantB = "Showcase created according to Tenant B's preferences";
    protected String showcaseMessageForTenantC = "Showcase created according to Tenant C's preferences";

    protected String paymentMessageForTenantA = "Performing payment according to Tenant A's rules";
    protected String paymentMessageForTenantB = "Performing payment according to Tenant B's rules";
    protected String paymentMessageForTenantC = "Performing payment according to Tenant C's rules";

    protected String authenticationMessageForTenantA = "Performing authentication according to Tenant A's rules";
    protected String authenticationMessageForTenantB = "Performing authentication according to Tenant B's rules";
    protected String authenticationMessageForTenantC = "Performing authentication according to Tenant C's rules";
}
