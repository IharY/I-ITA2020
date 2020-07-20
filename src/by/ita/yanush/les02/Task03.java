package by.ita.yanush.les02;

/*
Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.
 */
public class Task03 {
    public static void main(String[] args) {

        double a = 100000;
        double kb = Math.pow(2, 10);
        double mb = Math.pow(2, 20);
        double gb = Math.pow(2, 30);

        System.out.println(a + " байт = " + a / kb + " килобайт");
        System.out.println(a + " байт = " + a / mb + " мегобайт");
        System.out.println(a + " байт = " + a / gb + " гигобайт");

    }
}
