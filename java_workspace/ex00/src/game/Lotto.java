package game;

import java.util.Random;

public class Lotto {
    public static void main(String[] args){
        int[] lotto = new int[6];
        Random rd = new Random();
        int rdNum;

        for(int i = 0; i < lotto.length; i++){
            rdNum = rd.nextInt(45) + 1;
            lotto[i] = rdNum;
            for(int j = 0; j < i; j++){
                if(lotto[j] == lotto[i]){
                    i--;
                    break;
                }
            }
        }
        for(int i = 0; i < lotto.length; i++){
            System.out.printf("%2d ", lotto[i]);
        }

    }
}