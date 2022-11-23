package game;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {
    public static void main(String[] args) {
        // 가위 바위 보 게임
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        do {
            System.out.println("1. 가위 2. 바위 3. 보");
            System.out.print("Input Num >> ");
            int my = sc.nextInt();
            int com = rd.nextInt(3) + 1;

            if (my >= 1 && my <= 3) {
                switch(my) {	// 나
                    case 1 :
                        System.out.println("Me : 가위");
                        break;
                    case 2 :
                        System.out.println("Me : 바위");
                        break;
                    case 3 :
                        System.out.println("Me : 보");
                        break;
                    default :
                        System.out.println("입력오류...");
                }
                switch(com) {	// 컴퓨터
                    case 1 :
                        System.out.println("Com : 가위");
                        break;
                    case 2 :
                        System.out.println("Com : 바위");
                        break;
                    case 3 :
                        System.out.println("Com : 보");
                        break;
                }

                int result = (my-com);

                if(result==0) {
                    System.out.println("비겼습니다.");
                    System.out.println();
                    cnt++;
                }else if(result == 1 || result==-2){
                    System.out.println("이겼습니다!");
                    System.out.println();
                    break;
                }else if(result == -1 || result == 2){
                    System.out.println("졌습니다...");
                    System.out.println();
                    cnt++;
                }
            }else{
                System.out.println("입력 오류");
            }
        }while(cnt < 10);
        System.out.println(cnt + 1 + "번만에 이겼습니다!");
    }
}