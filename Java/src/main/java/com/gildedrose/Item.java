package com.gildedrose;

public class Item {

    private static final int LOW_QUALITY_GATE = 50;
    private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    private static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    private static final String AGED_BRIE = "Aged Brie";

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

        /*
     - Extract magic constants (get rid of duplicated strings) (partially done)
     - Utility method for increasing quality
     - Simplify if statements
     - move update method to Item class (done)
     - for-each instead of for (done)
     - resource class with string resources
     */

    public void updateItemQuality() {

        if( name.equals(AGED_BRIE)) {
            // TODO
            updateAgedBrieOrBackstagePasses();
            sellIn--;
        } else if ( name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
            // TODO
            updateAgedBrieOrBackstagePasses();
            sellIn--;
        } else if (name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
            // TODO
        } else {
            if (quality > 0) {
                quality--;
            }
            sellIn--;

            if (sellIn < 0 && quality > 0) {
                quality--;
            }
            // TODO: handle default item
        }



        if (sellIn < 0) {
            if (!name.equals(AGED_BRIE)) {
                if (!name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                    if ((quality > 0) && (!name.equals(SULFURAS_HAND_OF_RAGNAROS))) {

                    }
                } else {
                    quality = 0;
                }
            } else { // if aged brie
                incrementIfUnderQualityGate();
            }
        }
    }

    private boolean incrementIfUnderQualityGate() {
        if (quality < LOW_QUALITY_GATE) {
            quality++;
            return true;
        }
        return false;
    }

    private void updateAgedBrieOrBackstagePasses() {
        if (incrementIfUnderQualityGate() && name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
            if (sellIn < 11) {
                incrementIfUnderQualityGate();
            }

            if (sellIn < 6) {
                incrementIfUnderQualityGate();
            }
        }
    }
}
