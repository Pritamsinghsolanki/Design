package org.example.OOPS;

// 1. Encapsulation
class Customer {
    private String name;   // hidden
    private String email;  // hidden

    // getter/setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

// 2. Abstraction
abstract class Payment {
    abstract void pay(double amount); // common contract
}

// 3. Inheritance + 4. Polymorphism (Overriding)
class CardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class WalletPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet Balance");
    }
}

// 3. Polymorphism (Overloading)
class Order {
    void placeOrder(String product) {
        System.out.println("Order placed for product: " + product);
    }
    void placeOrder(String product, int quantity) {
        System.out.println("Order placed for " + quantity + " x " + product);
    }
}

public class Main {
    public static void main(String[] args) {
        // Encapsulation
        Customer cust = new Customer();
        cust.setName("Alice");
        cust.setEmail("alice@example.com");

        System.out.println("Customer: " + cust.getName() + ", Email: " + cust.getEmail());

        // Polymorphism (Overloading)
        Order order = new Order();
        order.placeOrder("Laptop");
        order.placeOrder("Phone", 2);

        // Abstraction + Inheritance + Polymorphism (Overriding)
        Payment p1 = new CardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new WalletPayment();

        p1.pay(50000);
        p2.pay(2000);
        p3.pay(1000);
    }
}

