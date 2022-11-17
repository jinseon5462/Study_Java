package p20221115_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx03 {
    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new HashMap<>();

        scoreMap.put("홍길동", 97);
        scoreMap.put("임꺽정", 88);
        scoreMap.put("원균", 10);
        scoreMap.put("이완용", 1);
        scoreMap.put("마이콜", 76);

        System.out.println("map의 요소 개수 : " + scoreMap.size());

        //모든 사람의 점수를 출력하자
        Set<String> keys = scoreMap.keySet();   // key들을 Set배열로 만들어준다.

        Iterator<String> it = keys.iterator();
        // Set에 있는 모든 키를 순서대로 검색할 수 있는 기능을 제공하는 객체

        while(it.hasNext()){
            String name = it.next();
            int score = scoreMap.get(name);
            System.out.println("이름 : " + name + ", 점수 : " + score);
        }

        for(String key : keys){
            System.out.println(key + ", " + scoreMap.get(key));
        }

        scoreMap.forEach((key, value) -> {
            System.out.println(key + ", " + value);
        });
    }
}
