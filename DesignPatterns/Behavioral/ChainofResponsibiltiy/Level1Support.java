package org.example.DesignPatterns.Behavioral.ChainofResponsibiltiy;

public class Level1Support extends Handler{
    @Override
    public void handleRequest(String request) {
        if(request.equalsIgnoreCase("basic"))
        {
            System.out.println("Level1 Handled "+ request);
        }
        else if(next != null)
        {
            next.handleRequest(request);
        }
    }
}
