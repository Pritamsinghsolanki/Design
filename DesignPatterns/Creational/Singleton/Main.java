package org.example.DesignPatterns.Creational.Singleton;

/*
* ✅ When to Use?

When only one object should exist (DB connection pool, logger, cache manager).
* */
public class Main {
    public static void main(String[] args)
    {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.log("First instance");
        l2.log("Second instance");

        System.out.println(l1==l2);

    }
}
