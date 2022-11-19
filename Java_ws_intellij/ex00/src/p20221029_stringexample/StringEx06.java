package p20221029_stringexample;

public class StringEx06 {
    public static void main(String[] args) {
        String s = "applebananapeach";
        String x = s.substring(5, 11);   //첫번째 매개변수는 시작위치, 두번째 매개변수는 4를 포함 X 종료
        //x = s.substring(2); // 2번부터 끝까지
        System.out.println(x);

        int x1 = s.indexOf("p");
        int x2 = s.lastIndexOf("p");
        System.out.println(x1);
        System.out.println(x2);
    }
}