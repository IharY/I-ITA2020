package by.ita.yanush.les02;

/*
Найти НОД двух целых положительных чисел
 */

public class Task15 {
    public static void main(String[] args) {
        int a = 64;
        int b = 12;

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
    }
}
