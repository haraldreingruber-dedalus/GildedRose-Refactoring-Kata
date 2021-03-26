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

   public void updateItemQuality() {
        if (!name.equals(GildedRose.AGED_BRIE)
                && !name.equals(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
            if (quality > 0) {
                if (!name.equals(GildedRose.SULFURAS_HAND_OF_RAGNAROS)) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < GildedRose.LOW_QUALITY_GATE) {
                quality = quality + 1;

                if (name.equals(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                    if (sellIn < 11) {
                        if (quality < GildedRose.LOW_QUALITY_GATE) {
                            quality = quality + 1;
                        }
                    }

                    if (sellIn < 6) {
                        if (quality < GildedRose.LOW_QUALITY_GATE) {
                            quality = quality + 1;
                        }
                    }
                }
            }
        }

        if (!name.equals(GildedRose.SULFURAS_HAND_OF_RAGNAROS)) {
            sellIn = sellIn - 1;
        }

        if (sellIn < 0) {
            if (!name.equals(GildedRose.AGED_BRIE)) {
                if (!name.equals(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                    if (quality > 0) {
                        if (!name.equals(GildedRose.SULFURAS_HAND_OF_RAGNAROS)) {
                            quality = quality - 1;
                        }
                    }
                } else {
                    quality = quality - quality;
                }
            } else {
                if (quality < GildedRose.LOW_QUALITY_GATE) {
                    quality = quality + 1;
                }
            }
        }
    }
}
