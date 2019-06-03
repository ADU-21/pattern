package com.adu.behavioral.chain.of.responsibility;

/**
 * @author LukeDu
 * @date 2019/6/3
 */
public class FilterChain {

    private AuthenticationProcessor authenticationProcessor;

    public FilterChain() {
        buildChain();
    }

    public void buildChain() {
        authenticationProcessor = new OAuthProcessor(new UsernamePasswordProcessor(new RamProcessor(null)));
    }

    public void doFilter(Request request, Response response) {
        authenticationProcessor.isAuthorized(request.getAuthenticationProvider());
    }
}
