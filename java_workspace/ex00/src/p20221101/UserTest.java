package p20221101;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        String checkMoney;
        String yesOrNo;
        int moreCharge;

        System.out.print("\n금액을 지불해주세요 : ");
        checkMoney = sc.nextLine();
        do{
            int money = user.insertMoney(checkMoney);
            while(money < 800){
                System.out.println("금액이 부족합니다.");
                System.out.println("금액을 추가로 지불하시겠습니까?");
                System.out.print("(y/n) : ");
                yesOrNo = sc.next();

                if(yesOrNo.equals("y")){
                    System.out.print("추가금액을 입력하세요 : ");
                    moreCharge = sc.nextInt();
                    money += moreCharge;
                }else if(yesOrNo.equals("n")){
                    break;
                }
            }


            System.out.print("\n메뉴를 선택해주세요 : ");
            int selectMenu = sc.nextInt();
            int exchange = user.selectMenu(selectMenu);
            System.out.println("거스름돈은 " + exchange + "원입니다.");
            if(exchange >= 0){
                break;
            }
        }while(true);


    }
}