package ru.geekbrains.java2.lesson1.course;


import ru.geekbrains.java2.lesson1.competitor.Competitor;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}