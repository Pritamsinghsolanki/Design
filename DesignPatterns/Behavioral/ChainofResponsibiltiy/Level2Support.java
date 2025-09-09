package org.example.DesignPatterns.Behavioral.ChainofResponsibiltiy;

public class Level2Support extends Handler{
    @Override
    public void handleRequest(String request) {
        if(request.equalsIgnoreCase("Advance"))
        {
            System.out.println("Level2 Handled "+ request);
        }
        else if(next != null)
        {
            next.handleRequest(request);
        }
    }
}
