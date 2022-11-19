package mydiary;

import java.util.ArrayList;

public interface IDiaryService {
    //등록
    public void regist(Diary diary);

    public void regist2(String date, String title, String content);
    //전체조회
    public ArrayList<Diary> getList();
    //개별조회
    public Diary getDiary(String dno);
}
