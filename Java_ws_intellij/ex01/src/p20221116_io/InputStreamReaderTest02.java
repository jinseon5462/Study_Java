package p20221116_io;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest02 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        int inputData = 0;

        //키보드로 입력받은 문자 10개를 저장 할 수 있는 배열을 만든다.
        //자바에서의 char type은 2byte다.
        char[] temp = new char[10];

        System.out.print("데이터를 입력하세요: ");

        try {
            //InputStreamReader의 read(char 배열) 메소드가 char배열을 인수로 가졌을 경우,
            //배열의 크기만큼 문자를 읽어들인 후 읽어들인 문자의 수를 반환한다.
            inputData = isr.read(temp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < inputData; i++){ //배열에 입력된 데이터 숫자를 반환해줌
            System.out.print(temp[i]);
        }
    }
}