package com.adu.behavioral.chain.of.responsibility;

/**
 * @author LukeDu
 * @date 2019/6/3
 */
public class Request {
    private AuthenticationProvider authenticationProvider;

    public Request(AuthenticationProvider authenticationProvider) {
        this.authenticationProvider = authenticationProvider;
    }

    public AuthenticationProvider getAuthenticationProvider() {
        return authenticationProvider;
    }

    public void setAuthenticationProvider(
        AuthenticationProvider authenticationProvider) {
        this.authenticationProvider = authenticationProvider;
    }
}
