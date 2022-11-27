package bbs;

import java.util.Scanner;

public class BoardTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		
		System.out.println("[게시판]");
		System.out.print("\n제목 : ");
		String title = sc.nextLine();
		System.out.print("내용 : ");
		String content = sc.nextLine();
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		BoardVO board = new BoardVO(title, content, writer);
		dao.insert(board);
	}
}
