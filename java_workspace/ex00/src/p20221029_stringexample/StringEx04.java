package p20221029_stringexample;

import java.util.Scanner;

public class StringEx04 {
    public static void main(String[] args){
        /*
        String myId = "lee1594";
        String myPw = "d32912327@";

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");
        String inputId = sc.nextLine();

        //String a = sc.nextLine();
        System.out.print("비밀번호를 입력하세요 : ");
        String inputPw = sc.nextLine();

        if(inputId.equals(myId) && inputPw.equals(myPw)){
            System.out.println("로그인 성공!");
        }else{
            System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
        }

         */

        int count = 0;

        do{
            String myId = "lee1594";
            String myPw = "d32912327@";
            Scanner sc = new Scanner(System.in);
            System.out.print("아이디를 입력하세요 : ");
            String inputId = sc.nextLine();

            System.out.print("비밀번호를 입력하세요 : ");
            String inputPw = sc.nextLine();

            if(inputId.equals(myId) && inputPw.equals(myPw)){
                System.out.println("로그인 성공!!!");
            }else{
                System.out.println("\n아이디 또는 비밀번호가 일치하지 않습니다.\n");
            }
            count++;
        }while(count < 3);
        System.out.println("3회연속 아이디, 비밀번호 오류");
    }
}