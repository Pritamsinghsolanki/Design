package org.example.DesignPatterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private final List<Subscriber> subscriberList = new ArrayList<>();

    public void subscribe(Subscriber o){ subscriberList.add(o);}
    public void unsubscribe(Subscriber o){ subscriberList.remove(o);}

    public void notifyAllObservers(String message)
    {
        for(Observer o: subscriberList)
        {
            o.update(message);
        }
    }
}
