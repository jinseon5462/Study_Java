package p20221029_stringexample;

public class StringEx12 {
    public static void main(String[] args) {
        String s = "AABBCCDD";
        String x = s.replace("BC", "XX");
        System.out.println(x);

        boolean y = s.contains("BC");
        System.out.println(y);

        String s2 = "  AABB CCDD ";
        String z = s.trim();
        String a = x.toUpperCase();
        System.out.println(s2.length());
        System.out.println(z.length());

        z = s.toLowerCase();
        System.out.println(z);
        System.out.println(a);

        String b = "Apple";
        String a1 = b.toLowerCase();

    }
}