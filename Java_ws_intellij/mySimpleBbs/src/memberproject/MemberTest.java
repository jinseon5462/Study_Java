package memberproject;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MemberService service = new MemberService();
        String answer = null;
        String searchMemberId;
        boolean tf = true;

        // 프로그램
        while(tf) {
            System.out.println("\n========================회원관리 시스템========================");
            System.out.println("\n[ 1.회원등록 | 2.회원정보 조회 | 3.회원목록 조회 | 4. 로그인 | 0.시스템종료 ]");
            System.out.print("\n메뉴를 선택하세요 : ");
            int selectMenu = sc.nextInt();
            sc.nextLine();

            switch(selectMenu) {
                case 1:
                    // 회원정보 등록
                    do {
                        System.out.println("\n=========================회원정보 등록=========================\n");
                        System.out.print("아이디를 입력하세요 : ");
                        String id = sc.nextLine();
                        int checkId = service.checkId(id);
                        if(checkId == 0){
                            System.out.println("\n중복된 아이디입니다.");
                            System.out.println("다른 아이디를 입력해주세요.");
                            continue;
                        }else{
                            System.out.println("사용가능한 아이디입니다!\n");
                        }
                        System.out.print("비밀번호를 입력하세요 : ");
                        String pw = sc.nextLine();
                        System.out.print("이름을 입력하세요 : ");
                        String name = sc.nextLine();
                        System.out.print("전화번호를 입력하세요 : ");
                        String tel = sc.nextLine();
                        MemberVO member = new MemberVO(id, pw, name, tel);
                        service.regMember(member);
                        System.out.println("\n추가로 입력하시겠습니까?");
                        System.out.print("\nInput Yes or AnyKey : ");
                        answer = sc.nextLine();
                    }while(answer.charAt(0) == 'Y' || answer.charAt(0) == 'y');
                    break;
                case 2:
                    // 회원정보 조회
                    do{
                        System.out.println("\n=========================회원정보 조회=========================\n");

                        System.out.print("조회할 회원의 아이디를 입력하세요 : ");
                        searchMemberId = sc.nextLine();
                        System.out.println();
                        System.out.println("[조회목록]");
                        MemberVO member = service.getMember(searchMemberId);
                        System.out.println(member);
                        System.out.println("\n추가로 조회하시겠습니까?");
                        System.out.print("\nInput Yes or Anykey : ");
                        answer = sc.nextLine();
                    }while(answer.charAt(0) == 'Y' || answer.charAt(0) == 'y');
                    break;
                case 3:
                    // 회원목록 조회
                    System.out.println("\n=========================회원목록 조회=========================\n");
                    ArrayList<MemberVO> list = service.getMemberList();
                    for(MemberVO member : list) {
                        System.out.println(member);
                    }
                    System.out.println("\n==========================추가 메뉴==========================\n");
                    System.out.println("1. 회원정보 수정  2. 회원정보 삭제");
                    System.out.print("Select Menu : ");
                    selectMenu = sc.nextInt();
                    sc.nextLine();
                    switch (selectMenu) {
                        // (추가메뉴) 회원정보 수정
                        case 1:
                            System.out.println("\n=========================회원정보 수정=========================\n");
                            System.out.print("수정할 아이디를 입력하세요 : ");
                            String changeId = sc.nextLine();
                            System.out.print("수정할 비밀번호를 입력하세요 : ");
                            String changePw = sc.nextLine();
                            System.out.print("수정할 이름을 입력하세요 : ");
                            String changeName = sc.nextLine();
                            System.out.print("수정할 전화번호를 입력하세요 : ");
                            String changeTel = sc.nextLine();
                            MemberVO member = new MemberVO(changeId, changePw, changeName, changeTel);
                            service.updateMember(member);
                            break;
                        // (추가메뉴) 회원정보 삭제
                        case 2:
                            System.out.println("\n=========================회원정보 삭제=========================\n");
                            System.out.print("삭제할 회원의 아이디를 입력하세요 : ");
                            String deleteId = sc.nextLine();
                            service.removeMember(deleteId);
                            break;
                        default:
                            System.out.println("입력오류입니다.");
                            break;
                    }
                    break;
                case 4:
                    // 로그인
                    do{
                        // 로그인 메뉴 선택
                        System.out.println("\n=========================로그인=========================\n");
                        System.out.println("1. 로그인하기  2. 돌아가기");
                        System.out.print("\nSelect Menu : ");
                        selectMenu = sc.nextInt();
                        sc.nextLine();
                        if(selectMenu == 1){
                            System.out.print("\n아이디를 입력하세요 : ");
                            String loginId = sc.nextLine();
                            System.out.print("\n비밀번호를 입력하세요 : ");
                            String loginPw = sc.nextLine();
                            int loginResult = service.login(loginId, loginPw);
                            if(loginResult == 1){
                                System.out.println("\n로그인 성공!");
                                break;
                            }else{
                                System.out.println("\n로그인 실패...");
                                System.out.println("아이디와 비밀번호를 확인해주세요.");
                            }
                        }else{
                            break;
                        }
                    }while(true);
                    break;
                case 0:
                    tf = false;
                    System.out.println("\n시스템을 종료합니다...");
                    break;
            }
        }

    }
}