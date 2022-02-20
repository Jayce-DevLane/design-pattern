package io.ensueno.behavioral_patterns.visitor;

public class Triangle implements Shape {


    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
