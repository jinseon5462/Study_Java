package p20221115_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[26];

        String str = "";
        StringBuffer sb = new StringBuffer(str);

        while(!str.equals(";")){
            str = sc.nextLine().toUpperCase();
            sb.append(str);
        }

        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                int idx = c - 'A';
                a[idx]++;
            }
        }

        for(int i = 0; i < a.length; i++) {
            System.out.print((char) (i + 'A'));
            for(int j = 0; j < a[i]; j++) {
                System.out.print("-");
            }
            System.out.println("(" + a[i] + ")");
        }
    }
}
