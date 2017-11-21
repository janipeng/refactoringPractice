package com.refactor.homework;

class ItemStrategyFactory {
    static ItemStrategy createItemStrategy(String name) {
        switch (name) {
            case "Aged Brie":
                return new AgedBrieItem();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItem();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstageItem();
            default:
                return new NormalItem();
        }
    }
}
