package p20221116_io;

import java.io.*;

public class FileTest02 {
    public static void main(String[] args) throws IOException {

        String path = "/Users/jinseon/dev/Java_ws/ex01/src/";
        File d = new File(path);

        File[] files = d.listFiles();
        for(int i = 0; i < files.length; i++){
            if(files[i].getName().equals("alpha.txt")){
                String fileName = "copy_alpha.txt";
                FileReader fr = new FileReader(path + "alpha.txt");
                BufferedReader br = new BufferedReader(fr);

                FileWriter fw = new FileWriter(path + fileName);
                BufferedWriter bw = new BufferedWriter(fw);
                String line;
                while((line = br.readLine()) != null){
                    bw.write(line);
                    bw.newLine();
                }
                bw.close();
                fw.close();
            }

        }
    }
}
