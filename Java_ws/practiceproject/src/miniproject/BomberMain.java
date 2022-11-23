package miniproject;

import java.util.Scanner;

public class BomberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService service = new MemberService();
        int select;
        boolean loop = true;
        do{
            // 회원가입
            System.out.println("\n1. 회원가입  2. 로그인  0. 프로그램 종료");
            System.out.print("\n메뉴를 선택해주세요 : ");
            select = sc.nextInt();
            sc.nextLine();

            switch(select) {
                case 1:
                    System.out.println("\n----회원가입 메뉴----");
                    while(true){
                        // 회원가입 메뉴
                        System.out.print("\n아이디를 입력하세요 : ");
                        String regId = sc.nextLine();
                        int regResult = service.checkId(regId);
                        if(regResult == 1){
                            System.out.println("\n[중복된 아이디입니다.]");
                            System.out.println("\n[다른아이디를 사용해주세요.]");
                            continue;
                        }else{
                            System.out.println("\n[사용가능한 아이디입니다!]");
                        }
                        System.out.print("\n비밀번호를 입력하세요 : ");
                        String regPw = sc.nextLine();
                        System.out.print("\n이름을 입력해주세요 : ");
                        String regName = sc.nextLine();
                        MemberVO member = new MemberVO(regId, regPw, regName);
                        service.regMember(member);
                        System.out.println("\n[회원가입이 성공적으로 완료되었습니다!]");
                        break;
                    }
                    break;
                case 2:
                    // 로그인 메뉴
                    System.out.println("\n----로그인 메뉴----");

                    while(loop){
                        System.out.println("\n1. 로그인하기 0. 메인메뉴로 돌아가기");
                        System.out.print("\n메뉴를 선택해주세요 : ");
                        select = sc.nextInt();
                        sc.nextLine();
                        switch (select){
                            case 1:
                                System.out.print("\n[로그인] 아이디를 입력해주세요 : ");
                                String loginId = sc.nextLine();
                                System.out.print("\n[로그인] 비밀번호를 입력해주세요 : ");
                                String loginPw = sc.nextLine();
                                int loginResult = service.loginCheck(loginId, loginPw);
                                if(loginResult == 1){
                                    System.out.println("\n[로그인이 성공적으로 완료되었습니다!]");
                                    break;
                                }else{
                                    System.out.println("\n[아이디 또는 비밀번호 오류입니다.]");
                                    continue;
                                }
                            case 0:
                                System.out.println("[메인메뉴로 돌아갑니다.]");
                                loop = false;
                                break;
                            default:
                                System.out.println("[입력오류입니다. 메뉴를 다시 입력해주세요.]");


                        }
                    }
                case 0:
                    // 프로그램 종료
                    System.out.println("\n프로그램을 종료합니다...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n입력 오류입니다 메뉴를 다시 선택해주쇼");
            }

        }while(true);


    }
}
