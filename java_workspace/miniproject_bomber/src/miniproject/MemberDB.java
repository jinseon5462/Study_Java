package miniproject;

import java.util.ArrayList;

public class MemberDB {
    ArrayList<Member> list = new ArrayList<>();


    public void insert(Member member){
        list.add(member);
    }

    public int checkId(String id){
        int result = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId().equals(id)){
                result = 1;
                break;
            }
        }
        return result;
    }
    // 단일점수 조회
    public Member getScore(String name){
        Member member = null;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals(name)){
                member = list.get(i);
                break;
            }
        }
        return member;
    }

    // 전체점수 조회
    public ArrayList<Member> selectAll(){
        return list;
    }

    public int loginCheck(String id, String pw){
        int result = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId().equals(id) && list.get(i).getPw().equals(pw)){
                result = 1;
                break;
            }
        }
        return result;
    }
}
