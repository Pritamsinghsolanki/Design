package org.example.DesignPatterns.Behavioral.Iterator;

/*
* When to Use?

When you want to iterate collections without exposing their structure.*/
public class Main {
    public static void main(String[] args) {
        NameRepository repo = new NameRepository();

        for (String name : repo) {
            System.out.println("Name" + name);
        }
    }
}
