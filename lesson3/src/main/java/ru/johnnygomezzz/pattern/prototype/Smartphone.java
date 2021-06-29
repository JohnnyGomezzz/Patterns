package ru.johnnygomezzz.pattern.prototype;

public abstract class Smartphone implements Cloneable{
    private String model;
    private int price;
    private int additionalPrice = 0;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price + this.additionalPrice;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAdditionalPrice(int additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    public Smartphone clone() throws CloneNotSupportedException {
        return (Smartphone) super.clone();
    }

    @Override
    public String toString() {
        return "SmartPhone [model=" + getModel() + ", price=" + getPrice() + "]";
    }
}
