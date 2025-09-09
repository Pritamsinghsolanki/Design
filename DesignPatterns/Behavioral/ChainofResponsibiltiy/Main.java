package org.example.DesignPatterns.Behavioral.ChainofResponsibiltiy;

public class Main {
    public static void main(String[] args)
    {
        Handler l1 = new Level1Support();
        Handler l2 = new Level2Support();
        Handler manager = new ManagerSupport();

        l1.setNext(l2);
        l2.setNext(manager);

        l1.handleRequest("critical");
        l1.handleRequest("critical");
    }
}
