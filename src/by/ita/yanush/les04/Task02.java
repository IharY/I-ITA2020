package by.ita.yanush.les04;

/*
Дана матрица. Вывести k-ю стриоку и p-й столбец матрицы.
 */
public class Task02 {
    public static void main(String[] args) {
        int matrix [][] = new int[][] {{2, 3, 4},{8, 2, 9},{10, 6, 2}};
        int k = 2;
        int p = 1;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i == k){
                    System.out.println("k-ая строка");
                    System.out.println(matrix[i][j]);
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(j == p){
                    System.out.println("p-й столбец");
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
}
