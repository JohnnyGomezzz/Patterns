package ru.johnnygomezzz.pattern.bridge;

public class Shield extends Workpiece{
    public Shield(Incrustation incrustation) {
        super(incrustation);
    }

    @Override
    public void forge() {
        System.out.println("Выковать щит!");
        incrustation.decorate();
    }
}
