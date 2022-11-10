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

        while(true){
            System.out.println("\n============================게시판============================");
            System.out.println("\n[ 1. 게시글 작성 | 2. 게시글 검색 | 3. 게시글 전체보기]");
            System.out.print("\n메뉴를 선택하세요 : ");
            int select = sc.nextInt();
            sc.nextLine();

            switch(select){
                case 1:
                    // 게시글 작성
                    do{
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
                    }while(answer.charAt(0) == 'Y' || answer.charAt(0) == 'y');
                    break;
                case 2:
                    // 게시글 검색
                    System.out.println("\n==========================게시글 검색=========================");
                    System.out.println("\n[ 1. 제목으로 검색 | 2. 작성자 검색 ]");
                    System.out.print("\n메뉴를 선택하세요 : ");
                    select = sc.nextInt();
                    sc.nextLine();

                    String searchTitle = null;
                    String searchWriter = null;
                    switch(select){
                        case 1:
                            System.out.println("\n==========================제목으로 검색=========================");
                            System.out.print("\n검색하실 제목을 입력해주세요 : ");
                            searchTitle = sc.nextLine();
                            ArrayList<BoardVO> bList = service.getBoard(searchTitle, searchWriter);

                            for(BoardVO board : bList){
                                System.out.println(board);
                            }
                        case 2:
                            System.out.println("\n==========================작성자 검색=========================");
                            System.out.print("글작성자를 입력해주세요 : ");
                            searchWriter = sc.nextLine();
                            service.getBoard(searchTitle, searchWriter);

                    }
            }

        }

    }
}