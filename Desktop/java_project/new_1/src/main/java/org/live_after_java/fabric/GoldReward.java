package org.live_after_java.fabric;

public class GoldReward implements IGameItem{
    @Override
    public void open() {
        System.out.println("Открыли сундук с золотом");
    }
}
