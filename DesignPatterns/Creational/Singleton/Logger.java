package org.example.DesignPatterns.Creational.Singleton;

public class Logger {
    private static Logger instance;

    Logger(){}

    public static Logger getInstance()
    {
        if(instance == null)
        {
            return instance = new Logger();
        }
        return instance;
    }

    public void log(String comments)
    {
        System.out.println("LOG:"+comments);
    }
}
