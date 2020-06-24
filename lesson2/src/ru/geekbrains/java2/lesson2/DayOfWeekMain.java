package ru.geekbrains.java2.lesson2;

public class DayOfWeekMain {

    public enum DayOfWeek {
        MONDAY(8), TUESDAY(8), WEDNESDAY(8), THURSDAY(8), FRIDAY(8), SATURDAY(0), SUNDAY(0);

        private int hours;

        public int getHours() {
            return hours;
        }

        DayOfWeek(int hours) {
            this.hours = hours;
        }

        public static int getWorkingHours(DayOfWeek val) {
            int value = 0;
            switch (val) {
                case MONDAY:
                    value += DayOfWeek.MONDAY.getHours();
                case TUESDAY:
                    value += DayOfWeek.TUESDAY.getHours();
                case WEDNESDAY:
                    value += DayOfWeek.WEDNESDAY.getHours();
                case THURSDAY:
                    value += DayOfWeek.TUESDAY.getHours();
                case FRIDAY:
                    value += DayOfWeek.FRIDAY.getHours();
                case SATURDAY:
                    value += DayOfWeek.SATURDAY.getHours();
                case SUNDAY:
                    value += DayOfWeek.SUNDAY.getHours();
                    break;
            }
            return value;
        }
    }

}