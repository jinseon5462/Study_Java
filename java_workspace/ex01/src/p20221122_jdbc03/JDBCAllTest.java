package p20221122_jdbc03;

import java.util.Scanner;

public class JDBCAllTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JDBCDAO dao = new JDBCDAO();
		MemberVO member;
		int select = -1;
		
		while(select == -1) {
			System.out.println("\n1. 회원가입 2. 로그인 0. 프로그램 종료");
			System.out.print("\n메뉴를 선택해주세요 : ");
			select = sc.nextInt();
			sc.nextLine();
			switch(select) {
				case 1:
					while(true) {
						System.out.print("\n[회원가입] 아이디를 입력해주세요 : ");
						String regId = sc.nextLine();
						int sameIdResult = dao.checkSameId(regId);
						if(sameIdResult == 1) {
							System.out.println("\n[중복된 아이디입니다]");
						}else {
							System.out.println("\n[사용가능한 아이디입니다]");
							System.out.print("\n[회원가입] 비밀번호를 입력해주세요 : ");
							String regPw = sc.nextLine();
							System.out.print("\n[회원가입] 이름을 입력해주세요 : ");
							String regName = sc.nextLine();
							System.out.print("\n[회원가입] 전화번호를 입력해주세요 : ");
							String regTel = sc.nextLine();
							member = new MemberVO(regId, regPw, regName, regTel);
							dao.insert(member);
							break;
						}
					}
					break;
				case 2:
					System.out.print("[로그인] 아이디를 입력해주세요 : ");
					String loginId = sc.nextLine();
					System.out.print("[로그인] 비밀번호를 입력해주세요 : ");
					String loginPw = sc.nextLine();
					
					break;
				case 0:
					break;
				default:
					System.out.println("입력오류입니다.");
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
}
