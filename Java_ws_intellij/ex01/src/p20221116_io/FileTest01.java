package p20221116_io;

import java.io.*;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/jinseon/dev/Java_ws/ex01/src";
        String path = "/Users/jinseon/dev/Java_ws/ex01/src/";
        File d = new File(fileName);

        if(!d.exists() || !d.isDirectory()) {
            System.out.println(fileName + "은 없는 디렉토리입니다.");
            System.exit(0);// 시스템 강제종료
        }
        File[] files = d.listFiles();
        System.out.println("파일/디렉토리 수 : " + files.length);

        for(int i = 0; i < files.length; i++){
            //System.out.println("파일 이름 : " + files[i].getName());
            //System.out.println("파일 경로 : " + files[i].getPath());
            //System.out.println("파일 절대 경로 : " + files[i].getAbsolutePath());
            //System.out.println("현재 디렉토리 : " + files[i].getParent());
            //System.out.println("읽기 가능 : " + files[i].canRead());
            //System.out.println("쓰기 가능 : " + files[i].canWrite());
            //System.out.println("파일 크기 : " + files[i].length());
        }
        FileInputStream fis = new FileInputStream(path + "alpha.txt");
        FileOutputStream fos = new FileOutputStream(path + "copy_alpha.txt");
        int input = 0;

        for(int i = 0; i < files.length; i++){
            if(files[i].getName().equals("alpha.txt")){
                while((input = fis.read())!= -1){
                    fos.write(input);
                }
            }
        }
        fos.close();
        fis.close();
    }
}
