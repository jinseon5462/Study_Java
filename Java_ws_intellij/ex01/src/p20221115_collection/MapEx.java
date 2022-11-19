package p20221115_collection;

import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        //Map(맵)은 키, 값의 쌍으로 이루어진다.
        HashMap<String, String> hm = new HashMap<>();

        hm.put("1번", "홍길동");
        hm.put("2번", "임꺽정");
        hm.put("3번", "일지매");

        System.out.println("hm의 내용 : " + hm);
        System.out.println("hm의 크기 : " + hm.size());

        hm.remove("3번");
        System.out.println(hm.get("1번"));
        System.out.println(hm.get("2번"));
        System.out.println(hm.get("3번"));
    }
}
