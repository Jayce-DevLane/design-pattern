package io.ensueno.structural_patterns.proxy.interface_proxy;

public class Client {

    public static void main(String[] args) {

        GameService gameService = new GameServiceProxy(new DefaultGameService());
        gameService.startGame();
    }
}
