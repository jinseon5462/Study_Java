package exam;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberDB {
    Map<String, MemberVO> db = new HashMap<>();

    public void insert(MemberVO member){
        db.put(member.getId(), member);
    }

    public MemberVO selectOne(String id){
        MemberVO member = null;
        for(int i = 0; i < db.size(); i++){
            member = db.get(id);
        }
        return member;
    }

    public Map<String, MemberVO> selectAll(){
        return db;
    }

    public void update(MemberVO member){
        for(int i = 0; i < db.size(); i++){
            db.replace(member.getId(), member);
        }
        /*
        MemberVO member = db.get(m.id);
        member.pw = m.pw;
         */
    }

    public void delete(String id){
        for(int i = 0; i < db.size(); i++){
            db.remove(id);
        }
    }

    public void saveDB() {
        String path = "/Users/jinseon/dev/java_workspace/exam/src/exam/";
        ArrayList<MemberVO> list = new ArrayList<>();

        FileOutputStream fos;
        ObjectOutputStream out;
        try {
            fos = new FileOutputStream(path + "memberDB.dat", true);
            out = new ObjectOutputStream(fos);
            Set<String> keys = db.keySet();
            /*
            for(String key : keys) {
                out.writeObject(db.get(key);
            }
             */
            for(String key : keys){
                MemberVO member = db.get(key);
                list.add(member);
            }
            for (MemberVO m : list) {
                out.writeObject(m);
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadDB(){
        String path = "/Users/jinseon/dev/java_workspace/exam/src/exam/";

        FileInputStream fis;
        ObjectInputStream in;
        try {
            fis = new FileInputStream(path + "memberDB.dat");
            in = new ObjectInputStream(fis);

            while (true) {
                MemberVO m = (MemberVO) in.readObject();
                db.put(m.getId(), m);
            }
        } catch (EOFException e) {
            System.out.println("파일을 다 읽었습니다.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
