package map_ex;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Kim", "1234");
        map.put("Park", "pass");
        map.put("Lee", "word");

        System.out.println(map.get("Lee")); // 키를 가지고 값을 참조한다.

        for(String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("key : " + key + ", value : " + value);
        }
        map.remove(3);
        map.put("choi", "password");
        System.out.println(map);

    }
}
