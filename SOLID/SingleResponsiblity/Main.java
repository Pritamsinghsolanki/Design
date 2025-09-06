package org.example.SOLID.SingleResponsiblity;

/*
* 👉 Invoice only stores invoice data,
👉 InvoicePrinter only prints → SRP followed.
* */
public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Laptop", 15000);
        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice);
    }
}
