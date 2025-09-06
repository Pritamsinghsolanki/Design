package org.example.SOLID.DependencyIversion;

/*
High-level modules should not depend on low-level modules. Both should depend on abstractions.
* Notification doesn’t care if it’s Email or SMS → depends on interface, not concrete class.
* */
public class Main {
    public static void main(String[] args) {
        Notification p1 = new Notification(new EmailService());
        Notification p2 = new Notification(new SMSService());

        p1.notifyUser("Order Placed");
        p2.notifyUser("Your OTP is 1234");
    }
}

/*
* S → Keep one responsibility per class

O → Extend without modifying existing code

L → Subclasses should be replaceable with parent

I → Don’t force classes to implement unused methods

D → Depend on abstractions (interfaces), not concrete classes
* */
