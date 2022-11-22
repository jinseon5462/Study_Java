package p20221116_io;

import java.io.*;
import java.util.StringTokenizer;

public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/jinseon/dev/java_workspace/ex01/src/p20221116_io/sample_kor.txt/");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("/Users/jinseon/dev/java_workspace/ex01/src/p20221116_io/output.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        int count = 1;

        String line = br.readLine();
        while(line != null){
            StringTokenizer st = new StringTokenizer(line, " ");
            while(st.hasMoreTokens()){
                if(st.nextToken().equals("java")){
                    bw.write(line);
                    bw.flush();
                    bw.newLine();
                    break;
                }
            }// while
            line = br.readLine();
        }// while
    }
}
