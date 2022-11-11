package bbs;

import member.MemberVO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BoardService service = new BoardService();
        String answer;

        while (true) {
            System.out.println("\n============================게시판============================");
            System.out.println("\n[ 1. 게시글 작성  2. 게시글 검색  3. 게시글 전체보기  4. 게시글 수정  5. 게시글 삭제 ]");
            System.out.print("\n메뉴를 선택하세요 : ");
            int select = sc.nextInt();
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
                        service.insertBoard(board);

                        System.out.println("\n추가로 입력하시겠습니까?");
                        System.out.print("\nInput Yes or AnyKey : ");
                        answer = sc.nextLine();
                    } while (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y');
                    break;
                case 2:
                    // 게시글 검색
                    String searchWriter = null;
                    System.out.println("\n==========================게시글 검색=========================");
                    System.out.print("\n작성자를 입력해주세요 : ");
                    searchWriter = sc.nextLine();
                    ArrayList<BoardVO> bList = service.getBoard(searchWriter);

                    for (BoardVO board : bList) {
                        System.out.println(board);
                    }
                    break;
                case 3:
                    // 게시글 전체보기
                    System.out.println("\n==========================게시글 목록=========================\n");
                    ArrayList<BoardVO> boardList = service.getBoardList();
                    for(BoardVO b : boardList){
                        System.out.println(b);
                    }
                    break;
                case 4:
                    // 게시글 수정
                    System.out.println("=============게시글 수정===========");
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
                        service.updateBoard(select, searchWriter, title);
                        break;
                    }else if(select == 2){
                        System.out.println("\n=============내용 수정===========\n");
                        System.out.print("\n작성자를 입력하세요 : ");
                        searchWriter = sc.nextLine();
                        System.out.print("\n수정하실 내용을 입력하세요 : ");
                        String contents = sc.nextLine();
                        service.updateBoard(select, searchWriter, contents);
                    }
                    break;
                case 5:
                    // 게시글 삭제
                    System.out.println("\n=============게시글 삭제===========\n");
                    System.out.print("\n작성자를 입력하세요 : ");
                    searchWriter = sc.nextLine();
                    System.out.print("\n제목을 입력하세요 : ");
                    String title = sc.nextLine();
                    service.removeBoard(searchWriter, title);
                    break;
            }
        }
    }
}