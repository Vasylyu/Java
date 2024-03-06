package org.live_after_java.fabric;

public class GoldGen implements ItemGen{
    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}
