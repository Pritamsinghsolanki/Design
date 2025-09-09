package org.example.DesignPatterns.Behavioral.Mediator;

public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name,ChatRoom chatRoom)
    {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName(){ return name;}

    public void sendMessage(String message)
    {
        chatRoom.showMessage(this,message);
    }
}
