package book.main;

import java.util.ArrayList;
import java.util.Scanner;
import book.service.BookService;
import book.vo.BookVO;

public class BookManager {
    public static void main(String[] args) {
        BookVO b1 = new BookVO("A101", "오즈의 마법사", "라이먼 프랭크 바움", "비룡소 클래식", 12000);
        BookVO b2 = new BookVO("B101", "하얼빈", "김훈", "문학동네", 11200);
        BookVO b3 = new BookVO("C101", "자바 프로그래밍 입문", "박은종", "이지스퍼블리싱", 25000);
        BookVO b4 = new BookVO("C102", "자바 완전정복", "김동형", "이지스퍼블리싱	", 30000);
        BookService db = new BookService();

        db.addBook(b1);
        db.addBook(b2);
        db.addBook(b3);
        db.addBook(b4);

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {

            System.out.println("\n================도서조회================");
            System.out.println("1. 도서명 검색  2. 저자 검색  3. 출판사 검색");
            System.out.print("Select : ");
            int select = sc.nextInt();

            System.out.print("키워드 검색 : ");
            String info = sc.nextLine();
            info = sc.nextLine();
            ArrayList<BookVO> list = db.searchBooks(select, info);
            for(BookVO book : list) {
                System.out.println(book);
            }
        }
    }
}
