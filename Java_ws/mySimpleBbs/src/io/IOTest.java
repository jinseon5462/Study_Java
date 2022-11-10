package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/io/abc.txt");
        FileWriter fw;
        try{
            fw = new FileWriter(file, false);
        } catch (IOException e) {

            e.printStackTrace();
        }
        fw.write("hello\n");

        fw.close();
    }
}
