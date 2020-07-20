package by.ita.yanush.les02;

/*Вычислить значение выражения по формуле (все пернеменные принимают действительные значения):
(a/c) * (b/d) - (a*b - c) / c*d)
 */

public class Task02 {
    public static void main(String args []){
    double a = 1;
    double b = 1;
    double c = 1;
    double d = 1;
    double result;
    result = (a/c) * (b/d) - (a*b - c) / (c*d);
    System.out.println(result);
    }
}
