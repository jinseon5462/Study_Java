package p20221103_vendingmachine;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int money = 0;

        System.out.print("금액을 지불하세요 : ");
        String inputMoney = sc.nextLine();
        while(true){
            // 불량주화 판별
            for(int i = 0; i < inputMoney.length(); i++){
                if(inputMoney.charAt(i) >= '0'&& inputMoney.charAt(i) <= '9'){
                    money = Integer.parseInt(inputMoney);
                }else{
                    System.out.println("불량주화입니다.");

                    break;
                }
            }

            // 메뉴 선택
            if(money >= 1200){
                System.out.println("\n==========Menu==========");
                System.out.println("1. 콜라(1200)\t2. 실론티(1000)\t3. 물(800)");
            }else if(money >= 1000){
                System.out.println("\n==========Menu==========");
                System.out.println("2. 실론티(1000)\t3. 물(800)");
            }else if(money >= 800){
                System.out.println("\n==========Menu==========");
                System.out.println("3. 물(800)");
            }else{
                System.out.print("\n금액이 부족합니다. 금액을 추가로 지불하시겠습니까 (y/n) : ");
                String yn = sc.nextLine();
                if(yn.charAt(0) == 'y' || yn.charAt(0) == 'Y'){
                    System.out.print("추가금액을 입력하세요 : ");
                    int exCharge = sc.nextInt();
                    money += exCharge;
                }else if(yn.charAt(0) == 'n' || yn.charAt(0) == 'N'){
                    System.out.println("감사합니다 다음에 또 오세요...");
                    break;
                }
            }
        };
    }
}