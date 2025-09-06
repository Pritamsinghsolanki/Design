package org.example.SOLID.DependencyIversion;

public class SMSService implements MessageServce {
    public void sendMessage(String message) {
        System.out.println("SMS sent with message"+message);
    }
}
