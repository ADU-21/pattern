package com.adu.behavioral.chain.of.responsibility;

/**
 * @author LukeDu
 * @date 2019/6/3
 */
public abstract class AuthenticationProcessor {
    public AuthenticationProcessor nextProcessor;

    public AuthenticationProcessor(AuthenticationProcessor authenticationProcessor) {
        this.nextProcessor = authenticationProcessor;
    }

    public abstract boolean isAuthorized(AuthenticationProvider authProvider);
}
