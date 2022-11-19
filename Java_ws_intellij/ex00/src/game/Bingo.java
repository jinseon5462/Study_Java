package game;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int[] A = new int[25];
        int[][] B = new int[5][5];
        int n = 0;
        int rdNum;
        int check = 0;
        int bingo = 0;
        int count = 0;

        for(int i = 0; i < 25; i++){
            rdNum = rd.nextInt(25) + 1;
            A[i] = rdNum;
            for (int j = 0; j < i; j++) {
                if (A[i] == A[j]) {
                    i--;
                    break;
                }
            }
        }

        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                B[i][j] = A[n];
                n++;
            }
        }

        // 초기 빙고
        System.out.println("------bingo------");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println();
        }



        while(bingo < 3){
            System.out.print("\nInput Num >>> ");
            int inputNum = sc.nextInt();
            System.out.println();
            // 루프시작 초기화
            count++;
            check = 0;
            bingo = 0;

            //입력숫자와 배열안의 값이 같으면 0 대입
            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    if(B[i][j] == inputNum){
                        B[i][j] = 0;

                    }
                }
            }
            check = 0 ;

            // 가로줄 빙고
            for(int i = 0; i < 5; i++){
                check = 0 ;
                for(int j = 0; j < 5; j++){
                    if(B[i][j] == 0){
                        check++;
                        if(check == 5){
                            bingo++;
                        }
                    }
                }
            }
            // 세로줄 빙고
            for(int i = 0; i < 5; i++){
                check = 0;
                for (int  j = 0; j < 5; j++){
                    if(B[j][i] == 0){
                        check++ ;
                        if(check == 5){
                            bingo++;
                        }
                    }
                }
            }
            check = 0;
            // 왼쪽에서 오는 대각선
            for(int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    if(B[i][j] == 0 && i == j){
                        check++;
                        if(check == 5){
                            bingo++;
                        }
                    }
                }
            }
            check = 0;
            // 오른쪽에서 내려오는 대각선
            for(int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (B[i][j] == 0 && i + j == 4) {
                        check++;
                        if (check == 5) {
                            bingo++;
                        }
                    }
                }
            }
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    System.out.printf("%3d", B[i][j]);
                }
                System.out.println();

            }
            System.out.println("\nBingo : " + bingo);
            System.out.println("----------------");
            if(count == 20){
                break;
            }
        }
        System.out.println();
        System.out.println("게임끝!!!!");
    }
}