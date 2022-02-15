package io.ensueno.structural_patterns.bridge;

public interface App {

    void send();

    DefaultApp build();

}
