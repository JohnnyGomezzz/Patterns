package ru.johnnygomezzz.pattern.command;

public class CloseDwarfDoor implements Password{
    private DwarfDoor door;

    public CloseDwarfDoor(DwarfDoor door) {
        this.door = door;
    }

    @Override
    public void isSaid() {
        door.closed();
    }
}
