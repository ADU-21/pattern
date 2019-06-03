package com.adu.behavioral.chain.of.responsibility;

/**
 * @author LukeDu
 * @date 2019/6/3
 */
public class OAuthProcessor extends AuthenticationProcessor {
    public OAuthProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        System.out.println("isOauthProvider?");
        if (authProvider instanceof OAuthTokenProvider) {
            System.out.println("isOauth");
            return true;
        } else if (nextProcessor != null) {
            System.out.println("nextProcessor");
            return nextProcessor.isAuthorized(authProvider);
        }
        System.out.println("None of processor can process");
        return false;
    }
}
