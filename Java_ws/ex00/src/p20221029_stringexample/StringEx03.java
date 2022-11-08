package p20221029_stringexample;

public class StringEx03 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2);   // 주소값만 비교
        System.out.println(s1 == s3);   // 주소값다름
        System.out.println(s1.equals(s3));

        System.out.println(s1.length());
    }
}