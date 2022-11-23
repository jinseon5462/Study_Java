package p20221123_boardproject;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        BoardDAO dao = new BoardDAO();

        while(true){
            System.out.println("\n--------------------------------------------------------게시판 ver1.0--------------------------------------------------------");
            System.out.println("\n| 1. 게시글 등록 | 2. 게시글 조회 | 3. 게시글 전체 조회 | 4. 게시글 제목(포함)검색 | 5. 게시글 수정 | 6. 게시글 삭제 | 0. 종료하기");
            System.out.print("\n메뉴를 선택해주세요 : ");
            int select = sc.nextInt();
            sc.nextLine();

            switch (select){
                case 1:
                    System.out.println("\n-------------------------------------------------------");
                    System.out.print("\n[게시글 등록] 제목을 입력해주세요 : ");
                    String title = sc.nextLine();
                    System.out.print("\n[게시글 등록] 내용을 입력해주세요 : ");
                    String content = sc.nextLine();
                    System.out.print("\n[게시글 등록] 작성자를 입력해주세요 : ");
                    String writer = sc.nextLine();
                    BoardVO board = new BoardVO(title, content, writer);
                    dao.insert(board);
                    break;
                case 2:
                    System.out.println("\n-------------------------------------------------------");
                    //dao.selectAll();
                    System.out.print("\n[게시글 조회] 조회할 게시글의 번호를 입력해주세요 : ");
                    int searchBno = sc.nextInt();
                    System.out.println();
                    dao.selectOne(searchBno);
                    break;
                case 3:
                    System.out.println("\n-------------------------------------------------------");
                    System.out.println("\n[게시글 전체 조회]\n");
                    dao.selectAll();
                    break;
                case 4:
                    System.out.println("\n-------------------------------------------------------");
                    System.out.println("\n[제목 키워드로 검색하기]");
                    System.out.print("\n제목을 입력해주세요 : ");
                    String containTitle = sc.nextLine();
                    System.out.println();
                    dao.selectChoice(containTitle);
                    break;
                case 5:
                    System.out.println("\n-------------------------------------------------------");
                    System.out.println("\n[게시글 수정]");
                    System.out.print("\n수정할 게시글의 번호를 입력해주세요 : ");
                    int updateBno = sc.nextInt();
                    sc.nextLine();
                    System.out.print("\n수정할 내용을 입력해주세요 : ");
                    String updateContent = sc.nextLine();
                    dao.update(updateContent, updateBno);
                    break;
                case 6:
                    System.out.println("\n-------------------------------------------------------");
                    System.out.println("\n[게시글 삭제]");
                    System.out.print("\n삭제할 게시글의 번호를 입력해주세요 : ");
                    int deleteBno = sc.nextInt();
                    dao.delete(deleteBno);
                    break;
                case 0:
                    System.out.println("\n[종료합니다...]");
                    System.exit(0);
                default:
                    System.out.println("\n[잘못입력하셨습니다.]");
            }
        }
    }
}
