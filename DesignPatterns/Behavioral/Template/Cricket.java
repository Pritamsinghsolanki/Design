package org.example.DesignPatterns.Behavioral.Template;

public class Cricket extends Game{
        void initialize() {
            System.out.println("Cricket game init");
        }

        void startPlay() {
            System.out.println("Cricket game started");
        }

        void endPlay() {
            System.out.println("Cricket game ended");
        }
}
