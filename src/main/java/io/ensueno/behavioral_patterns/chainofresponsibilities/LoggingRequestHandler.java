package io.ensueno.behavioral_patterns.chainofresponsibilities;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로깅 작업 입니다.");
        super.handle(request);
    }
}
