package ru.johnnygomezzz.pattern.bridge;

public class Sword extends Workpiece{
    public Sword(Incrustation incrustation) {
        super(incrustation);
    }

    @Override
    public void forge() {
        System.out.println("Выковать меч!");
        incrustation.decorate();
    }
}
