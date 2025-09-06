package org.example.SOLID.InterfaceSegregation;

//Interfaces are segregated → no unused methods.
public class Main {
    public static void main(String[] args) {
         Printer p1 = new SimplePrinter();
            p1.print();
            MultiPrinter p2 = new MultiPrinter();
            p2.print();
            p2.scan();
    }
}
