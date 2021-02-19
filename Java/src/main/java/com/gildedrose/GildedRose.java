package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    /**
     * 1) Creating an item to contain the current item's variables
     * 2) Move update quality to Item
     * 3) Reduce nesting of conditions
     * 4) Extract constants/strings
     * 5) quality + 1 -> ++1
     * 6) Replace for to forEach
     * 7) Getters / setters (maybe)
     * 8) Create item types class
     * 9) Create function forŁ <50 then increase quality
     *
     */
    public void updateQuality() {
        for (Item item : items) {
            item.update();
        }
    }
}