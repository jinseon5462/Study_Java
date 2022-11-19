package miniproject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberDAO {

    Map<String, MemberVO> save = new HashMap<>();
    ArrayList<MemberVO> db = new ArrayList<>();

    // 회원가입
    public void insert(MemberVO member){
        db.add(member);
    }

    // 아이디 중복체크
    public int checkId(String id){
        for(int i = 0; i < db.size(); i++){
            if(db.get(i).getId().equals(id)){
                return 1;
            }
        }
        return 0;  // 중복된 아이디이면 1을 반환한다.
    }

    // 로그인 체크
    public int loginCheck(String id, String pw){
        for(int i = 0; i < db.size(); i++){
            if(db.get(i).getId().equals(id) && db.get(i).getPw().equals(pw)){
                return 1;
            }
        }
        return 0;   // 로그인 성공이면 1을 반환한다.
    }

    // 회원이름 보여주기
    public String getName(String id){
        String userName = null;
        for(int i = 0; i < db.size(); i++){
            if(db.get(i).getId().equals(id)){
                userName = db.get(i).getName();
            }
        }
        return userName;
    }

    public MemberVO getMember(String id){
        MemberVO member = null;
        for(int i = 0; i < db.size(); i++){
            if(db.get(i).getId().equals(id)){
                member = db.get(i);
            }
        }
        return member;
    }

    // 회원목록 조회
    public ArrayList<MemberVO> getList(){
        return db;
    }

    // 파일에 객체정보 저장
    public void saveDB() {
        String path = "/Users/jinseon/dev/java_workspace/miniproject_updown/src/miniproject/";

        FileOutputStream fos;
        ObjectOutputStream out;
        try {
            fos = new FileOutputStream(path + "memberInfo.txt", true);
            out = new ObjectOutputStream(fos);

            for (MemberVO m : db) {
                out.writeObject(m);
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    public void loadDB(){
        String path = "/Users/jinseon/dev/Java_ws/practiceproject02/src/practice/";

        FileInputStream fis;
        ObjectInputStream in;

        try {
            fis = new FileInputStream(path + "memberInfo.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            in = new ObjectInputStream(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while(true){
            try {
                db.add((MemberVO) in.readObject());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }
     */

    public void setScore(String id, int score){
        for(int i = 0; i < db.size(); i++){
            if(db.get(i).getId().equals(id)){
                db.get(i).setScore(score);
            }
        }
    }
}
