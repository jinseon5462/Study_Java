package p20221115_collection;

import java.util.Vector;

/*
Math.ceil() : 올림
Math.floor() : 내림
Math.sqrt() : 제곱근
Math.exp() : e(오일러상수, 자연 로그의 밑)의 4승
Math.round() : 반올림
 */
public class MathEx {
    public static void main(String[] args) {
        //System.out.println(Math.PI);
        double pi = Math.PI;
        System.out.println(pi);
        System.out.println(Math.ceil(pi));
        System.out.println(Math.floor(pi));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.exp(4));
        System.out.println(Math.round(3.14));

        System.out.println("\n이번주 행운번호는 ");
        for(int i = 0; i < 5; i++){
            System.out.println((int)(Math.random() * 45 + 1) + " ");
        }
    }
}
