package ru.geekbrains.java2.lesson1.competitor;

public class Team {
    private String name;
    private Competitor[] team;

    public Team(String name, Competitor... team) {
        this.name = name;
        this.team = team;
    }

    public Competitor[] getMembers() {
        return team;
    }

    public void startMsg() {
        System.out.println("Команда " + name + " готова к соревнованию!");
    }

    public void info() {
        for (Competitor c : team) {
            c.info();
        }
    }


}
