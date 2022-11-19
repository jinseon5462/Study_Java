package mydiary;

import java.util.ArrayList;

public class Test_DiaryFileDao {
    public static void main(String[] args) {
        DiaryFileDao dao = new DiaryFileDao();

        Date date = new Date(2022, 12, 25);
        Diary diary = new Diary(date, "연습제목", "연습내용");
        dao.insert(diary);
        /*
        ArrayList<Diary> list = dao.selectAll();
        for(Diary diary : list) {
            System.out.println(diary.getTitle());
        }
         */
    }
}