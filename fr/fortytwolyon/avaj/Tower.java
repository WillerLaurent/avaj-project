package fr.fortytwolyon.avaj;

import java.util.HashSet;

public class Tower {
    private HashSet<Flyable> observers = new HashSet<Flyable>();

    public void register(Flyable flyable) {
        observers.add(flyable);
    }

    public void unregister(Flyable flyable) {
        observers.remove(flyable);
    }

    protected void conditionsChanged() {
        
    }

}
