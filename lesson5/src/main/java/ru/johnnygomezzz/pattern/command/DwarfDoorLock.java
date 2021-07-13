package ru.johnnygomezzz.pattern.command;

public class DwarfDoorLock {
    private Password rightPassword;
    private Password wrongPassword;

    public DwarfDoorLock(Password rightPassword, Password wrongPassword) {
        this.rightPassword = rightPassword;
        this.wrongPassword = wrongPassword;
    }

    public void unlock() {
        rightPassword.isSaid();
    }

    public void lock() {
        wrongPassword.isSaid();
    }
}
