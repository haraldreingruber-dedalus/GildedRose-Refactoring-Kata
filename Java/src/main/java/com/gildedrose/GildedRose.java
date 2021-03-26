package com.gildedrose;

class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public static final int LOW_QUALITY_GATE = 50;
    Item[] items;

    /*
     - Extract magic constants (get rid of duplicated strings) (partially done)
     - Utility method for increasing quality
     - Simplify if statements
     - move update method to Item class (done)
     - for-each instead of for
     - resource class with string resources
     */

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item: items) {
            item.updateItemQuality();
        }
    }

}