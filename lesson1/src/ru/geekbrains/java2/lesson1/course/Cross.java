package ru.geekbrains.java2.lesson1.course;


import ru.geekbrains.java2.lesson1.competitor.Competitor;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}
