package ru.johnnygomezzz.pattern.bridge;

public class Diamond implements Incrustation{
    @Override
    public void decorate() {
        System.out.println("Украсить бриллиантом!");
    }
}
