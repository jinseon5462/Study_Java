package integrated;

import bbs.BoardService;
import bbs.BoardVO;
import member.MemberService;
import member.MemberVO;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. 비회원 2. 회원 3. 관리자
 */
public class IntegratedMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService service = new MemberService();
        BoardService bs = new BoardService();

        String id = null;
        String pw = null;
        int select = 0;

        do{
            System.out.println("\n==========게시판 ver1.0==========");
            System.out.println("\n1. 비회원    2. 회원    3. 관리자\n");
            System.out.print("메뉴를 선택해주세요 : ");
            select = sc.nextInt();
            switch (select){
                // 비회원 메뉴
                case 1:
                    System.out.println("\n==========비회원 메뉴==========");
                    System.out.println("\n비회원은 게시글 읽기만 가능합니다.\n게시글을 작성하려면 회원가입 부탁드립니다.\n");
                    System.out.println("1. 회원가입  2. 게시물 전체보기  3. 작성자로 검색하기");
                    System.out.print("\n메뉴를 선택해주세요 : ");
                    select = sc.nextInt();
                    sc.nextLine();
                    switch (select) {
                        // 비회원 회원가입
                        case 1:
                            System.out.println("\n==========회원가입 메뉴==========\n");
                            System.out.print("아이디를 입력하세요 : ");
                            id = sc.nextLine();
                            int checkId = service.checkId(id);
                            if (checkId == 0) {
                                System.out.println("\n중복된 아이디입니다.");
                                System.out.println("다른 아이디를 입력해주세요.");
                                continue;
                            } else {
                                System.out.println("사용가능한 아이디입니다!\n");
                            }
                            System.out.print("비밀번호를 입력하세요 : ");
                            pw = sc.nextLine();
                            System.out.print("이름을 입력하세요 : ");
                            String name = sc.nextLine();
                            System.out.print("전화번호를 입력하세요 : ");
                            String tel = sc.nextLine();
                            MemberVO member = new MemberVO(id, pw, name, tel);
                            service.regMember(member);
                            break;
                        // 비회원 전체 게시글 조회
                        case 2:
                            System.out.println("\n==========전체게시글 목록==========\n");
                            ArrayList<BoardVO> boardList = bs.getBoardList();
                            for (BoardVO b : boardList) {
                                System.out.println(b);
                            }
                            System.out.println("\n==================================\n");
                            break;
                        // 비회원 게시글 검색
                        case 3:
                            String searchWriter = null;
                            System.out.println("\n==========================게시글 검색=========================");
                            System.out.print("\n작성자를 입력해주세요 : ");
                            searchWriter = sc.nextLine();
                            ArrayList<BoardVO> bList = bs.getBoard(searchWriter);

                            for (BoardVO board : bList) {
                                System.out.println(board);
                            }
                            break;
                    }
                    break;
                // 회원메뉴
                case 2:
                    do{
                        System.out.println("\n==========회원 로그인==========\n");
                        System.out.println("1. 로그인하기  2. 돌아가기");
                        System.out.print("\nSelect Menu : ");
                        select = sc.nextInt();
                        sc.nextLine();
                        if(select == 1){
                            System.out.print("\n아이디를 입력하세요 : ");
                            String loginId = sc.nextLine();
                            System.out.print("\n비밀번호를 입력하세요 : ");
                            String loginPw = sc.nextLine();
                            int loginResult = service.login(loginId, loginPw);
                            if(loginResult == 1){
                                System.out.println("\n로그인 성공!");
                                // 게시글 서비스
                                while(true){
                                    System.out.println("\n============================게시판============================");
                                    System.out.println("\n[ 1. 게시글 작성  2. 게시글 검색  3. 게시글 전체보기  4. 게시글 수정  5. 게시글 삭제 ]");
                                    System.out.print("\n메뉴를 선택하세요 : ");
                                    select = sc.nextInt();
                                    sc.nextLine();

                                    switch (select){
                                        case 1:

                                    }
                                }
                                //break;
                            }else{
                                System.out.println("\n로그인 실패...");
                                System.out.println("아이디와 비밀번호를 확인해주세요.");
                                continue;
                            }

                        }else{
                            break;
                        }
                    }while(true);
                    break;
                case 3:
                    // 관리자

            }
        }while(true);


    }
}
