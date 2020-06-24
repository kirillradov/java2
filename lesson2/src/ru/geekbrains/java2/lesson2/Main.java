package ru.geekbrains.java2.lesson2;

public class Main {
    public static void main(String[] args) {

        String[][] arr = {
            {"1","*","3","4"},
            {"5","6","7","8"},
            {"9","10","f","12"},
            {"13","14","15","16"},
        };

        try {
            System.out.println("Сумма всех чисел в массиве: " + intSumm(arr));

        } catch (MyArraySizeException e) {
           System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("До конца недели осталось: "
                + DayOfWeekMain.DayOfWeek.getWorkingHours(DayOfWeekMain.DayOfWeek.MONDAY) +
                " рабочих часов.");
    }

    public static int intSumm(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int summ = 0;

        if(arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException("Ошибка. Массив должен быть 4x4!");
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                    try {
                        summ +=  Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка '" + e.getLocalizedMessage() + "' - неверный формат данных в ячейке " + i + " " + j);
                    }
            }
        }
        return summ;
    }
    public static class MyArraySizeException extends Exception {
        public MyArraySizeException(String msg) {
            super(msg);
        }
    }

    public static class MyArrayDataException extends NumberFormatException {
        public MyArrayDataException() {
        }
    }
}

