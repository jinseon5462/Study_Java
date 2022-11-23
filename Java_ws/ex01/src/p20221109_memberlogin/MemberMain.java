package p20221109_memberlogin;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService service = new MemberService();

        int selMenu = -1;
        char answer = ' ';
        while(selMenu != 0) {
            System.out.println("----회원관리시스템 v1.0----");
            System.out.println("1. 회원등록\t 2. 회원목록조회\t 3. 회원조회\t 0. 종료");

            System.out.print("선택 >> ");
            selMenu = sc.nextInt();
            sc.nextLine();

            switch(selMenu) {
                case 1:	//회원등록
                    do {

                        System.out.println("\n\n---- 회원 정보 등록 ----");
                        System.out.print("아이디를 입력하세요 : ");
                        String id = sc.nextLine();
                        if(service.checkId(id) == 0) {
                            System.out.println(">>>동일한 아이디가 존재합니다.<<<");
                            continue;
                        }else {
                            System.out.println(">>아이디 사용가능<<");
                        }
                        System.out.print("패스워드를 입력하세요 : ");
                        String pw = sc.nextLine();
                        System.out.print("이름을 입력하세요 : ");
                        String name = sc.nextLine();
                        System.out.print("연락처를 입력하세요 : ");
                        String tel = sc.nextLine();

                        MemberVO member = new MemberVO(id, pw, name, tel);

                        service.regMember(member);

                        System.out.println("계속? (y/any)");
                        answer = sc.nextLine().charAt(0);
                    }while(answer == 'y' || answer == 'Y');
                    break;
                case 2: //회원목록조회
                    ArrayList<MemberVO> list = service.getMemberList();

                    for(MemberVO m : list) {
                        System.out.println(m);
                    }
                    System.out.println("*****서브메뉴*****");
                    System.out.println("1. 회원정보 수정\t 2. 회원정보 삭제");
                    int subMenu = sc.nextInt();
                    sc.nextLine();
                    switch(subMenu) {
                        case 1: //회원정보 수정
                            System.out.print("수정할 회원의 아이디를 입력하세요 >> ");
                            String _id = sc.nextLine();
                            System.out.print("수정할 회원의 패스워드를 입력하세요 >> ");
                            String _pw = sc.nextLine();
                            System.out.print("수정할 회원의 이름을 입력하세요 >> ");
                            String _name = sc.nextLine();
                            System.out.print("수정할 회원의 연락처를 입력하세요 >> ");
                            String _tel = sc.nextLine();
                            MemberVO member = new MemberVO(_id, _pw, _name, _tel);
                            service.modify(member);
                            break;
                        case 2: //회원정보 삭제
                            System.out.print("삭제할 id를 입력하세요 >> ");
                            _id = sc.nextLine();
                            service.removeMember(_id);
                            break;
                        default:
                            System.out.println("잘못 입력했다규~");
                            break;
                    }
                    break;
                case 3: //회원조회

                    MemberVO mem = service.getMember("aaa");
                    System.out.println(mem);
                    break;

                case 0: //종료
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
            }
        }
        sc.close();
    }

}