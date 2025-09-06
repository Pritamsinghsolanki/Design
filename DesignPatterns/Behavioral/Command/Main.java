package org.example.DesignPatterns.Behavioral.Command;

/*
* When to Use?

When you need Undo/Redo, Queuing of requests, or a decoupled action executor.
* */
public class Main {
    public static void main(String[] args)
    {
        Light light = new Light();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(new LightOnCommand(light));
        remote.pressButton();

        remote.setCommand(new LightOffCommand(light));
        remote.pressButton();
    }
}
