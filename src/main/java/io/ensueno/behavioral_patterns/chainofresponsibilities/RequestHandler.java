package io.ensueno.behavioral_patterns.chainofresponsibilities;

public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void handle(Request request){
        if (nextHandler != null){
            nextHandler.handle(request);
        }
    }

}
