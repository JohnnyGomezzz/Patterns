package ru.johnnygomezzz.pattern.bridge;

public class Emerald implements Incrustation{
    @Override
    public void decorate() {
        System.out.println("Украсить изумрудом!");
    }
}
