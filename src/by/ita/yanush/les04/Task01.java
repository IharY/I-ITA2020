package by.ita.yanush.les04;

/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на главной диагонали.
 */

public class Task01 {
    public static void main(String[] args) {
        int matrix[][] = new int[][]{{2, 3, 4}, {8, 2, 9}, {10, 6, 2}};
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);

        }
    }
}
