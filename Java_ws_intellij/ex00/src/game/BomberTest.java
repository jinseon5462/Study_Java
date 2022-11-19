package game;

import java.util.Scanner;

public class BomberTest {
    public static void main(String[] args){
        char[][] map = new char[5][5];
        int targetX, targetY;

        // 초기 판 세팅
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map.length; j++){
                map[i][j] = 'P';
            }
        }

        // 좌표입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("Input X >> ");
        targetX = sc.nextInt();
        System.out.print("Input Y >> ");
        targetY = sc.nextInt();

        // 판에 좌표대입
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map.length; j++){
                if(i == targetX && j == targetY){
                    map[i][j] = 'O';
                }
            }
        }

        int count = 1;

        do{
            System.out.println("\n-----폭격좌표 입력-----\n");
            // 초기값 출력
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    System.out.printf("%3c", map[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            Bomber b1 = new Bomber(map);

            System.out.print("Input Target X >> ");
            int x = sc.nextInt();
            System.out.print("Input Target Y >> ");
            int y = sc.nextInt();

            boolean boom = b1.dropBomb(x, y);

            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    if(i == x && j == y){
                        map[i][j] = 'X';
                    }
                }
            }

            if(boom == true){
                break;
            }
            b1.showInfo();
            count++;
        }while(count < 10);
    }

}