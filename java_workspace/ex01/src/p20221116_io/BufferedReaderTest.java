package p20221116_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        String inputData = null;

        FileReader fr = new FileReader("/Users/jinseon/dev/Java_ws/ex01/src/p20221116_io/sample_kor.txt/");
        BufferedReader br = new BufferedReader(fr);
        //StringBuffer sb = new StringBuffer();

        while((inputData = br.readLine()) != null){
            System.out.println(inputData);
            //sb.append(inputData + "\n");
        }
        //String str = sb.toString();
        //System.out.println(str);

        br.close();
        //fr.close();
    }
}
