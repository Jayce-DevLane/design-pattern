package io.ensueno.structural_patterns.proxy.interface_proxy;

public class DefaultGameService implements GameService{

    @Override
    public void startGame() {
        System.out.println("게임이 시작됩니다.");
    }
}
