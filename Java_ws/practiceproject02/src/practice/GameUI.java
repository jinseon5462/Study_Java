package practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameUI {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public boolean showGameUI(Service service, String id){
        boolean out = true;
        boolean loop = true;
        int score = 0;

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();
        System.out.println(service.getMemberName(id) + "님 어서오세요!!");
        do {
            System.out.println("\n---------------------------------- [ 게임 메뉴 ] ----------------------------------");
            System.out.println("\n1. 게임 시작하기   2. 전체 점수 조회하기   3. 내 점수 조회하기   0. 로그아웃하기");
            System.out.print("\n메뉴를 선택해주세요 : ");
            int select3 = sc.nextInt();
            int randomNum = rd.nextInt(100) + 1;

            switch (select3){
                case 1:
                    // 게임 시작
                    System.out.println("\n---------------- 👍 Welcom to Up&Down Game! 👎 ----------------");
                    System.out.println("\n [ 랜덤 숫자를 맞춰보세요!! ]");
                    System.out.println("\n [ 기회는 총 10번!! ]");
                    System.out.println("\n [ 범위는 1 ~ 100(정수) 까지!! ]");
                    System.out.println("\n [ 랜덤 숫자가 지정되었습니다! ]");
                    System.out.println("\n------------------------------------------------------------------");
                    for(int i = 1; i < 11; i++){
                        System.out.println("\n [ 남은 기회 " + (11 - i) + " ]");
                        if(i == 10){
                            System.out.println("마지막 기회입니다...");
                        }
                        System.out.print("\n숫자를 입력해주세요 : ");
                        int playerInput = sc.nextInt();
                        sc.nextLine();
                        System.out.println("\n------------------------------------------------------------------");
                        if(randomNum < playerInput){
                            System.out.println("\n입력하신 숫자보다 작은 수 입니다...!");
                        }else if(randomNum > playerInput){
                            System.out.println("\n입력하신 숫자보다 큰 수 입니다...!");
                        }else{
                            System.out.println("\n축하드립니다!! " + i + "번만에 정답!!");
                            if(i > 5){
                                score += 10;
                            }else{
                                score += 20;
                            }
                            break;
                        }
                        if(i >= 10){
                            System.out.println("아쉽게도 기회를 전부 소진하셨습니다...");
                        }

                        //score += (100 - (i * 10));
                    }
                    service.setScore(id, score);
                    score = 0;
                    break;
                case 2:
                    // 전체점수 조회하기
                    ArrayList<MemberVO> list = service.getList();

                    System.out.println("\n----------------------------------------------------------------------------------");
                    System.out.println();
                    for(MemberVO member : list){
                        System.out.println(member);
                    }
                    System.out.println("\n----------------------------------------------------------------------------------");
                    break;
                case 3:
                    // 개인점수 조회
                    MemberVO member = service.getMember(id);
                    System.out.println(member);
                    break;
                case 0:
                    loop = false;
                    out = false;
                    break;
                default:
                    System.out.println("오류입니다. 메뉴를 다시 선택해주세요.");
            }
        }while(loop);
        return out;
    }
}
