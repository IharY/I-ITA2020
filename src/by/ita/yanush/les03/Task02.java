package by.ita.yanush.les03;

/*
В целочисленной последовательности есть нулевые элементы. Создать масси из номеров этих элементов.
 */

public class Task02 {
    public static void main(String[] args) {
        int [] sequence = { 1, 3, 0, 3, 7, 9, 0, 10};
        int zerocounter = 0;
        //int [] array = new int[];
        for (int i = 0; i < sequence.length; i++){
            if(sequence[i] == 0){
                zerocounter++;
            }
        }
        if(zerocounter != 0){
            int [] array = new int[zerocounter];
            int mark = 0;
            for (int i = 0; i < sequence.length; i++){
                if(sequence[i] == 0){
                    array[mark] = i;
                    System.out.println(array[mark]);
                    mark++;

                }
            }
        }else{
            System.out.println("В последовательности нет нулей");
        }

    }
}
