package p20221116_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest01 {
    //Reader가 붙은 클래스는 2byte 단위로 읽어 들인다.
    public static void main(String[] args) {
        InputStream is = System.in;
        //InputStreamReader isr = new InputStreamReader(is);
        InputStreamReader isr = new InputStreamReader(System.in); //으로도 사용가능하다
        int inputData = 0;
        System.out.print("데이터를 입력하세요: ");

        try {
            //InputStreamReader가 제공하는 read()메소드는 2byte를 읽어,
            //정수 코드값을 반환한다. 따라서, 영문뿐만아니라 한글도 사용이 가능하다.
            inputData = isr.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("실제 입력된 데이터: "+ (char)inputData);
    }
}
