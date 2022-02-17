package io.ensueno.behavioral_patterns.chainofresponsibilities;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증 작업");
        super.handle(request);
    }
}
