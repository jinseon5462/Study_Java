package memberproject;

import java.io.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        final String PATH = "/Users/jinseon/dev/java_workspace/myMember/src/memberproject/";

        //리스트 조회
        ArrayList<MemberVO> list = service.getList();
        for(MemberVO m : list){
            System.out.println(m);
        }

        // 파일쓰기(DB용 Map데이터)
        FileOutputStream fos;
        ObjectOutputStream out;
        list = service.getList();
        try {
            fos = new FileOutputStream(PATH + "memberDB.dat");
            out = new ObjectOutputStream(fos);
            for(MemberVO m : list){
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
            MemberVO p1 = (MemberVO) in.readObject();
            MemberVO p2 = (MemberVO) in.readObject();
            MemberVO p3 = (MemberVO) in.readObject();
            MemberVO p4 = (MemberVO) in.readObject();

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println(p4);
            in.close();
            System.out.println("-------------------");

            fis = new FileInputStream(PATH + "memberDB.dat");
            in = new ObjectInputStream(fis);
            while (true) {
                MemberVO m = (MemberVO) in.readObject();
                System.out.println(m);
            }

        } catch (EOFException e){
            System.out.println("파일을 다 읽었어요.");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            throw new RuntimeException();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException();
        }

        System.out.println("종료합니다...");
    }
}
