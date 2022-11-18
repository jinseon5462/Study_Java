package exam;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/*
1. 회원관리 프로그램 개발을 위한 회원클래스(MemberVO)를 작성하시오.
2. 회원관리를 위한 CRUD기능을 명시한 인터페이스 (IMemberService)
3. 인터페이스 구현체로써의 서비스 클래스(MemberServiceImpl)
4. DB용 Map<String, MemberVO>를 멤버로 갖는 클래스를 작성하시오
 */
public class MemberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberServiceImpl service = new MemberServiceImpl();

        do{
            service.loadDB();
            System.out.println("\n============================================ver 1.0============================================");
            System.out.println("\n1. 회원가입 2. 조회하기 3. 회원목록 조회 4. 회원정보 수정 5. 회원정보 삭제 0. 종료하기");
            System.out.print("\n메뉴를 선택하세요 : ");
            int select = sc.nextInt();
            sc.nextLine();
            switch (select){
                case 1:
                    //회원가입
                    System.out.println("\n============회원가입 메뉴============");
                    System.out.print("\n아이디를 입력해주세요 : ");
                    String id = sc.nextLine();
                    System.out.print("\n비밀번호를 입력해주세요 : ");
                    String pw = sc.nextLine();
                    System.out.print("\n이름을 입력해주세요 : ");
                    String name = sc.nextLine();
                    System.out.print("\n전화번호를 입력해주세요 : ");
                    String tel = sc.nextLine();
                    MemberVO member = new MemberVO(id, pw, name, tel);
                    service.regist(member);
                    break;
                case 2:
                    //조회하기
                    System.out.println("\n============정보조회 메뉴============");
                    System.out.print("\n조회하실 회원의 아이디를 입력해주세요 : ");
                    String searchId = sc.nextLine();
                    MemberVO resultMember = service.getMember(searchId);
                    System.out.println(resultMember);
                    break;
                case 3:
                    //회원목록 조회
                    System.out.println("\n============회원목록 조회 메뉴============");
                    ArrayList<MemberVO> list = service.getList();
                    for(MemberVO m : list){
                        System.out.println(m);
                    }
                    break;
                case 4:
                    // 회원정보 수정
                    System.out.println("\n============회원목록 조회 메뉴============\n");
                    System.out.print("수정할 회원의 아이디를 입력하세요 : ");
                    String updateId = sc.nextLine();
                    System.out.print("수정할 회원의 비밀번호를 입력하세요 : ");
                    String updatePw = sc.nextLine();
                    System.out.print("수정할 회원의 이름을 입력하세요 : ");
                    String updateName = sc.nextLine();
                    System.out.print("수정할 회원의 전화번호를 입력하세요 : ");
                    String updateTel = sc.nextLine();
                    MemberVO m = new MemberVO(updateId, updatePw, updateName, updateTel);
                    service.modify(m);
                    break;
                case 5:
                    // 회원정보 삭제
                    System.out.println("\n============회원정보 삭제 메뉴============");
                    System.out.print("삭제할 아이디를 입력하세요 : ");
                    String removeId = sc.nextLine();
                    service.remove(removeId);
                    break;
                case 0:
                    service.saveDB();
                    System.out.println("객체정보를 저장하고 종료합니다...");
                    System.exit(0);
            }
        }while(true);
    }
}
