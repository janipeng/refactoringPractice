package com.refactor.homework;

import java.util.List;


class GildedRose {

    private static List<Item> items = null;

    GildedRose(List<Item> items) {
        GildedRose.items = items;
    }

    static void updateQuality() {
        items.forEach(Item::updateQuality);
    }

}