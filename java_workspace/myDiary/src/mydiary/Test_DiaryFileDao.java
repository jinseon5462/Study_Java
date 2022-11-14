package mydiary;

import java.util.ArrayList;

public class Test_DiaryFileDao {
    public static void main(String[] args) {
        DiaryFileDao dao = new DiaryFileDao();
        
        /*
        Date date = new Date(2022, 11, 14);
        Diary diary = new Diary(date, "연습제목3", "연습내용3");
        dao.insert(diary);
         */
        
        ArrayList<Diary> list = dao.selectAll();
        for(Diary diary : list) {
        	System.out.println(diary.getDno());
        	System.out.println(diary.getDate());
        	System.out.println(diary.getTitle());
        	System.out.println(diary.getContent());
        }
    }
}
