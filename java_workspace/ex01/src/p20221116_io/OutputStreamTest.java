package p20221116_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        OutputStream os = System.out;   // 1byte 단위로 출력

        System.out.print("데이터를 입력하세요 : ");

        int input = is.read();
        System.out.println("실제 입력된 데이터 : " + input);
        System.out.print("출력 데이터 : ");
        os.write((char) input);
        os.close();
    }
}
