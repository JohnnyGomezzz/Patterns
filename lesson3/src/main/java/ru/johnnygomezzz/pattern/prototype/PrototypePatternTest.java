package ru.johnnygomezzz.pattern.prototype;

public class PrototypePatternTest {

    public static void buyLootboxes(int money) throws CloneNotSupportedException {
        int gemTotalQuantity = 0;

        while(money >= 0) {
            Lootbox bronzeBox = new BronzeBox();
            Lootbox nextBronzeBox = bronzeBox.clone();
            System.out.println(nextBronzeBox.getGemQuantity());
            money -= nextBronzeBox.getPrice();
            gemTotalQuantity += nextBronzeBox.getGemQuantity();

            Lootbox silverBox = new SilverBox();
            Lootbox nextSilverBox = silverBox.clone();
            System.out.println(nextSilverBox.getGemQuantity());
            money -= nextSilverBox.getPrice();
            gemTotalQuantity += nextSilverBox.getGemQuantity();

            Lootbox goldBox = new GoldBox();
            Lootbox nextGoldBox = goldBox.clone();
            System.out.println(nextGoldBox.getGemQuantity());
            money -= nextGoldBox.getPrice();
            gemTotalQuantity += nextGoldBox.getGemQuantity();
        }
        System.out.println(gemTotalQuantity);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        buyLootboxes(1500);

    }
}
