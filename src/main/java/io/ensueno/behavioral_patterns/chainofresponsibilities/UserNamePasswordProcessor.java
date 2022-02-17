package io.ensueno.behavioral_patterns.chainofresponsibilities;

public class UserNamePasswordProcessor extends AuthenticationProcessor{

    public UserNamePasswordProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if(authProvider instanceof UserNamePasswordProvider){
            System.out.println("UserNamePassword 프로바이더 입니다.");
            return true;
        } else if(nextProcessor != null){
            return nextProcessor.isAuthorized(authProvider);
        }
        return false;
    }
}
