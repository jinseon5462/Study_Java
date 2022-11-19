package p20221029_stringexample;

public class StringEx10 {
    public static void main(String[] args) {
        String s = "2022-10-26";
        String[]  x = s.split("-");

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}