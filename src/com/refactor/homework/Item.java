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
        createItemStrategy();
    }

    private void createItemStrategy() {
        switch (getName()) {
            case "Aged Brie":
                itemStrategy = new AgedBrieItem();
                break;
            case "Sulfuras, Hand of Ragnaros":
                itemStrategy = new SulfurasItem();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                itemStrategy = new BackstageItem();
                break;
            default:
                itemStrategy = new NormalItem();
        }
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void updateQuality() {
        itemStrategy.update(this);
    }
}
