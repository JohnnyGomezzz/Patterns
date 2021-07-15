package ru.johnnygomezzz.pattern.bridge;

public class Ruby implements Incrustation{
    @Override
    public void decorate() {
        System.out.println("Украсить рубином!");
    }
}
