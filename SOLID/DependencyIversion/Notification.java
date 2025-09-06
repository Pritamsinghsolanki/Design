package org.example.SOLID.DependencyIversion;

public class Notification {
    private MessageServce messageServce;

    public Notification(MessageServce messageServce) {
        this.messageServce = messageServce;
    }

    public void notifyUser(String message) {
        messageServce.sendMessage(message);
    }
}
