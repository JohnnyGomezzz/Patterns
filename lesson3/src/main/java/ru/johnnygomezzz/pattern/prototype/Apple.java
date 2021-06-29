package ru.johnnygomezzz.pattern.prototype;

public class Apple extends Smartphone{
    public Apple(String model) {
        this.setPrice(900);
        this.setModel(model);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        return (Apple) super.clone();
    }
}
