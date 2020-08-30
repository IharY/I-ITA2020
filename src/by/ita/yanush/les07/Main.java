package by.ita.yanush.les07;

public class Main {
    public static void main(String[] args) {
        Test01 test = new Test01();
        test.show();
    }
    public static void printTime(Test04 time) {
        System.out.print("Время: ");
        if (time.getHours() < 10) {
            System.out.print("0" + time.getHours() + ":");
        } else {
            System.out.print(time.getHours() + ":");
        }

        if (time.getMinutes() < 10) {
            System.out.print("0" + time.getMinutes() + ":");
        } else {
            System.out.print(time.getMinutes() + ":");
        }

        if (time.getSeconds() < 10) {
            System.out.println("0" + time.getSeconds());
        } else {
            System.out.println(time.getSeconds());
        }
    }


}
