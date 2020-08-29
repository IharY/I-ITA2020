package by.ita.yanush.les07;

import java.util.Random;

public class Test03 {

    private int minVal = -50;
    private int maxVal = 50;
    private int var;

    //Random rn =  new Random(0);

    public Test03(){
        var = minVal;
    }

    public Test03(int var){
        this.var = var;
    }

    public Test03(int var, int maxVal, int minVal){
        this.var = var;
        this.maxVal = maxVal;
        this.minVal = minVal;
    }



    public boolean increase() {
        if (var + 1 > maxVal) {
            return false;
        } else {
            var++;
            return true;
        }
    }

    public boolean decrease() {
        if (var - 1 < minVal) {
            return false;
        } else {
            var--;
            return true;
        }
    }

    public int getValue() {
        return var;
    }
}
