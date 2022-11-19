package p20221029_stringexample;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("문장을 입력하세요 >> ");
        String str = sc.nextLine();

        System.out.print("숫자를 입력하세요 >> ");
        int n = sc.nextInt();

        System.out.print("단어를 입력하세요 >> ");
        String ch = sc.next();

        String st1 = sc.nextLine(); // nextLine은 엔터까지 받아가기때문에 엔터를 미리 받아준다.

        System.out.print("문장2를 입력하세요 >> ");
        String st2 = sc.nextLine();


        System.out.println(str);
        System.out.println(n);
        System.out.println(ch);
        System.out.println(st2);
    }
}