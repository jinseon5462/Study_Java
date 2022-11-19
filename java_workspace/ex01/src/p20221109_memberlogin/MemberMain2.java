package p20221109_memberlogin;

import java.util.Scanner;

public class MemberMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberUI ui = new MemberUI();

        int selMenu = -1;
        char answer = ' ';

        while(selMenu != 0) {
            ui.showMainMenuUI();
            selMenu = sc.nextInt();
            sc.nextLine();

            switch(selMenu) {
                case 1:
                    ui.regist();
                    break;
                case 2:
                    ui.searchMemberList();
                    int n = ui.showListSubMenu();
                    switch(n) {
                        case 1:
                            ui.showUpdateUI();
                            break;
                        case 2:
                            ui.showDeleteUI();
                            break;
                        case 3:
                            continue;
                    }
                    break;
                case 3:
                    ui.showSearchUI();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
            }
        }
    }

}
