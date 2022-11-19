package p20221109_member;

import java.util.ArrayList;
import java.util.Scanner;

/*
(main)
====회원정보 등록====
id를 입력하세요 :
pw를 입력하세요 :
이름을 입력하세요 :
전화번호를 입력하세요 :

id
pw
name
tel

(MemberVO)
멤버에 id pw name tel 저장

(IMemberService)인터페이스
void regMember(MemberVO member);

(MemberService)implements IMemberService
void regMember(MemberVO member){

}

(MemberDB)데이터베이스용 클래스
ArrayList<MemberVO> mList = new ArrayList<>();

void insert(MemberVO member){
}

 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService service = new MemberService();

        String id;
        String pw;
        String name;
        String tel;

        while(true){
            System.out.println("\n==========회원정보==========");
            System.out.println("1. 회원정보 등록  2. 회원리스트 조회  3.회원정보 검색  4. 회원정보 수정  5. 삭제하기 ");
            System.out.print("\nSelect Menu : ");
            int selectMenu = sc.nextInt();
            sc.nextLine();

            switch(selectMenu){
                case 1:
                    System.out.println("\n========회원정보 등록========");
                    System.out.print("아이디를 입력하세요 : ");
                    id = sc.nextLine();
                    while(true){
                        boolean check = service.checkId(id);
                        if(check){
                            System.out.println("중복된 아이디입니다.");
                            System.out.print("\n다른 아이디를 입력해주세요 : ");
                            id = sc.nextLine();
                        }else{
                            System.out.println("사용가능한 아이디입니다.");
                            break;
                        }

                    }
                    System.out.print("\n비밀번호를 입력하세요 : ");
                    pw = sc.nextLine();
                    System.out.print("이름을 입력하세요 : ");
                    name = sc.nextLine();
                    System.out.print("전화번호를 입력하세요 : ");
                    tel = sc.nextLine();
                    MemberVO member = new MemberVO(id, pw, name, tel);
                    service.regMember(member);
                    break;
                case 2:
                    System.out.println("\n회원 리스트 조회를 선택하셨습니다.");
                    System.out.println("\n==============회원목록============");
                    ArrayList<MemberVO> list = service.getMemberList();
                    for(MemberVO m : list){
                        System.out.println(m);
                    }
                    break;
                case 3:
                    System.out.println("\n회원정보 조회를 선택하셨습니다.");
                    System.out.print("\n검색할 아이디를 입력하세요 : ");
                    String searchID = sc.nextLine();
                    MemberVO oneMemberInfo = service.getMember(searchID);
                    System.out.println(oneMemberInfo);
                    break;
                case 4:
                    System.out.println("\n==============회원정보 수정==============");
                    System.out.println("1. 비밀번호 변경  2. 이름변경  3. 전화번호 변경");
                    System.out.print("\nSelect : ");
                    int select = sc.nextInt();
                    sc.nextLine();
                    //String checkId = sc.nextLine();
                    //System.out.print("변경하실 아이디를 입력해주세요");
                    //String changeId = sc.nextLine();
                    if(select == 1){
                        System.out.println("비밀번호 변경을 선택하셨습니다.");
                        System.out.print("변경할 회원의 아이디를 입력하세요 : ");
                        String checkId = sc.nextLine();
                        while (true){
                            boolean idCheck = service.checkId(checkId);
                            if(idCheck == true){
                                break;
                            }else if(idCheck == false){
                                System.out.println("아이디 입력 오류입니다.");
                                System.out.print("아이디를 재입력해주세요 : ");
                                id = sc.nextLine();
                            }
                        }
                        System.out.print("변경할 비밀번호를 선택하세요 : ");
                        String changePw = sc.nextLine();
                        service.changeMember(checkId, select, changePw);
                        break;
                    }else if(select == 2){
                        System.out.println("이름변경을 선택하셨습니다.");
                        System.out.print("변경할 회원의 아이디를 입력하세요 : ");
                        String checkId = sc.nextLine();
                        System.out.print("변경할 이름을 입력하세요 : ");
                        String changeName = sc.nextLine();
                        service.changeMember(checkId, select, changeName);
                        break;
                    }else if(select == 3){
                        System.out.println("전화번호변경을 선택하셨습니다.");
                        System.out.print("변경할 회원의 아이디를 입력하세요 : ");
                        String checkId = sc.nextLine();
                        System.out.print("변경할 전화번호를 입력하세요 : ");
                        String changeTel = sc.nextLine();
                        service.changeMember(checkId, select, changeTel);
                        break;
                    }
                case 5:
                    System.out.println("\n회원정보 삭제를 선택하셨습니다.");
                    System.out.print("삭제할 정보의 아이디를 입력하세요 : ");
                    String deleteID = sc.nextLine();
                    service.deleteMember(deleteID);
                    break;
            }


        }

    }
}
