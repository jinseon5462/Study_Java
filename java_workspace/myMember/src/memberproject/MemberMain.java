package memberproject;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/*
메인은 서비스한테 DB관련 일을 시킨다.
그래서 Main에는 서비스 객체가 필요하다.

 */
public class MemberMain {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();
        final String PATH = "/Users/jinseon/dev/java_workspace/myMember/src/memberproject/";

        do{
            System.out.println("============================================");
            System.out.println("\n1. 회원가입 2. 조회하기 3. 회원목록 조회 0. 종료하기");
            System.out.print("\n메뉴를 선택하세요 : ");
            int select = sc.nextInt();
            sc.nextLine();
            switch (select){
                case 1:
                    //회원가입
                    System.out.println("\n====회원가입 메뉴====");
                    System.out.print("\n아이디를 입력해주세요 : ");
                    String id = sc.nextLine();
                    System.out.print("\n비밀번호를 입력해주세요 : ");
                    String pw = sc.nextLine();
                    System.out.print("\n이름을 입력해주세요 : ");
                    String name = sc.nextLine();
                    MemberVO member = new MemberVO(id, pw, name);
                    service.regist(member);
                    //FileOutputStream fos = new FileOutputStream(PATH + "/MemberInfo.txt", true);
                    //ObjectOutputStream out = new ObjectOutputStream(fos);
                    //out.writeObject(member);
                    //out.close();
                    //System.out.println("객체가 파일에 저장되었습니다.");
                    break;
                case 2:
                    //조회하기
                    System.out.println("\n====정보조회 메뉴====");
                    System.out.print("\n조회하실 회원의 아이디를 입력해주세요 : ");
                    String searchId = sc.nextLine();
                    MemberVO resultMember = service.getMember(searchId);
                    System.out.println(resultMember);
                    break;
                case 3:
                    //회원목록 조회
                    ArrayList<MemberVO> list = service.getList();
                    for(MemberVO m : list){
                        System.out.println(m);
                    }

                    break;
                case 0:
                    // 파일쓰기(DB용 Map데이터)
                    FileOutputStream fos;
                    ObjectOutputStream out;
                    ArrayList<MemberVO> list2 = service.getList();
                    try {
                        fos = new FileOutputStream(PATH + "memberDB.dat");
                        out = new ObjectOutputStream(fos);
                        for(MemberVO m : list2){
                            out.writeObject(m);
                        }
                    }catch (IOException e) {
                        throw new RuntimeException();
                    }

                    FileInputStream fis;
                    ObjectInputStream in;

                    //읽기
                    try{
                        fis = new FileInputStream(PATH + "memberDB.dat");
                        in = new ObjectInputStream(fis);
                        while (true) {
                            MemberVO m = (MemberVO) in.readObject();
                            System.out.println(m);
                        }
                    } catch (EOFException e) {
                        System.out.println("파일을 다 읽었어요.");
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        throw new RuntimeException();
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException();
                    }
                    System.out.println("종료합니다...");
                    System.exit(0);
            }
        }while(true);
    }
}
