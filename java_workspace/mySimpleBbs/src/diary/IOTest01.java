package diary;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class IOTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("날짜를 입력하세요 : ");
            String date = sc.nextLine();
            String fileName = "diary_" + date + ".txt";

            File file = new File("/Users/jinseon/dev/java_workspace/mySimpleBbs/src/diary/" + fileName);
            FileWriter fw = new FileWriter(file, true);
            String str = "";

            while(!(str.equalsIgnoreCase("끝!!"))){
                str = sc.nextLine();
                fw.write(str + "\n");
            }
            fw.close();
            System.out.println("diary 작성완료!!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}