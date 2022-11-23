package mydiary;

import java.io.*;
import java.util.ArrayList;

public class DiaryFileDao implements IDao{
    private final String dirPath = "/Users/jinseon/diaryDB/";
    File file;
    FileReader fr;
    FileWriter fw;  //메인스트림
    BufferedReader br;  //보조스트림
    BufferedWriter bw;

    ArrayList<Diary> list;



    @Override
    public void insert(Diary diary) {
        //Diary 객체를 파일에 쓰기
        file = new File(dirPath + diary.getDno() + ".txt"); //2022-11-13.txt
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(diary.toString());
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Diary> selectAll() {
        makeList();
        return list;
    }

    private void makeList() {
        list = new ArrayList<>();
        file = new File(dirPath);
        File[] subfiles = file.listFiles(); //
        System.out.println(subfiles.length);
        System.out.println(subfiles[1].getName());
        System.out.println(dirPath + subfiles[1].getName());
        String filePath = "";
        for(int i = 0; i < subfiles.length; i++){
            filePath = dirPath + subfiles[i].getName();

            try {
                fr = new FileReader(filePath);
                br = new BufferedReader(fr);
                String str = "";
                while((str = br.readLine()) != null){
                    //파일 데이터를 다이어리 객체로 만들기
                    String[] tempDiary = str.split(",");
                    String[] tempDate = tempDiary[1].split("-");
                    int year = Integer.parseInt(tempDate[0]);
                    int month = Integer.parseInt(tempDate[1]);
                    int day = Integer.parseInt(tempDate[2]);

                    Date date = new Date(year, month, day);

                    Diary diary = new Diary(tempDiary[0], date, tempDiary[2], tempDiary[3]);
                    list.add(diary);
                }//while문 끝

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
                //throw new RuntimeException(e);
            }
        }//for문 끝
    }

    @Override
    public Diary selectOne(String dno) {
        Diary diary = null;
        makeList();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getDno().equals(dno)){
                diary = list.get(i);
                break;
            }
        }
        return diary;
    }
}
