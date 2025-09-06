package org.example.DesignPatterns.Behavioral.Template;

abstract class Game {

    //Template method
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
}
