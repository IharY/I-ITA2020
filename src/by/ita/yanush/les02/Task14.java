package by.ita.yanush.les02;

/*
Требуется определить факториал числа, которое ввел пользователь.
 */

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int variable;
        System.out.println("Введите любое целое цисло до 20:");
        variable = sc.nextInt();
        int factorial = 1;
        for(int i = variable; i > 0; i--){
            factorial *= i;
        }
        System.out.println("Факториал " + variable + " равен " + factorial);
    }
}
