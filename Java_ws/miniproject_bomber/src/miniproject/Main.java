package miniproject;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MemberService service = new MemberService();
        int select = -1;

        do{
            System.out.println("\n============폭탄게임 ver1.0============");
            System.out.println("\n1. 로그인 하기   2. 회원 가입하기");
            System.out.print("\n메뉴를 선택해주세요 : ");
            select = sc.nextInt();
            sc.nextLine();
            switch (select){
                case 1:
                    // 로그인
                    boolean tf = true;
                    while(tf){
                        System.out.println("\n==========로그인 메뉴==========\n");
                        System.out.print("아이디를 입력하세요 : ");
                        String loginId = sc.nextLine();
                        System.out.print("\n비밀번호를 입력하세요 : ");
                        String loginpw = sc.nextLine();
                        int result = service.loginCheck(loginId, loginpw);
                        if(result == 1){
                            System.out.println("\n로그인 성공!");
                            System.out.println("\n======================폭탄게임 ver1.0======================");
                            System.out.println("\n1. 게임 시작하기  2. 점수 보기  3. 전체점수 보기  0. 게임종료");
                            System.out.print("\n메뉴를 선택해주세요 : ");
                            int selectMenu = sc.nextInt();
                            sc.nextLine();
                            switch (selectMenu){
                                case 1:
                                    System.out.println("좌표가 숨어있습니다! 폭격하세요!");

                                    for(int i = 0; i < 5; i++){
                                        for(int j = 0; j < 5; j++){
                                            System.out.print("O  ");
                                        }
                                        System.out.println();
                                    }

                                    System.out.print("\n폭격좌표 X를 입력해주세요 : ");
                                    int x = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("\n폭격좌표 Y를 입력해주세요 : ");
                                    int y = sc.nextInt();
                                    sc.nextLine();
                                    break;
                                case 2:
                                    System.out.println("=============개인점수 조회=============");
                                    System.out.print("닉네임을 입력해주세요 : ");
                                    String searchName = sc.nextLine();
                                    Member m = service.getScore(searchName);
                                    break;
                                case 3:
                                    break;
                                case 0:
                                    System.out.println("게임을 종료하고 초기화면으로 돌아갑니다...");
                                    tf = false;
                                    break;
                            }
                        }else{
                            System.out.println("\n아이디, 비밀번호 오류입니다...");
                        }
                    }
                    break;
                case 2:
                    // 회원가입하기
                    System.out.println("\n==========회원가입 메뉴==========");
                    System.out.print("\n아이디를 입력하세요 : ");
                    String id = sc.nextLine();
                    int result = service.checkId(id);
                    if(result == 1){
                        System.out.println("중복된 아이디입니다. 다른 아이디를 입력해주세요.");
                        continue;
                    }else{
                        System.out.println("\n사용가능한 아이디입니다!");
                    }
                    System.out.print("\n비밀번호를 입력하세요 : ");
                    String pw = sc.nextLine();
                    System.out.print("사용하실 닉네임을 입력하세요 : ");
                    String name = sc.nextLine();
                    Member member = new Member(name, id, pw);
                    service.regMemeber(member);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다...");
                    System.exit(0);

            }
        }while(true);
    }
}
