package miniproject;

import java.util.Random;
import java.util.Scanner;

public class BomberUI {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

    int targetX = rd.nextInt(5);
    int targetY = rd.nextInt(5);

    char[][] a = new char[5][5];

    // 게임 메인메뉴
    public void showMainMenu(){
        System.out.println("======================폭탄게임 ver1.0======================");
        System.out.println("1. 게임 시작하기  2. 점수 보기  3. 전체점수 보기 0. 게임종료");
        System.out.print("메뉴를 선택해주세요 : ");
        int select = sc.nextInt();
        sc.nextLine();
        if(select == 1){

        }

        BomberUI ui = new BomberUI();
        ui.showPan();
        System.out.print("\n폭격좌표 X를 입력해주세요 : ");
        int x = sc.nextInt();
        System.out.print("\n폭격좌표 Y를 입력해주세요 : ");
        int y = sc.nextInt();
    }
    // 게임판 출력
    public void showPan(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("O  ");
            }
            System.out.println();
        }
    }

    public void bomb(int x, int y){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(targetX == x && targetY == y){
                    System.out.println("명중!!");
                    break;
                }
            }
        }
    }




}
