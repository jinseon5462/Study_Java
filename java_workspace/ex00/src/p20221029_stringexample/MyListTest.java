package p20221029_stringexample;

public class MyListTest {
    public static void main(String[] args){
        MyList list = new MyList();
        /*

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.sArr.length; i++){
            String input;
            System.out.print("이름을 입력하세요 : ");
            input = sc.nextLine();
            list.add(input);
        }

        for(int j = 0; j < list.sArr.length; j++){
            System.out.println(list.get(j));
        }
        //System.out.println(list.sArr[0]);
        //System.out.println(list.sArr[1]);
        */

        list.add("홍길동");
        list.add("임꺽정");
        list.add("심청이");
        list.add("이진선");
        list.add("이진순");
        list.add("홍길순");

        for(int i = 0; i < list.sArr.length; i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        list.remove(3);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}