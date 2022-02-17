package io.ensueno.designpattern.behavior.chainofresponsibility;

import io.ensueno.behavioral_patterns.chainofresponsibilities.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ChainOfResponsibilityTest {

    private static AuthenticationProcessor getChainOfAuthProcessor(){
        AuthenticationProcessor oAuthProcessor = new OAuthProcessor(null);
        return new UserNamePasswordProcessor(oAuthProcessor);
    }

    @Test
    public void givenOAuthProvider_whenCheckingAuthorized_thenSuccess() {
        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
        assertTrue(authProcessorChain.isAuthorized(new OAuthTokenProvider()));
    }

    @Test
    public void givenUserNameProvider_whenCheckingAuthorized_thenSuccess() {
        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
        assertTrue(authProcessorChain.isAuthorized(new UserNamePasswordProvider()));
    }

}
