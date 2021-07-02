package ru.johnnygomezzz.pattern.prototype;

public class GoldBox extends Lootbox {

    public GoldBox() {
        this.setPrice(300);
        this.setGemQuantity(300, 400);
    }

    @Override
    public Lootbox clone() throws CloneNotSupportedException {
        return (GoldBox) super.clone();
    }
}
