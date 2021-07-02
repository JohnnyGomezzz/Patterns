package ru.johnnygomezzz.pattern.prototype;

import java.util.Random;

public abstract class Lootbox implements Cloneable{
    private int gemQuantity;
    private int price;

    public int getGemQuantity() {
        return gemQuantity;
    }

    public void setGemQuantity(int min, int max) {
        int delta = max - min;
        Random random = new Random();
        this.gemQuantity = min + random.nextInt(delta + 1);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Lootbox clone() throws CloneNotSupportedException {
        return (Lootbox) super.clone();
    }

}
