package ru.johnnygomezzz.pattern.bridge;

public abstract class Workpiece {
    protected Incrustation incrustation;

    public Workpiece(Incrustation incrustation) {
        this.incrustation = incrustation;
    }
    public abstract void forge();
}
