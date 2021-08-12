package fr.fortytwolyon.avaj;

import java.util.HashSet;

/* design pattern observer */

public abstract class Tower {
    private HashSet<Flyable> observers = new HashSet<Flyable>();

    public void register(Flyable flyable) {
        this.observers.add(flyable);
    }

    public void unregister(Flyable flyable) {
        this.observers.remove(flyable);
    }

    protected void conditionsChanged() {
        for (Flyable observer : observers) {
            observer.updateConditions();
        }
    }
}
