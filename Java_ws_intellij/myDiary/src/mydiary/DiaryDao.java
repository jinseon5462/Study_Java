package mydiary;

import java.util.ArrayList;

public class DiaryDao implements IDao{
    private ArrayList<Diary> db = new ArrayList<>();

    //1. db에 일기정보 등록
    @Override
    public void insert(Diary diary){
        db.add(diary);
    }


    //2. db에 일기정보목록 조회(전체조회)
    @Override
    public ArrayList<Diary> selectAll(){
        return db;
    }

    //3. db에서 일기정보 조회(개별조회 - 번호로 찾기)
    @Override
    public Diary selectOne(String dno){
        Diary result = null;
        for(int i = 0; i < db.size(); i++){
            if(db.get(i).getDno().equals(dno)){
                result = db.get(i);
                break;
            }
        }
        return result;
    }
}
