package by.ita.yanush.les02;

/*
Составить программу: определения наименьшего из двух чисел a и b.
 */

public class Task05 {
    public static void main(String[] args) {
        int first = 12;
        int second = 11;
        if (first < second) {
            System.out.println("Первое число меньше");
        }
        else if(first > second) {
            System.out.println("Второе число меньше");
        }
        else {
            System.out.println("Числа равны");
        }
    }
}
