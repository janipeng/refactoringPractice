package com.refactor.homework;

public class Item {
    public String name;
    private int sellIn;
    private int quality;

    private ItemStrategy itemStrategy;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.itemStrategy = ItemStrategyFactory.createItemStrategy(name);
    }

    public String getName() {
        return name;
    }

    int getSellIn() {
        return sellIn;
    }

    void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    int getQuality() {
        return quality;
    }

    void setQuality(int quality) {
        this.quality = quality;
    }

    void updateQuality() {
        itemStrategy.update(this);
    }
}
