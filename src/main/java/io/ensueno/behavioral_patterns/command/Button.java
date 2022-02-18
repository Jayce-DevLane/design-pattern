package io.ensueno.behavioral_patterns.command;

import java.awt.*;

public class Button {

    public void press(Command command){
        command.execute();
    }

    public static void main(String[] args) {

        Light light = new Light();
        Button button = new Button();

        button.press(new LightOnCommand(light));
        button.press(new LightOffCommand(light));

    }
}
