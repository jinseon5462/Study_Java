package practice;

import java.util.Scanner;

/*
1. 로그인 하기 0. 게임종료

1. 전체랭킹조회 2. 개인점수 조회
 */
public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();
        boolean loop = true;

        do{
            //service.loadDB();
            System.out.println("\n-------------- [ Up&Down ver1.0 ] --------------");
            System.out.println("\n1. 회원가입하기    2. 로그인하기    0. 종료하기");
            System.out.print("\n메뉴를 선택해주세요 : ");
            int select = sc.nextInt();
            sc.nextLine();

            switch (select){
                case 1: // 회원가입 메뉴
                    boolean loop1 = true;
                    do {
                        System.out.println("\n------------------------------------------------");
                        System.out.print("\n사용하실 아이디를 입력해주세요 : ");
                        String id = sc.nextLine();
                        int checkId = service.checkId(id);
                        if (checkId == 1) {
                            System.out.println("\n[ 중복된 아이디입니다! 다른 아이디를 입력해주세요 ]");
                            continue;
                        } else {
                            System.out.println("\n[ 사용가능한 아이디입니다!! ]");

                        }
                        System.out.print("\n사용하실 비밀번호를 입력해주세요 : ");
                        String pw = sc.nextLine();
                        System.out.print("\n사용하실 닉네임을 입력해주세요 : ");
                        String name = sc.nextLine();
                        MemberVO member = new MemberVO(id, pw, name);
                        service.regist(member);
                        loop1 = false;
                        System.out.println("\n[ 회원가입이 완료되었습니다!! ]");
                    }while (loop1);
                    break;
                case 2: // 로그인 메뉴
                    boolean loginLoop = true;
                    do {
                        System.out.println("\n---------------- [ 로그인 메뉴 ] ----------------");
                        System.out.println("\n1. 로그인 하기   0. 메인메뉴로 돌아가기");
                        System.out.print("\n메뉴를 선택해주세요 : ");
                        int select2 = sc.nextInt();
                        sc.nextLine();
                        switch (select2){
                            case 1: // 로그인 하기
                                System.out.println("\n로그인하기를 선택하셨습니다.");
                                boolean loop2 = true;
                                do {
                                    System.out.print("\n아이디를 입력하세요 : ");
                                    String id = sc.nextLine();
                                    System.out.print("\n비밀번호를 입력하세요 : ");
                                    String pw = sc.nextLine();
                                    int loginResult = service.loginCheck(id, pw);
                                    if (loginResult == 1){
                                        System.out.println("\n로그인 성공!!\n");
                                        GameUI ui = new GameUI();
                                        loop2 = ui.showGameUI(service, id);
                                    }else {
                                        System.out.println("\n로그인 실패...아이디와 비밀번호를 다시 입력해주세요.");
                                    }
                                }while (loop2);
                                break;
                            case 0: // 메인메뉴로 돌아가기
                                System.out.println("\n메인메뉴로 돌아갑니다...");
                                loginLoop = false;
                                break;
                            default:
                                System.out.println("잘못 입력하셨습니다...");
                                break;
                        }
                    }while (loginLoop);
                    break;
                case 0:
                    service.saveDB();
                    System.out.println("\n게임을 종료합니다...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n잘못 입력하셨습니다...");
            }
        }while(loop);
    }
}
