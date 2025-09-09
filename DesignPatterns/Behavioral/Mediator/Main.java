package org.example.DesignPatterns.Behavioral.Mediator;

/*
* When to Use?

When communication is complex, better to centralize via mediator.
* */
public class Main {
    public static void main(String[] args)
    {
        ChatRoom chatRoom = new ChatRoom();

        User u1 = new User("Alice",chatRoom);
        User u2 = new User("Bob",chatRoom);

        u1.sendMessage("Hello Bob!");
        u2.sendMessage("Hi Alice!");

    }
}
