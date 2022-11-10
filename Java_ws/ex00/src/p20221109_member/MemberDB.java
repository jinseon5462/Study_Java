package p20221109_member;

import java.util.ArrayList;

public class MemberDB {
    ArrayList<MemberVO> mList = new ArrayList<>();

    // Create
    public void insert(MemberVO member) {
        mList.add(member);
    }

    // Read
    public MemberVO select(String id){
        MemberVO info = null;
        for(int i = 0; i < mList.size(); i++){
            if(mList.get(i).getId().equals(id)){
                info = mList.get(i);
            }
        }
        return info;
    }

    // Update
    public void update(String checkId, int select, String chageInfo){
        for(int i = 0; i < mList.size(); i++){
            if(mList.get(i).getId().equals(checkId)){
                switch(select){
                    case 1:
                        mList.get(i).setPw(chageInfo);
                        break;
                    case 2:
                        mList.get(i).setName(chageInfo);
                        break;
                    case 3:
                        mList.get(i).setTel(chageInfo);
                        break;
                }
            }
        }
    }

    // Delete
    public void delete(String id){
        for(int i = 0; i < mList.size(); i++){
            if(mList.get(i).getId().equals(id)){
                mList.remove(i);
            }
        }
    }

    // SearchList
    public ArrayList<MemberVO> selectAll(){
        return mList;
    }
}
