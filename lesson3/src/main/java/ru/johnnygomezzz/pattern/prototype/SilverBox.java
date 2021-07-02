package ru.johnnygomezzz.pattern.prototype;

public class SilverBox extends Lootbox {

    public SilverBox() {
        this.setPrice(200);
        this.setGemQuantity(200, 300);
    }

    @Override
    public Lootbox clone() throws CloneNotSupportedException {
        return (SilverBox) super.clone();
    }
}
