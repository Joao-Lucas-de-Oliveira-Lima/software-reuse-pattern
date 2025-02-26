package dev.jl.reuse_pattern.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class TenantFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        String host = httpServletRequest.getServerName();

        String tenant = extractTenant(host);

        servletRequest.setAttribute("Tenant", tenant);

        filterChain.doFilter(servletRequest, servletResponse);
    }

    public String extractTenant(String host) {

        String pattern = "^[a-zA-Z]+\\d*\\.localhost";

        if (host == null || !host.matches(pattern)) {
            return null;
        }

        return host.split("\\.")[0];
    }
}
