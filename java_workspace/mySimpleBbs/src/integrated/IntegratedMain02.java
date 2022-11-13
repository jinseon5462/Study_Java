package integrated;

import java.util.Scanner;

public class IntegratedMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UI ui = new UI();
        int select;
        
        do{
            ui.showMainMenu();  // 메인메뉴
            select = sc.nextInt();
            switch (select){
                case 1:
                    // 비회원 메뉴
                   ui.showNonMemberMenu();
                   break;
                case 2:
                    // 회원 메뉴
                    ui.showMemberMenu();
                    break;
                case 3:
                    // 관리자 메뉴
                    ui.showManagerMenu();
                    break;
                case 0:
                    // 프로그램 종료
                    System.out.println("\n프로그램을 종료합니다...");
                    break;
            }
        }while(select != 0);
    }
}