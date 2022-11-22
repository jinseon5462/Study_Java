package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest04 {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fr = new FileReader("/Users/jinseon/dev/java_workspace/mySimpleBbs/src/io/abc.txt");
        System.out.println("종료!!");

    }
}
