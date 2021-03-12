package ru.geekbrains.lesson1;

public class Homework1 {

    public static void main(String[] args) {


        System.out.println(numberOne(10, 20, 15, 25));
        System.out.println(numberTwo(10, 5));
        System.out.println(numberThree(0));
        System.out.println(numberFour("Рикардо Милос"));
        System.out.println(numberFive(1945));
    }

    /*Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
    где a, b, c, d – целочисленные входные параметры этого метода; */

    private static float numberOne(int a, int b, int c, int d) {
        return (float) a * ( (float) b + (float) c / d);
    }
    /* Написать метод, принимающий на вход два целых числа,
    и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;*/

    public static boolean numberTwo(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    /*Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число передали, или отрицательное.
    Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль */

    public static String numberThree(int a) {
        if(a >= 0){
            return a + " Положительное число";
        } else {
            return a + " Отрицательное число";
        }

    }

    /*Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть приветственное сообщение
     «Привет, переданное_имя!»; Вывести приветствие в консоль.
     */

    public static String numberFour(String name){
        return  "Привет, " + name + "!";
    }

    /*Написать метод, который определяет является ли год високосным.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    Для проверки работы вывести результаты работы метода в консоль */

    public static String numberFive(int year){
        if(year % 400 == 0 || year % 100 != 0 && year % 4 == 0)
            return year + " Високосный";
        else
            return year + " Не високосный";

        /*
        if(year % 400 ==0){
            return year + " Високосный";
        } else if(year % 100 == 0){
            return year + " Не високосный";
        } else if(year % 4 == 0){
            return year + " Високосный";
        } else {
            return year + " Не високосный";
        } */

    }
}