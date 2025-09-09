package org.example.DesignPatterns.Behavioral.ChainofResponsibiltiy;

public class ManagerSupport extends Handler{
    @Override
    public void handleRequest(String request) {
        System.out.println("Manager handled request:"+ request);
    }
}
