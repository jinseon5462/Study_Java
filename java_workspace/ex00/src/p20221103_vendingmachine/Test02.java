package p20221103_vendingmachine;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean tf = true;
        String inMoney;
        int money = 0;
        int selectMenu;

        while(tf){
            System.out.print("금액을 입력하세요 : ");
            inMoney = sc.nextLine();

            for(int i = 0; i < inMoney.length(); i++){
                if(inMoney.charAt(i) == '0' && inMoney.charAt(i) == '9'){
                    money = Integer.parseInt(inMoney);
                }else{
                    System.out.println("불량주화입니다.");
                }
            }

            if(money >= 1200){
                System.out.println("====메뉴====");
                System.out.println("1. 콜라(1200) 2. 실론티(1000) 3. 물(800)");
            }else if(money >= 1000){
                System.out.println("====메뉴====");
                System.out.println("2. 실론티(1000) 3. 물(800)");
            }else if(money >= 800){
                System.out.println("====메뉴====");
                System.out.println("3. 물(800)");
            }
        }
    }
}