package p20221116_io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutStreamWriter {
    public static void main(String[] args) throws IOException {
        char[] arr = new char[10];

        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);

        System.out.print("데이터를 입력하세요 : ");

        int input = isr.read(arr);
        System.out.println("Input : " + input);
        System.out.print("실제 입력된 글자 : ");

        osw.write(arr);
        osw.close();

    }
}
