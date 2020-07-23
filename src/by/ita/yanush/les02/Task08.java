package by.ita.yanush.les02;

/*
Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич через отверстие.
 */

public class Task08 {
    public static void main(String[] args) {

        int A = 10;
        int B = 15;
        int a = 14;
        int b = 9;
        int c = 7;

        if (((A > a) &(B > b)) || ((A > a) & (B > c)) || ((A > c) & (B > b))){
            System.out.println("Кирпич пройдет");
        }


        else {
            System.out.println("Кирпич не пройдет");
        }

        /*if(A >= a){
            if(B >= b){
                System.out.println("Кирпич пройдет");

            }
            else if(B >= c){
                System.out.println("Кирпич пройдет");

            }
            else{
                System.out.println("Кирпич не пройдет");

            }
        }
        if(A >= b){
            if(B >= a){
                System.out.println("Кирпич пройдет");

            }
            else if(B >= c){
                System.out.println("Кирпич пройдет");

            }
            else{
                System.out.println("Кирпич не пройдет");

            }
        }
        if(A >= c){
            if(B >= b){
                System.out.println("Кирпич пройдет");

            }
            else if(B >= a){
                System.out.println("Кирпич пройдет");

            }
            else{
                System.out.println("Кирпич не пройдет");

            }
        }*/



    }
}
