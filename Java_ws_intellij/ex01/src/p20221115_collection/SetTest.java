package p20221115_collection;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        Set<String> set = new HashSet<String>();
        //Set<String> set2 = new TreeSet<String>();

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Ham");
        System.out.println(set);

        if(set.contains("Ham")){
            System.out.println("Ham도 포함되어 있음");
        }

        Set<String> s = new HashSet<String>();
        String[] sample = {"사과", "사과", "바나나", "토마토"};
        for(String a : sample){
            if(!s.add(a)){
                System.out.println("중복된 단어 : " + a);
            }
        }
        System.out.println(s.size() + "\n중복되지 않은 단어 : " + s);
    }
}
