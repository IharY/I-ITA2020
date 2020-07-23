package by.ita.yanush.les02;

/*
Вывести на экран соответствий между символами и их численными обозначениями в
памяти компьютера (Таблицу ASCII)
 */

public class Task12 {

    public static void main(String[] args) {
        String str = " !@#$%^&*()+-";
        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ASCII " + (int) str.charAt(i));
        }
    }
}
