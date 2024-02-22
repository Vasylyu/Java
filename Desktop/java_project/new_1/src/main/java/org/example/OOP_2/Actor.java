package org.example.OOP_2;

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected Boolean makeOrder;
    protected Boolean takeOrder;

    public String getName() {
        return name;
    }

    public Actor (String name){
        this.name = name;
        makeOrder = false;
        takeOrder = false;
    }
}
