package p20221116_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/jinseon/dev/java_workspace/ex01/src/p20221116_io/sample.txt/");
        FileOutputStream fos = new FileOutputStream("/Users/jinseon/dev/java_workspace/ex01/src/p20221116_io/sample2.txt");
        int input = 0;
        int cnt = 0;
        while((input = fis.read()) != -1) {
            fos.write(input);
            System.out.print((char) input);
            //cnt++;
        }
        System.out.println("cnt : " + cnt);
        fos.close();
        fis.close();

    }

}
