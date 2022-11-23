package lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        map.put("사과", "Apple");
        map.put("수박", "Watermelon");
        map.put("배", "pear");
        map.put("용과", "Dragonfruit");
        map.put("포도", "Grape");
        map.put("파인애플", "Pineapple");
        map.put("이진선", "Lee jin seon");

        do{
            System.out.println("----------단어사전 ver1.0----------");
            System.out.print("단어를 입력하세요 : ");
            String key = sc.nextLine();
            // exit를 입력하면 프로그램 종료
            if(key.toLowerCase().equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("영어 : " + map.get(key));
        }while(true);
    }
}
