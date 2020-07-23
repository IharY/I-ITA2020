package by.ita.yanush.les02;

/*
Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до
введенного пользоваьелем числа.
 */

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int variable;
        int result = 0;
        System.out.println("Введите любое целое цисло:");
        variable = sc.nextInt();
        for(int i = variable; i > 0; i--){
            result += i;
        }
        System.out.println("Сумма чисел от 1 до введеного числа равна:" + result);
    }
}
