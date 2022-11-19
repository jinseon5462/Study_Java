package basic01;

public class ByteTest {
    public static void main(String[] args) {
        byte val1 = 126;
        int val2 = 125;

        byte a = 10;
        byte b = -5;
        int c = a + b;


        for(int i = 0; i < 5; i++){
            val1++;
            val2++;
            System.out.println("val1 : " + val1 + "\nval2 : " + val2);
            System.out.println();
        }
    }
}