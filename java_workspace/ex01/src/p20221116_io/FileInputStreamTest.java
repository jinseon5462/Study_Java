package p20221116_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        //이번에는 키보드가 아닌 파일로 입력을 받아보자.
        FileInputStream fis;
        int inputData = 0;

        try {
            fis = new FileInputStream("/Users/jinseon/dev/java_workspace/ex01/src/p20221116_io/sample.txt/");
            //파일에서 1byte씩 데이터를 읽어 정수 코드값을 반환한다.
            //정수 값을 문자형으로 형변환(캐스팅)하여 출력한다.
            while((inputData = fis.read()) != -1){
                System.out.print((char)inputData);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
