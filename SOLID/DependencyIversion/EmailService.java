package org.example.SOLID.DependencyIversion;

public class EmailService implements MessageServce{
    public void sendMessage(String message) {
        System.out.println("Email sent to "+" with message="+message);
    }
}
