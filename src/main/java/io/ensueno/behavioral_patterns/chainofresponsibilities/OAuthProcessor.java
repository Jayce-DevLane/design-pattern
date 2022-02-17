package io.ensueno.behavioral_patterns.chainofresponsibilities;

public class OAuthProcessor extends AuthenticationProcessor {

    public OAuthProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if(authProvider instanceof OAuthTokenProvider){
            System.out.println("OAuthToken Provider 입니다.");
            return true;
        } else if(nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        }
        return false;
    }
}
