package integrated;

import bbs.BoardService;
import bbs.BoardVO;
import member.MemberService;
import member.MemberVO;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    Scanner sc = new Scanner(System.in);
    boolean loopAllStop = true;
    int select;
    MemberService service = new MemberService();
    BoardService bs = new BoardService();

    // 초기메뉴
    public void showMainMenu(){
        System.out.println("\n===============게시판 ver1.0===============");
        System.out.println("\n1. 비회원    2. 회원    3. 관리자    0. 프로그램 종료 \n");
        System.out.print("메뉴를 선택해주세요 : ");
        //int select = sc.nextInt();
    }

    // 비회원 메뉴
    public void showNonMemberMenu(){
        String id = "";
        String pw = "";
        String name = "";
        boolean loop = true;

        while(loop){

            System.out.println("\n====================비회원 메뉴====================");
            System.out.println("\n비회원은 게시글 읽기만 가능합니다.\n게시글을 작성하려면 회원가입 부탁드립니다.\n");
            System.out.println("1. 회원가입  2. 게시물 전체보기  3. 작성자로 검색하기  0. 메인으로 가기");
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
                    name = sc.nextLine();
                    System.out.print("전화번호를 입력하세요 : ");
                    String tel = sc.nextLine();
                    MemberVO member = new MemberVO(id, pw, name, tel);
                    service.regMember(member);
                    System.out.println("\n회원가입이 완료되었습니다!!");
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
                    String searchWriter = "";
                    System.out.println("\n==========================게시글 검색=========================");
                    System.out.print("\n작성자를 입력해주세요 : ");
                    searchWriter = sc.nextLine();
                    ArrayList<BoardVO> bList = bs.getBoard(searchWriter);

                    for (BoardVO board : bList) {
                        System.out.println(board);
                    }
                    break;
                case 0:
                    loop = false;
                    System.out.println("메인메뉴로 갑니다...");
                    break;
            }
        }
    }

    // 회원메뉴
    public void showMemberMenu(){
        do{
            System.out.println("\n==========회원 로그인==========\n");
            System.out.println("1. 로그인하기  2. 돌아가기");
            System.out.print("\nSelect Menu : ");
            select = sc.nextInt();
            sc.nextLine();
            //로그인 하기
            if(select == 1){
                System.out.print("\n아이디를 입력하세요 : ");
                String loginId = sc.nextLine();
                System.out.print("\n비밀번호를 입력하세요 : ");
                String loginPw = sc.nextLine();
                int loginResult = service.login(loginId, loginPw);
                if(loginResult == 1){
                    System.out.println("\n로그인 성공!");
                    // 게시글 서비스
                    int answer;

                    boolean loop2 = true;  // 로그아웃
                    while (loop2) {
                        System.out.println("\n============================게시판============================");
                        System.out.println("\n1. 게시글 작성  2. 게시글 검색  3. 게시글 전체보기  4. 게시글 수정  5. 게시글 삭제 0. 로그아웃하기");
                        System.out.print("\n메뉴를 선택하세요 : ");
                        select = sc.nextInt();
                        sc.nextLine();
                        System.out.println();
                        switch (select) {
                            case 1:
                                // 게시글 작성
                                do {
                                    System.out.println("\n==========================게시글 작성=========================");
                                    System.out.print("\n제목 : ");
                                    String title = sc.nextLine();
                                    System.out.print("내용 : ");
                                    String contents = sc.nextLine();
                                    System.out.print("작성자 : ");
                                    String writer = sc.nextLine();
                                    BoardVO board = new BoardVO(title, contents, writer);
                                    bs.insertBoard(board);

                                    System.out.println("\n추가로 입력하시겠습니까?");
                                    System.out.print("\n1. Yes   2. No\n\n메뉴를 선택해주세요 : ");
                                    answer = sc.nextInt();
                                    sc.nextLine();
                                } while (answer != 2);
                                break;
                            case 2:
                                // 게시글 검색
                                String searchWriter;
                                System.out.println("\n==========================게시글 검색=========================");
                                System.out.print("\n작성자를 입력해주세요 : ");
                                searchWriter = sc.nextLine();
                                ArrayList<BoardVO> bList = bs.getBoard(searchWriter);

                                for (BoardVO board : bList) {
                                    System.out.println(board);
                                }
                                break;
                            case 3:
                                // 게시글 전체보기
                                System.out.println("\n==========================게시글 목록=========================\n");
                                ArrayList<BoardVO> boardList = bs.getBoardList();
                                for(BoardVO b : boardList){
                                    System.out.println(b);
                                }
                                break;
                            case 4:
                                // 게시글 수정
                                System.out.println("\n=============게시글 수정===========");
                                System.out.println("\n1. 제목 수정  2. 내용 수정");
                                System.out.print("\n메뉴를 선택해주세요 : ");
                                select = sc.nextInt();
                                sc.nextLine();
                                if(select == 1) {
                                    System.out.println("\n=============제목 수정===========\n");
                                    System.out.print("\n작성자를 입력하세요 : ");
                                    searchWriter = sc.nextLine();
                                    System.out.print("\n수정하실 제목을 입력하세요 : ");
                                    String title = sc.nextLine();
                                    bs.updateBoard(select, searchWriter, title);
                                    break;
                                }else if(select == 2){
                                    System.out.println("\n=============내용 수정===========\n");
                                    System.out.print("\n작성자를 입력하세요 : ");
                                    searchWriter = sc.nextLine();
                                    System.out.print("\n수정하실 내용을 입력하세요 : ");
                                    String contents = sc.nextLine();
                                    bs.updateBoard(select, searchWriter, contents);
                                }
                                break;
                            case 5:
                                // 게시글 삭제
                                System.out.println("\n=============게시글 삭제===========\n");
                                System.out.print("\n작성자를 입력하세요 : ");
                                searchWriter = sc.nextLine();
                                System.out.print("\n제목을 입력하세요 : ");
                                String title = sc.nextLine();
                                bs.removeBoard(searchWriter, title);
                                break;
                            case 0:
                                // 로그아웃
                                loop2 = false;
                                System.out.println("로그아웃합니다...");
                                break;

                        }
                    }
                    //break;
                }else{
                    System.out.println("\n로그인 실패...");
                    System.out.println("아이디와 비밀번호를 확인해주세요.");
                }
            }else{
                // 돌아가기
                break;
            }
        }while(true);
    }

    // 관리자 메뉴
    public void showManagerMenu(){
        //int result = -1;
        boolean loop = true;

        System.out.println("\n==============관리자 메뉴==============");
        System.out.println("\n1. 게시물 조회  2. 게시물 삭제  0. 나가기");
        System.out.print("\n메뉴를 입력해주세요 : ");
        select = sc.nextInt();
        sc.nextLine();
        do {
            switch (select){
                case 1:
                    // 관리자 게시물 조회
                    System.out.print("\n게시물의 작성자를 입력해주세요 : ");
                    String writer = sc.nextLine();
                    ArrayList<BoardVO> bList = bs.getBoard(writer);

                    for (BoardVO board : bList) {
                        System.out.println(board);
                    }
                    break;

                case 2:
                    // 관리자 게시물 삭제
                    System.out.print("\n작성자를 입력하세요 : ");
                    writer = sc.nextLine();
                    System.out.print("\n제목을 입력하세요 : ");
                    String title = sc.nextLine();
                    bs.removeBoard(writer, title);
                    break;
                case 0:
                    //result = 0;
                    loop = false;
                    break;
            }
        }while(loop);
    }


}