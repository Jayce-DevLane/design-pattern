package io.ensueno.behavioral_patterns.chainofresponsibilities;

public class Client {

    RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request();
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(null));
        Client client = new Client(chain);
        client.doWork();
    }
}
