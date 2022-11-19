package p20221116_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonDeSerialTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("/Users/jinseon/dev/Java_ws/ex01/src/p20221116_io/PersonInfo.txt/");
        ObjectInputStream in = new ObjectInputStream(fis);

        Person p1 = (Person)in.readObject();
        Person p2 = (Person)in.readObject();

        System.out.println(p1);
        System.out.println(p2);

        in.close();
    }
}
