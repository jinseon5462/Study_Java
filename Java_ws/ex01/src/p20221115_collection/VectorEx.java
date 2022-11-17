package p20221115_collection;

import java.util.Vector;
/*
Vector : 가변배열(배열의 용량이 다 차면 늘려준다.)

Vector<Integer> v = new Vector<>();
v.capacity() : 용량

 */
public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(5);
        v.add(4);
        v.add(-1);

        v.add(2, 100);

        System.out.println("벡터 내의 요소 객체 수 : " + v.size());
        System.out.println("벡터의 현재 용량 : " + v.capacity());

        //벡터의 모든 정수 출력하기
        for(int i = 0; i < v.size(); i++){
            int n = v.get(i);   //벡터의 i번째 정수
            System.out.println(n);
        }

        //벡터의 모든 정수 더하기
        int sum = 0;
        for(int i = 0; i < v.size(); i++){
            int n = v.elementAt(i);
            sum += n;
        }
        System.out.println("벡터에 있는 정수의 합 : " + sum);
    }
}
