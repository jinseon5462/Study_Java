package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class IOTest01 {
    public static void main(String[] args) {
        //1. 파일쓰기
        try {
            //1. 파일선언
            File file = new File("/Users/jinseon/dev/java_workspace/mySimpleBbs/src/io/abc.txt");
            //2. 파일 쓰기
            FileWriter fw = new FileWriter(file, false);	// false 새로쓰기, true 이어쓰기
            fw.write("hello\n");
            fw.close();

            //3. 파일 읽기(읽기모드로 파일에 연결)
            FileReader fr = new FileReader(file);

            int data = 0;
            while((data = fr.read()) != -1) {   // -1 파일의 끝까지 반복하면서 문자를 하나씩 가져오겠다는뜻이다.
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