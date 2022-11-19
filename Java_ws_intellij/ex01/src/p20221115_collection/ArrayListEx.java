package p20221115_collection;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("사과");
        list.add("바나나");
        list.add("메론");
        list.add("복숭아");
        list.add("포도");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("ㅁㅁㅁㅁ");
        list2.add("바나나");
        list2.add("메론");
        list2.add("복숭아");
        list2.add("포도");

        list.addAll(list2); //다른 리스트의 모든 요소를 현 리스트의 맨뒤에 이어붙이기
        for(String s : list){
            System.out.print(s + " ");
        }
        System.out.println();

        list2.clear();
        System.out.println("list2 출력");
        for(String s : list2){
            System.out.print(s + " ");
        }

        System.out.println(list.contains("수박"));    // 지정한 객체를 포함하고 있나
        System.out.println(list.indexOf("바나나"));
        list.add(1, "수박");
        for(String s : list){
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println(list.indexOf("바나나"));
        System.out.println(list.isEmpty());
        System.out.println(list2.isEmpty());

        list.remove(0);
        list.remove("수박");
        list.remove("바나나");
        for(String s : list){
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("----------------");
        Object[] array = list.toArray();
        String s = (String) array[0];
        System.out.println(s);

        System.out.println(list.indexOf("수박")); //해당객체의 인덱스번호 반환 없으면 -1 반환
        /*
        가나다라마바사아자차카타파하
        ABCDEFGHIJKLMNOPQRSTUVWXYZ
        hello my name is Jinseon!!

         */
    }
}
