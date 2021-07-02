package ru.johnnygomezzz.pattern.prototype;

public class BronzeBox extends Lootbox {

    public BronzeBox() {
        this.setPrice(100);
        this.setGemQuantity(100, 200);
    }

    @Override
    public Lootbox clone() throws CloneNotSupportedException {
        return (BronzeBox) super.clone();
    }
}
