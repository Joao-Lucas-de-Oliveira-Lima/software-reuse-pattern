package dev.jl.reuse_pattern.configuration;

import dev.jl.reuse_pattern.filter.TenantFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean<TenantFilter> tenantFilterFilterRegistrationBean(){
        FilterRegistrationBean<TenantFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new TenantFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);

        return registrationBean;
    }
}
