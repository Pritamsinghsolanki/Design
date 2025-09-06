package org.example.SOLID.SingleResponsiblity;

public class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Invoice Details:");
        System.out.println("Product: " + invoice.getProduct());
        System.out.println("Amount: $" + invoice.getAmount());
    }
}
