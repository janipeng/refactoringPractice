package com.refactor.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class GildedRoseTest {

  /*
  1. given a normal item, its sellIn is 10, quality is 20

  when update quality

  then quality is 19

  2. given a normal item, its sellIn is 0, quality is 20

  when update quality

  then quality is 18

  3. given a Aged Brie item, its sellIn is 2, quality is 0

  when update quality

  then quality is 1

  4. given a Sulfuras item, its sellIn is 0, quality is 80

  when update quality

  then quality is 80

  5. given a Backstage Passes item, its sellIn is 15, quality is 20

  when update quality

  then quality is 21

  6. given a backstage passes item, its sellIn is 10, quality is 20

  when update quality

  then quality is 22


  7. given a backstage passes item, its sellIn is 5, quality is 20

  when update quality

  then quality is 23

  8. given a backstage passes item, its sellIn is 0, quality is 20

  when update quality

  then quality is 0

  9. given a Conjured item, its sellIn is 3, quality is 6

  when update quality

  then quality is 5





    items = new ArrayList<Item>();
    items.add(new Item("+5 Dexterity Vest", 10, 20));
    items.add(new Item("Aged Brie", 2, 0));
    items.add(new Item("Elixir of the Mongoose", 5, 7));
    items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
    items.add(new Item("Conjured Mana Cake", 3, 6));
   */

    @Test
    public void should_return_19_given_a_normal_item_its_sellIn_is_10_quality_is_20() throws Exception {
        Item item = new Item("+5 Dexterity Vest", 10, 20);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));
        gildedRose.updateQuality();

        Assert.assertEquals(19, item.getQuality());
    }
    @Test
    public void should_return_49_given_a_normal_item_its_sellIn_is_10_quality_is_50() throws Exception {
        Item item = new Item("+5 Dexterity Vest", 10, 50);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(49, item.getQuality());
    }

    @Test
    public void should_return_0_given_a_normal_item_its_sellIn_is_10_quality_is_0() throws Exception {
        Item item = new Item("+5 Dexterity Vest", 10, 0);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(0, item.getQuality());
    }

    @Test
    public void should_return_18_given_a_normal_item_its_sellIn_is_0_quality_is_20() throws Exception {
        Item item = new Item("+5 Dexterity Vest", 0, 20);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(18, item.getQuality());
    }

    @Test
    public void should_return_1_given_an_Aged_Brie_item_its_sellIn_is_2_quality_is_0() throws Exception {
        Item item = new Item("Aged Brie", 2, 0);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(1, item.getQuality());
    }

    @Test
    public void should_return_50_given_an_Aged_Brie_item_its_sellIn_is_2_quality_is_50() throws Exception {
        Item item = new Item("Aged Brie", 2, 50);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(50, item.getQuality());
    }

    @Test
    public void should_return_21_given_a_Sulfuras_item_its_sellIn_is_0_quality_is_80() throws Exception {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(80, item.getQuality());
    }

    @Test
    public void should_return_21_given_a_Backstage_Passes_item_its_sellIn_is_15_quality_is_20() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(21, item.getQuality());
    }

    @Test
    public void should_return_50_given_a_Backstage_Passes_item_its_sellIn_is_15_quality_is_50() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 50);
        GildedRose gildedRose = new GildedRose(Collections.singletonList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(50, item.getQuality());
    }

    @Test
    public void should_return_23_given_a_Backstage_Passes_item_its_sellIn_is_5_quality_is_20() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(23, item.getQuality());
    }

    @Test
    public void should_return_23_given_a_Backstage_Passes_item_its_sellIn_is_5_quality_is_49() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 2, 49);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(50, item.getQuality());
    }


    @Test
    public void should_return_22_given_a_Backstage_Passes_item_its_sellIn_is_10_quality_is_20() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(22, item.getQuality());
    }

    @Test
    public void should_return_0_given_a_Backstage_Passes_item_its_sellIn_is_0_quality_is_20() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(0, item.getQuality());
    }

    @Test
    public void should_return_50_given_a_Backstage_Passes_item_its_sellIn_is_2_quality_is_60() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 2, 60);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(60, item.getQuality());
    }

    @Test
    public void should_return_5_given_a_Conjured_item_its_sellIn_is_3_quality_is_6() throws Exception {
        Item item = new Item("Conjured Mana Cake", 3, 6);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(5, item.getQuality());
    }

    @Test
    public void should_return_4_given_a_Conjured_item_its_sellIn_is_0_quality_is_6() throws Exception {
        Item item = new Item("Conjured Mana Cake", 0, 6);
        GildedRose gildedRose = new GildedRose(Arrays.asList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(4, item.getQuality());
    }

}