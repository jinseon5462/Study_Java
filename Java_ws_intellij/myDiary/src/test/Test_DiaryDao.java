package test;

import mydiary.Date;
import mydiary.Diary;
import mydiary.DiaryDao;

import java.util.ArrayList;

public class Test_DiaryDao {
    public static void main(String[] args) {
        DiaryDao dao = new DiaryDao();
        Date date = new Date(2022, 11, 14);
        String title = "첫 일기";
        String content = "첫 일기다. 앞으로 게속 쓸 생각이다. 제대로 했으면 좋겠다 제발...";

        Diary diary = new Diary(date, title, content);
        dao.insert(diary);

        Diary result = dao.selectOne(diary.getDno());
        System.out.println("selectOne Test...");
        System.out.println(result);

        System.out.println("\nselectAll Test...");

        ArrayList<Diary> list = dao.selectAll();
        for(Diary d : list){
            //System.out.println(d);
            System.out.println("번호 : " + d.getDno());
            System.out.println("날짜 : " + d.getDate());
            System.out.println("제목 : " + d.getTitle());
            System.out.println("내용 : " + d.getContent());
        }
    }
}
