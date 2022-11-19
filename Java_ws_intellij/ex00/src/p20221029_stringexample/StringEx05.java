package p20221029_stringexample;

public class StringEx05 {
    public static void main(String[] args){
        String s1 = "Hello Java";

        if(s1.charAt(6) == 'J') {
            System.out.println(s1.length() + "번째 중에 " + "J는 " + (s1.indexOf('J') + 1) + "번째에 있습니다.");
        }
    }
}