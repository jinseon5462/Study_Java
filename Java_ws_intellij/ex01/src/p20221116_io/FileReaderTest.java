package p20221116_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        int inputData = 0;

        try {
            fr = new FileReader("/Users/jinseon/dev/Java_ws/ex01/src/p20221116_io/sample_kor.txt/");
            while((inputData = fr.read()) != -1){
                System.out.print((char) inputData);
            }
            fr.close();
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
