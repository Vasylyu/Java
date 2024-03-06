package org.live_after_java.observer;

public class Master implements Observer{
    String name;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (salary < 80){
            System.out.println(String.format("Master %s: I am waiting for better job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
        else {
            System.out.println(String.format("Master %s: I am ready this job!  (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
