package dev.jl.reuse_pattern.controller;

import dev.jl.reuse_pattern.mock.ApiResponsesMock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@AutoConfigureMockMvc
class EcommerceControllerIT extends ApiResponsesMock {

    @Autowired
    private MockMvc mockMvc;

    @LocalServerPort
    private Integer port;

    @Test
    @DisplayName("Should return 200 OK for /api/v1/payment in Tenant A")
    void shouldReturn200ForPaymentEndpointWithTenantA() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("")
                        .uri(String.format("http://tenanta.localhost:%s/v1/payment", port)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("message", equalTo(paymentMessageForTenantA)));
    }

    @Test
    @DisplayName("Should return 200 OK for /api/v1/payment in Tenant B")
    void shouldReturn200ForPaymentEndpointWithTenantB() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("")
                        .uri(String.format("http://tenantb.localhost:%s/v1/payment", port)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("message", equalTo(paymentMessageForTenantB)));
    }

    @Test
    @DisplayName("Should return 200 OK for /api/v1/payment in Tenant C")
    void shouldReturn200ForPaymentEndpointWithTenantC() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("")
                        .uri(String.format("http://tenantc.localhost:%s/v1/payment", port)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("message", equalTo(paymentMessageForTenantC)));
    }

    @Test
    @DisplayName("Should return 200 OK for /api/v1/auth in Tenant A")
    void shouldReturn200ForAuthEndpointWithTenantA() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("")
                        .uri(String.format("http://tenanta.localhost:%s/v1/auth", port)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("message", equalTo(authenticationMessageForTenantA)));
    }

    @Test
    @DisplayName("Should return 200 OK for /api/v1/auth in Tenant B")
    void shouldReturn200ForAuthEndpointWithTenantB() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("")
                        .uri(String.format("http://tenantb.localhost:%s/v1/auth", port)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("message", equalTo(authenticationMessageForTenantB)));
    }

    @Test
    @DisplayName("Should return 200 OK for /api/v1/auth in Tenant C")
    void shouldReturn200ForAuthEndpointWithTenantC() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("")
                        .uri(String.format("http://tenantc.localhost:%s/v1/auth", port)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("message", equalTo(authenticationMessageForTenantC)));
    }

    @Test
    @DisplayName("Should return 200 OK for /api/v1/showcase in Tenant A")
    void shouldReturn200ForShowcaseEndpointWithTenantA() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("")
                        .uri(String.format("http://tenanta.localhost:%s/v1/showcase", port)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("message", equalTo(showcaseMessageForTenantA)));
    }

    @Test
    @DisplayName("Should return 200 OK for /api/v1/showcase in Tenant B")
    void shouldReturn200ForShowcaseEndpointWithTenantB() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("")
                        .uri(String.format("http://tenantb.localhost:%s/v1/showcase", port)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("message", equalTo(showcaseMessageForTenantB)));
    }

    @Test
    @DisplayName("Should return 200 OK for /api/v1/showcase in Tenant C")
    void shouldReturn200ForShowcaseEndpointWithTenantC() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("")
                        .uri(String.format("http://tenantc.localhost:%s/v1/showcase", port)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("message", equalTo(showcaseMessageForTenantC)));
    }

    @Test
    @DisplayName("Should return 403 Forbidden when the Tenant is null")
    void shouldReturn403WhenTenantIsNull() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("")
                        .uri(String.format("http://localhost:%s/v1/showcase", port)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isForbidden());
    }

    @Test
    @DisplayName("Should return 403 Forbidden when the Tenant is invalid")
    void shouldReturn403WhenTenantIsInvalid() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("")
                        .uri(String.format("http://tenantd.localhost:%s/v1/showcase", port)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isForbidden());
    }

}
