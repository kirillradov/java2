package ru.geekbrains.java2.lesson1;


import ru.geekbrains.java2.lesson1.competitor.*;
import ru.geekbrains.java2.lesson1.course.Course;
import ru.geekbrains.java2.lesson1.course.Cross;
import ru.geekbrains.java2.lesson1.course.Wall;
import ru.geekbrains.java2.lesson1.course.Water;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Победители", new Human("Боб"), new Robot("Борис"), new Cat("Барсик"), new Dog("Бобик"));
        Course course = new Course(new Cross(80), new Water(5), new Wall(1), new Cross(120));
        team.startMsg();
        System.out.println();
        team.info();
        System.out.println();
        course.doIt(team);
        System.out.println();
        team.info();
    }
}