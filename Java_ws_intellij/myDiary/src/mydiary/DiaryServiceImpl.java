package mydiary;

import java.util.ArrayList;

/*
서비스 클래스가 하는 일은
화면으로부터 일기 데이터를 받아서 ---> db에 저장시키기위해
전달하는 역할 - 개발자가 중시해야 하는 비즈니스 로직이 정의되는 클래스
 */
public class DiaryServiceImpl implements IDiaryService{
    private DiaryDao dao = new DiaryDao();

    // 화면 --> db
    @Override
    public void regist(Diary diary) {
        dao.insert(diary);
    }

    @Override
    public void regist2(String date, String title, String content) {
        Diary diary = null;
        //매개변수로 받은 문자열들을 Diary타입으로
        dao.insert(diary);
    }

    // 화면(사용자의 요청) <-- db(응답)
    @Override
    public ArrayList<Diary> getList() {
        return dao.selectAll();
    }

    // 화면(사용자의 요청 - 번호) <-- db(응답)
    @Override
    public Diary getDiary(String dno) {
        return dao.selectOne(dno);
    }
}
