package p20221115_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx02 {
    public static void main(String[] args) {
        //key : 영어단어, value : 한글
        Map<String, String> dic = new HashMap<String, String>();
        //var dic = new HashMap<String, String>();

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        //사용자로부터 영어 단어를 입력받고 한글 단어를 검색한다.
        //exit를 입력받으면 종료한다.

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("찾고 싶은 단어는?");
            String eng = sc.next();
            if(eng.toLowerCase().equals("exit")) {
                //만일 eng값이 "exit"라면
                //종료합니다. 라는 문구를 화면에 출력한다. 그리고 반복문도 종료한다.
                System.out.println("종료합니다.");
                break;
            }
            //맵에서 '키' eng의 '값' kor을 검색
            String kor = dic.get(eng);
            if(kor == null) {
                System.out.println(eng + "는 없는 단어입니다.");
            }else {
                System.out.println(kor);
            }
        }//while 끝
        sc.close();
    }//main 끝
}
