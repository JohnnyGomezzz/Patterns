package ru.johnnygomezzz.pattern.bridge;

public class Helmet extends Workpiece{
    public Helmet(Incrustation incrustation) {
        super(incrustation);
    }

    @Override
    public void forge() {
        System.out.println("Выковать шлем!");
        incrustation.decorate();
    }
}
