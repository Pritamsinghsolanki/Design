package org.example.SOLID.InterfaceSegregation;

public class MultiPrinter implements Printer, Scanner{
    public void print() {
        System.out.println("Printing document...");
    }
    public void scan() {
        System.out.println("Scanning document...");
    }
}
