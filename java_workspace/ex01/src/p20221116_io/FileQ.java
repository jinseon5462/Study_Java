package p20221116_io;

import java.io.*;

public class FileQ {
    public static void main(String[] args) throws IOException {
        String path = "/Users/jinseon/dev/java_workspace/ex01/src/";
        File d = new File(path);
        String fileName = "xxxx.txt";

        File[] files = d.listFiles();

        for(int i = 0; i < files.length; i++){
            if(files[i].getName().contains(".txt")){
                FileReader fr = new FileReader(path + files[i].getName());
                BufferedReader br = new BufferedReader(fr);

                FileWriter fw = new FileWriter(path + fileName, true);
                BufferedWriter bw = new BufferedWriter(fw);

                String line;
                while((line = br.readLine()) != null){
                    bw.write(line);
                    bw.newLine();
                }
                bw.close();
                br.close();
            }
        }
    }
}