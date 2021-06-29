package ru.johnnygomezzz.pattern.prototype;

public class Samsung extends Smartphone{
    public Samsung(String model) {
        this.setPrice(700);
        this.setModel(model);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        return (Samsung) super.clone();
    }
}
