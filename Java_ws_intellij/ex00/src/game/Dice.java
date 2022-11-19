package game;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] A = new int[6];
        int diceNum;

        for(int i = 0; i < 100; i++){
            diceNum = rd.nextInt(6) + 1;
            if(diceNum == 1){
                A[0]++;
            }else if(diceNum == 2){
                A[1]++;
            }else if(diceNum == 3){
                A[2]++;
            }else if(diceNum == 4){
                A[3]++;
            }else if(diceNum == 5){
                A[4]++;
            }else if(diceNum == 6){
                A[5]++;
            }
        }
        for(int i = 0; i < 6; i++){
            System.out.printf("A[%d] : %d\n", i, A[i]);
        }
    }
}