package ru.geekbrains.java2.lesson1.course;

import ru.geekbrains.java2.lesson1.competitor.Competitor;
import ru.geekbrains.java2.lesson1.competitor.Team;

public class Course {
    private Obstacle[] obstacle;

    public Course(Obstacle... course) {
        this.obstacle = course;
    }

    public void doIt(Team team) {
        for (Competitor c : team.getMembers()) {
            for (Obstacle o : obstacle) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}
