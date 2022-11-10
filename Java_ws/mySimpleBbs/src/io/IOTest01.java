package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class IOTest01 {
    public static void main(String[] args) {
        //1. 파일쓰기
        try {
            //1. 파일선언
            File file = new File("/Users/jinseon/dev/Java_ws/mySimpleBbs/src/io/abc.txt");
            //2. 파일 쓰기
            FileWriter fw = new FileWriter(file, false);	// false 새로쓰기
            fw.write("hello\n");
            fw.close();

            //3. 파일 읽기(읽기모드로 파일에 연결)
            FileReader fr = new FileReader(file);

            int data = 0;
            while((data = fr.read()) != -1) {
                System.out.print((char)data);
            }
            fr.close();
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("........");
        //1. 파일선언
        //2. 파일쓰기(쓰기모드로 파일에 연결)

    }
}