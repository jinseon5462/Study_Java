package p20221115_collection;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        while(true){
            String str = sc.nextLine();

            if(str.equals(";")){
                break;
            }
            sb.append(str);
        }
        String s = sb.toString().toLowerCase();
        System.out.println(sb.toString());
    }
}
