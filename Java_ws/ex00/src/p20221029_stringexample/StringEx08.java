package p20221029_stringexample;

public class StringEx08 {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = ".jpg";
        String result = s1.concat(s2);
        System.out.println(result);
        String result2 = s2.concat(s1);
        System.out.println(result2);
    }
}