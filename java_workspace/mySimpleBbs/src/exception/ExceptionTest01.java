package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest01 {
    Dummy d;
    public static void main(String[] args) throws FileNotFoundException {
        //ExceptionTest01 ins = new ExceptionTest01();
        //ins.div();
        /*
        try {
            int result = 3/0;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("0으로 나누면 안돼요...");
        }

        System.out.println("종료!!");

         */
        /*
        ExceptionTest01 ex = new ExceptionTest01();
        //ex.d = new Dummy();
        try {
            ex.d.n = 10;
            System.out.println(ex.d.n);
        }catch (NullPointerException e){
            System.out.println("객체를 생성하라규...");
        }

         */

        f1();
        try {
            f2();
        }catch (Exception e){
            System.out.println("xxxxxx");
        }

        System.out.println("종료!!");
    }
    private static  void f1(){
        try {
            FileReader fr = new FileReader("/Users/jinseon/dev/java_workspace/mySimpleBbs/src/io/abc.txt");
        }catch (FileNotFoundException e) {
            System.out.println("파일이 없대요~~");
        }
    }
    private static void f2() throws FileNotFoundException {
        FileReader fr = new FileReader("/Users/jinseon/dev/java_workspace/mySimpleBbs/src/io/abc.txt");
    }
}
