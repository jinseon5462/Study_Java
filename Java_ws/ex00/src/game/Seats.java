package game;

import java.util.Scanner;

public class Seats {
    public static void main(String[] args) {
        int i = 0;
        int cnt = 0;
        int seatNum;
        int[] seats = new int[5];
        Scanner sc = new Scanner(System.in);


        while(cnt < 5){
            System.out.println("----예약현황----");
            System.out.println("---------------");
            System.out.println("  1  2  3  4  5");
            System.out.println("----------------");
            for(i = 0; i < 5; i++){
                System.out.printf("%3d", seats[i]);
            }
            System.out.println("좌석을 선택하세요 >> ");
            seatNum = sc.nextInt();
            if(seats[seatNum - 1] == 0){
                seats[seatNum - 1] = 1;
                System.out.println("예약되었습니다!");
                cnt++;
            }else{
                System.out.println("이미 예약되었습니다.");
            }

        }
        System.out.println("감사합니다. 매진되었습니다!");
        for(i = 0; i < 5; i++){
            System.out.printf("%d", seats[i]);
        }
    }
}