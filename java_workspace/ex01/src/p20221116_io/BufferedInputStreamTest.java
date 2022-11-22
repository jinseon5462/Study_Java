package p20221116_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamTest {
    public static void main(String[] args) throws IOException {
        int inputData = 0;
        // 파일명을 인수로 하여 스트림(Input) 생성
        FileInputStream fis = new FileInputStream("/Users/jinseon/dev/java_ws/ex01/src/p20221116_io/sample.txt/");
        // FileInputStream을 인수로 하여 보조스트림 생성
        // InputStream의 보조이므로 BufferedInputStream임.
        // 버퍼를 사용하는 보조스트림.
        // 버퍼란? 메모리에 생성되는 임시 기억장소.
        // 사용하는 이유? 데이터 처리속도 개선(빠르게)

        BufferedInputStream bis = new BufferedInputStream(fis);

        while((inputData = bis.read()) != -1){
            System.out.print((char) inputData);
        }
        bis.close();
    }
}
