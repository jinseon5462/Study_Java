package p20221115_collection;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        /*
        split과 비슷한 기능
        true라고 치면 delim(구분자) 같이 출력
        구분자는 여러개, 공백도 가능하나 하나씩인정 /, 두개 동시에 인정은 안됨
         */

        StringTokenizer st = new StringTokenizer("홍길동*장화*홍련*콩쥐*팥쥐","*:/,", true);
        String str = "abc*def*ghi";
        //String[] ss = str.split("*");
        //System.out.println(ss[0]);

        while(st.hasMoreTokens()) { //st.hasMoreTokens boolean타입
            System.out.println(st.nextToken()); //st출력문
        }
    }
}
