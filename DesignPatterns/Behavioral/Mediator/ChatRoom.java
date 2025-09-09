package org.example.DesignPatterns.Behavioral.Mediator;

public class ChatRoom {
    public void showMessage(User user, String message)
    {
        System.out.println(user.getName() + ": "+ message);
    }
}
