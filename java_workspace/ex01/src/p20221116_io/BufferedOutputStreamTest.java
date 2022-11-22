package p20221116_io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/jinseon/dev/java_workspace/ex01/src/p20221116_io/alpha.txt", true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        for(int i = 'a' - 32; i < 'z' - 32; i++){
            bos.write(i);
        }
        bos.close();
    }
}
