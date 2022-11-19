package basic01;

import java.util.Random;

public class Array03 {
    public static void main(String[] args){

        Random rd = new Random();
        int[] A = new int[25];
        int[][] B = new int[5][5];
        int i, j, rdNum;
        int n = 0;

        for(i = 0; i < 25; i++){
            rdNum = rd.nextInt(25) + 1;
            A[i] = rdNum;
            for(j = 0; j < i; j++){
                if(A[i] == A[j]){
                    i--;
                    break;
                }
            }
        }
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                B[i][j] = A[n];
                n++;
            }
        }
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println();
        }
    }
}