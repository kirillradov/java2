package ru.geekbrains.java2.lesson1.competitor;


public class Human extends Participant implements Competitor {

    public Human(String name) {
        this.type = "Человек";
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 30;
        this.maxSwimDistance = 200;
        this.onDistance = true;
    }
}