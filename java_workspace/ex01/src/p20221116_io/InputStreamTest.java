package p20221116_io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
    //InputStream 클래스를 사용하여, 1개의 영문자(1byte)를 읽어들이는 프로그램
    public static void main(String[] args) {
        //키보드를 입력 스트림 객체에 할당한다. //키보드를 통해 메모리 쪽으로 단방향으로 정보전달함
        InputStream is = System.in; //입력 : abc
        //System.in, System.out, System.err는 표준 입출력을 위해,
        //자바가 내부적으로 자동 생성해두는 객체이기 때문에 별도로 객체생성 하지 않고 사용가능하다.
        int inputData = 0;
        System.out.print("데이터를 입력하세요 : ");

        try {
            //InputStream이 제공하는 read()메소드는 1byte를 읽어, 해당 문자의 정수코드 값을 반환한다.
            inputData = is.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("실제 입력된 데이터(정수): " + inputData); //출력: 97
        System.out.println("실제 입력된 데이터(문자): " + (char) inputData); //출력: a
        // 입력된 문자가 3글자이지만 왜 a만 출력될까? -> 1byte만 읽어들이기 때문에 첫글자만 입력되고, 나머지 글자들은 buffer에 존재
        // 한글은 최소 2byte를 읽어야하므로 한글을 입력하면 오류가 발생한다.
    }
}
