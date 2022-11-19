package test;

import mydiary.Date;
import mydiary.Diary;
import mydiary.DiaryDao;
import mydiary.DiaryServiceImpl;

import java.util.ArrayList;



public class Test_DiaryService {
    public static void main(String[] args) {
        DiaryServiceImpl service = new DiaryServiceImpl();
        Date date = new Date(2022, 11, 13);
        String title = "첫 일기";
        String content = "첫 일기다. 안녕ㅋㅋ";
        Diary diary = new Diary(date, title, content);
        service.regist(diary);

        Date date2 = new Date(2022, 11, 14);
        String title2 = "두번째 일기";
        String content2 = "두번째 일기다. 쓸게없다ㅋㅋ";
        Diary diary2 = new Diary(date2, title2, content2);
        service.regist(diary2);

        Diary result = service.getDiary(diary.getDno());
        System.out.println(result);

        Diary result2 = service.getDiary(diary2.getDno());
        System.out.println(result2);

        ArrayList<Diary> list = service.getList();
        for(Diary d : list){
            System.out.println("----------------------------------");
            System.out.println("번호 : " + d.getDno());
            System.out.println("날짜 : " + d.getDate());
            System.out.println("제목 : " + d.getTitle());
            System.out.println("내용 : " + d.getContent());
        }
    }
}
