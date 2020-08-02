package by.ita.yanush.les04;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное). 1   2     3   ... n
                                                                             n n - 1 n - 2 ... 1
                                                                             1   2     3   ... n
                                                                          (  n n - 1 n - 2 ... 1 )
                                                                             .   .     .    .  .
                                                                             .   .     .    .  .
                                                                             n n - 1 n - 2 ... 1
 */

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];


        System.out.println("Новая матрица: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {

                    matrix[i][j] = j + 1;
                    System.out.print(matrix[i][j] + " ");

                } else {

                    matrix[i][j] = matrix[0].length - j;
                    System.out.print(matrix[i][j] + " ");

                }
            }
            System.out.println();
        }
        //Random rn =  new Random();
        /*int matrix[][] = new int[][]{
                {12, 13, 14, 5, 11},
                {18, 2, 19, 11, 13},
                {10, 16, 12, 14, 7},
                {19, 9, 21, 10, 17},
                {11, 12, 22, 15, 9}};*/

        /*for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = rn.nextInt(1000);

            }
            System.out.println();
        }*/

    }
}
