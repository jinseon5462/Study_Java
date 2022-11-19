package p20221101;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String checkMoney;
        int selectMenu;
        int money = 0;
        String yesOrNo = "";
        int addMoney;

        System.out.print("금액을 지불해주세요 : ");
        checkMoney = sc.nextLine();
        do{

            for(int i = 0; i < checkMoney.length(); i++){
                if(checkMoney.charAt(i) >= '0' && checkMoney.charAt(i) <= '9'){
                    money = Integer.parseInt(checkMoney);
                }else{
                    System.out.println("불량주화입니다...");
                    break;
                }
            }

            if(money >= 1200){
                System.out.println("==========메뉴==========");
                System.out.println("1. 콜라(1200)  2. 실론티(1000)  3. 물(800)");
            }else if(money >= 1000){
                System.out.println("==========메뉴==========");
                System.out.println("2. 실론티(1000)  3. 물(800)");
            }else if(money >= 800){
                System.out.println("==========메뉴==========");
                System.out.println("3. 물(800)");
            }else{
                System.out.println("금액이 부족합니다.");
                System.out.println("추가로 지불하시겠습니까?");
                System.out.println("(y/n)");
                yesOrNo = sc.nextLine();
            }

            if(yesOrNo.equals("y")){
                System.out.print("추가금액을 입력하세요 : ");
                addMoney = sc.nextInt();
                money += addMoney;
            }else if(yesOrNo.equals("n")){
                break;
            }else{
                System.out.println("입력 오류입니다.\n");
            }

        }while(true);
    }
}