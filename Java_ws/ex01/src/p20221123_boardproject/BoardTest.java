package p20221123_boardproject;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        BoardDAO dao = new BoardDAO();
        LoginDAO login = new LoginDAO();
        ReplyDAO rdao = new ReplyDAO();

        while(true){
            System.out.println("\n[게시판 로그인]");
            System.out.println("\n1. 로그인하기 0. 종료하기");
            System.out.print("\n메뉴를 선택해주세요 : ");
            int sel = sc.nextInt();
            sc.nextLine();
            if(sel == 1){
                System.out.println("\n[로그인]");
                System.out.print("\n아이디를 입력하세요 : ");
                String loginId = sc.nextLine();
                System.out.print("\n비밀번호를 입력하세요 : ");
                String loginPw = sc.nextLine();
                int result = login.loginCheck(loginId, loginPw);
                if(result == 1 && login.gradeCheck(loginId, loginPw) == 1){
                    System.out.println("\n[관리자] 로그인 성공");
                    boolean loop1 = true;
                    while(loop1){
                        System.out.println("\n----------------------게시판 ver1.0----------------------");
                        System.out.println("\n1. 공지 등록 | 2. 전체 공지 조회 | 0. 로그아웃하기");
                        System.out.print("\n메뉴를 선택해주세요 : ");
                        int select = sc.nextInt();
                        sc.nextLine();
                        switch (select){
                            case 1:
                                System.out.println("\n-------------------------------------------------------");
                                System.out.print("\n[공지등록 등록] 제목을 입력해주세요 : ");
                                String title = sc.nextLine();
                                System.out.print("\n[공지 등록] 내용을 입력해주세요 : ");
                                String content = sc.nextLine();
                                System.out.print("\n[공지 등록] 작성자를 입력해주세요 : ");
                                String writer = sc.nextLine();
                                BoardVO board = new BoardVO(title, content, writer);
                                dao.insert(board);
                                break;
                            case 2:
                                System.out.println("\n---------------------------------------------------------------------------");
                                System.out.println("\n[공지 전체 조회]\n");
                                while(true){
                                    System.out.println();
                                    dao.selectAll();
                                    System.out.println("\n1. 추가메뉴로 가기 2. 다른 페이지 조회 0. 메인메뉴로 가기");
                                    System.out.print("\n메뉴를 선택해주세요 : ");
                                    int selMenu = sc.nextInt();
                                    sc.nextLine();
                                    if(selMenu == 2){
                                        boolean tf = true;
                                        while (tf){
                                            System.out.print("\n조회할 페이지 입력 : ");
                                            int selectPage = sc.nextInt();
                                            sc.nextLine();
                                            dao.selectPage(selectPage);
                                            System.out.print("\n추가로 조회하시겟습니까? (y/n) : ");
                                            String yn = sc.nextLine();
                                            if(yn.toLowerCase().charAt(0) == 'n'){
                                                break;
                                            }
                                        }
                                    }else if(selMenu == 0){
                                        break;
                                    }
                                    System.out.println("\n[공지 전체 조회 추가메뉴]");
                                    System.out.println("\n1. 공지 조회 | 2. 제목으로 조회하기 | 3. 공지 수정 | 4. 공지 삭제 | 0. 메인메뉴로 돌아가기");
                                    System.out.print("\n메뉴를 선택해주세요 : ");
                                    int selectMenu = sc.nextInt();
                                    sc.nextLine();
                                    if(selectMenu == 1){
                                        System.out.println("\n-------------------------------------------------------------------------------------------------");
                                        System.out.print("\n[공지 조회] 조회할 공지의 번호를 입력해주세요 : ");
                                        int searchBno = sc.nextInt();
                                        System.out.println();
                                        System.out.println("\n-------------------------------------------------------\n");
                                        dao.selectOne(searchBno);
                                        while(true){
                                            System.out.println("\n1. 댓글달기 0. 메뉴로 돌아가기");
                                            System.out.print("\n메뉴를 선택해주세요 : ");
                                            int select1 = sc.nextInt();
                                            sc.nextLine();
                                            if(select1 == 1){
                                                System.out.print("[댓글작성] 댓글을 작성해주세요 : ");
                                                String comment = sc.nextLine();
                                                System.out.print("[댓글작성] 작성자를 입력해주세요 : ");
                                                String commentWriter = sc.nextLine();
                                                System.out.print("[댓글작성] 댓글을 작성해주세요 : ");
                                                dao.rdao.regReply(searchBno, comment, commentWriter);
                                            }else{
                                                System.out.println("메뉴로 돌아갑니다.");
                                                break;
                                            }
                                        }

                                    }else if(selectMenu == 2) {
                                        System.out.println("\n-------------------------------------------------------");
                                        System.out.println("\n[제목으로 검색]");
                                        System.out.print("\n제목을 입력해주세요 : ");
                                        String containTitle = sc.nextLine();
                                        System.out.println();
                                        dao.selectChoice(containTitle);
                                        System.out.println("\n----------------------------------------------------------------");

                                    }else if(selectMenu == 3) {
                                        System.out.println("\n-------------------------------------------------------");
                                        System.out.println("\n[공지 수정]");
                                        System.out.print("\n수정할 공지의 번호를 입력해주세요 : ");
                                        int updateBno = sc.nextInt();
                                        sc.nextLine();
                                        System.out.print("\n수정할 공지의 내용을 입력해주세요 : ");
                                        String updateContent = sc.nextLine();
                                        dao.update(updateContent, updateBno);
                                    }else if(selectMenu == 4){
                                        System.out.println("\n-------------------------------------------------------");
                                        System.out.println("\n[공지 삭제]");
                                        System.out.print("\n삭제할 공지의 번호를 입력해주세요 : ");
                                        int deleteBno = sc.nextInt();
                                        sc.nextLine();
                                        dao.delete(deleteBno);
                                    }else if(selectMenu == 0){
                                        System.out.println("\n[메인메뉴로 돌아갑니다.]");
                                        break;
                                    }else {
                                        System.out.println("\n[입력오류입니다.]");
                                    }
                                }
                                break;
                            case 0:
                                System.out.println("\n[로그인 메뉴로 돌아갑니다.]");
                                loop1 = false;
                                break;
                            default:
                                System.out.println("\n[잘못입력하셨습니다.]");
                        }
                    }
                }else if(result == 1 && login.gradeCheck(loginId, loginPw) == 0) {
                    System.out.println("\n[일반회원] 로그인 성공");
                    boolean loop2 = true;
                    while(loop2){
                        System.out.println("\n[일반회원은 공지 조회, 댓글 작성만 가능합니다.]");
                        System.out.println("\n1. 전체 공지 조회 0. 로그아웃하기");
                        System.out.print("\n메뉴를 선택해주세요 : ");

                        int sel2 = sc.nextInt();
                        sc.nextLine();
                        switch(sel2){
                            case 1:
                                boolean loop3 = true;
                                while(loop3){
                                    System.out.println("\n[전체 공지 조회]\n");
                                    dao.selectAll();
                                    System.out.println("\n1. 추가메뉴로 가기 2. 다른 페이지 조회 0. 메인메뉴로 가기");
                                    System.out.print("\n메뉴를 선택해주세요 : ");
                                    int selMenu = sc.nextInt();
                                    sc.nextLine();
                                    if(selMenu == 2){
                                        boolean tf = true;
                                        while (tf){
                                            System.out.print("\n조회할 페이지 입력 : ");
                                            int selectPage = sc.nextInt();
                                            sc.nextLine();
                                            dao.selectPage(selectPage);
                                            System.out.print("\n추가로 조회하시겟습니까? (y/n) : ");
                                            String yn = sc.nextLine();
                                            if(yn.toLowerCase().charAt(0) == 'n'){
                                                break;
                                            }
                                        }
                                    }else if(selMenu == 0){
                                        break;
                                    }
                                    System.out.println("\n[추가메뉴]");
                                    System.out.println("\n1. 공지 조회 | 2. 제목으로 조회하기 | 0. 메인메뉴로 돌아가기");
                                    System.out.print("\n메뉴를 선택해주세요 : ");
                                    int selectMenu = sc.nextInt();
                                    sc.nextLine();
                                    if(selectMenu == 1){
                                        System.out.println("[공지조회]");
                                        System.out.print("조회할 공지의 번호를 입력하세요 : ");
                                        int sel3 = sc.nextInt();
                                        sc.nextLine();
                                        dao.selectOne(sel3);
                                        while(true){
                                            System.out.println("\n1. 댓글달기 0. 메뉴로 돌아가기");
                                            System.out.print("\n메뉴를 선택해주세요 : ");
                                            int select1 = sc.nextInt();
                                            sc.nextLine();
                                            if(select1 == 1){
                                                System.out.print("[댓글작성] 댓글을 작성해주세요 : ");
                                                String comment = sc.nextLine();
                                                System.out.print("[댓글작성] 작성자를 입력해주세요 : ");
                                                String commentWriter = sc.nextLine();
                                                System.out.print("[댓글작성] 댓글을 작성해주세요 : ");
                                                dao.rdao.regReply(sel3, comment, commentWriter);
                                            }else{
                                                System.out.println("메뉴로 돌아갑니다.");
                                                break;
                                            }
                                        }
                                    }else if(selectMenu == 2){
                                        System.out.println("\n[제목으로 검색]");
                                        System.out.print("\n제목을 입력해주세요 : ");
                                        String containTitle = sc.nextLine();
                                        System.out.println("\n--------------------------------------");
                                        System.out.println("\n[조회결과]\n");
                                        dao.selectChoice(containTitle);
                                        System.out.println("\n--------------------------------------");
                                    }else if(selectMenu == 0){
                                        System.out.println("메인메뉴로 돌아갑니다.");
                                        loop3 = false;
                                    }
                                }
                                break;
                            case 0:
                                System.out.println("\n[로그아웃 합니다.]");
                                loop2 = false;
                                break;
                        }
                    }
                }else {
                    System.out.println("\n[로그인 실패]");
                }
            }else{
                System.out.println("\n프로그램을 종료합니다...");
                System.exit(0);
            }
        }
    }
}
