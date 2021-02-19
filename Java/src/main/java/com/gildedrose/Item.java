package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    /**
     * X) Creating an item to contain the current item's variables
     * X) Move update quality to Item
     * 3) Reduce nesting of conditions
     * 4) Extract constants/strings
     * 5) quality + 1 -> ++1
     * X) Replace for to forEach
     * 7) Getters / setters (maybe)
     * 8) Create item types class
     * 9) Create function forŁ <50 then increase quality
     *
     */
    public void update() {
        if (!this.name.equals("Aged Brie")
                && !this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (this.quality > 0) {
                if (!this.name.equals("Sulfuras, Hand of Ragnaros")) {
                    this.quality = this.quality - 1;
                }
            }
        } else {
            if (this.quality < 50) {
                this.quality = this.quality + 1;

                if (this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (this.sellIn < 6) {
                        increaseIfQualityUnder50(2);
                    }
                    else if (this.sellIn < 11) {
                        increaseIfQualityUnder50(1);
                    }
                }
            }
        }

        if (!this.name.equals("Sulfuras, Hand of Ragnaros")) {
            this.sellIn = this.sellIn - 1;
        }

        if (this.sellIn < 0) {
            if (!this.name.equals("Aged Brie")) {
                if (!this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (this.quality > 0) {
                        if (!this.name.equals("Sulfuras, Hand of Ragnaros")) {
                            this.quality = this.quality - 1;
                        }
                    }
                } else {
                    this.quality = this.quality - this.quality;
                }
            } else {
                increaseIfQualityUnder50(1);
            }
        }
    }

    private void increaseIfQualityUnder50(int factor) {
        if (this.quality < 50) {
            this.quality += factor;
        }
    }

}
