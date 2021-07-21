package ru.johnnygomezzz.pattern.command;

public class OpenDwarfDoor implements Password{
    private DwarfDoor door;

    public OpenDwarfDoor(DwarfDoor door) {
        this.door = door;
    }

    @Override
    public void isSaid() {
        door.opened();
    }
}
