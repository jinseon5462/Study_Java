package member;

import java.io.FileOutputStream;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService service = new MemberService();
        String path = "/Users/jinseon/dev/Java_ws/myMember/src/";

        do{
            System.out.println("============================================");
            System.out.println("\n1. 회원가입 2. 조회하기 0. 종료하기");
            System.out.print("\n메뉴를 선택하세요 : ");
            int select = sc.nextInt();
            sc.nextLine();
            switch (select){
                case 1:
                    System.out.println("\n====회원가입 메뉴====");
                    System.out.print("\n아이디를 입력해주세요 : ");
                    String id = sc.nextLine();
                    System.out.print("\n비밀번호를 입력해주세요 : ");
                    String pw = sc.nextLine();
                    System.out.print("\n이름을 입력해주세요 : ");
                    String name = sc.nextLine();
                    MemberVO member = new MemberVO(id, pw, name);
                    service.regist(member);
                    FileOutputStream fos = new FileOutputStream("/Users/jinseon/dev/Java_ws/")
                    MemberDAO dao = new MemberDAO();

                    break;
                case 2:
                    System.out.println("\n====정보조회 메뉴====");
                    System.out.print("\n조회하실 회원의 아이디를 입력해주세요 : ");
                    String searchId = sc.nextLine();
                    MemberVO resultMember = service.getMember(searchId);
                    System.out.println(resultMember);
                    break;
                case 0:
                    System.out.println("종료합니다...");
                    System.exit(0);
            }

        }while(true);
    }
}
