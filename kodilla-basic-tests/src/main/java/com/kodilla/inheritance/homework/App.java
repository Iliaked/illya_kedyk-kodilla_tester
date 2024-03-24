package com.kodilla.inheritance.homework;

public class App {
    public static void main(String[] args) {
        Windows windows = new Windows(1985);
        windows.turnOn();
        windows.displayReleaseYear();
        windows.turnOff();

        Linux linux = new Linux(1991);
        linux.turnOn();
        linux.displayReleaseYear();
        linux.turnOff();
    }
}
