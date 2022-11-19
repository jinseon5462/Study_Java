package p20221116_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/jinseon/dev/Java_ws/ex01/src/p20221116_io/sample_kor2.txt/");
        FileWriter fw = new FileWriter("/Users/jinseon/dev/Java_ws/ex01/src/p20221116_io/sample_kor.txt", true);

        int input = 0;
        while((input = fr.read()) != -1){
            fw.write(input);
        }
        fr.close();
        fw.close();
    }
}
