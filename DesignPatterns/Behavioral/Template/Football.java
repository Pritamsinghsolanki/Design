package org.example.DesignPatterns.Behavioral.Template;

public class Football extends Game {
    void initialize() {
        System.out.println("Football game init");
    }

    void startPlay() {
        System.out.println("FootBall game started");
    }

    void endPlay() {
        System.out.println("Football game ended");
    }
}
