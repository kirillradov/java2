package ru.geekbrains.java2.lesson1.competitor;

public class Robot extends Participant implements Competitor, Machine {
    public Robot(String name) {
        this.type = "Робот";
        this.name = name;
        this.maxRunDistance = 50000;
        this.maxJumpHeight = 3000;
        this.maxSwimDistance = 50000;
        this.onDistance = true;
    }
    boolean charged = true;

    public boolean isCharged() {
        return charged;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " - " + onDistance + " | Уровень заряда" +
                ": " + ((isCharged()) ? "100%" : "низкий"));
    }
}
