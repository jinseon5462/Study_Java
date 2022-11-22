package p20221116_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonSerialTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/jinseon/dev/java_workspace/ex01/src/p20221116_io/PersonInfo.txt");
        ObjectOutputStream out = new ObjectOutputStream(fos);

        Person p1 = new Person("홍길동", "서울", 25);
        Person p2 = new Person("임꺽정", "부산", 35);

        out.writeObject(p1);
        out.writeObject(p2);

        out.close();
        System.out.println("객체가 파일에 직렬화되어 기록되었습니다.");
    }
}
