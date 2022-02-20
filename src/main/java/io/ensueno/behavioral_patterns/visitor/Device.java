package io.ensueno.behavioral_patterns.visitor;

public interface Device {
    void print(Circle circle);

    void print(Rectangle rectangle);

    void print(Triangle triangle);
}