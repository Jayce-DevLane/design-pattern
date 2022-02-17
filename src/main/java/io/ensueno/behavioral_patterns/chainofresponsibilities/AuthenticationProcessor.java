package io.ensueno.behavioral_patterns.chainofresponsibilities;

public abstract class AuthenticationProcessor {

    public AuthenticationProcessor nextProcessor;

    public AuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean isAuthorized(AuthenticationProvider authProvider);
}
