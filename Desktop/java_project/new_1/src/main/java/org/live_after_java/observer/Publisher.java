package org.live_after_java.observer;

public interface Publisher {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void sendOffer (String nameCompany, int salary);
}
