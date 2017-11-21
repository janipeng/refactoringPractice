package com.refactor.homework;

public class NormalItem implements ItemStrategy {

    @Override
    public void update(Item item) {
        updateSellIn(item);
        updateQuality(item);
    }

    private void updateQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }

        if (item.getSellIn() < 0 && item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

    private void updateSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }
}
