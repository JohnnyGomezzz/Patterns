package ru.johnnygomezzz.pattern.command;

public class CommandPatternTest {
    public static void main(String[] args) {
        DwarfDoor dwarfDoor = new DwarfDoor();

        Password right = new OpenDwarfDoor(dwarfDoor);
        Password wrong = new CloseDwarfDoor(dwarfDoor);

        DwarfDoorLock lock = new DwarfDoorLock(right, wrong);

        lock.unlock();
        lock.lock();
    }
}
