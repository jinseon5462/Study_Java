package p20221115_collection;

public class StringBufferEx01 {
    /*
    StringBuffer 클래스도 String 클래스처럼 문자열을 다룬다.
    String 객체의 경우 내부의 문자열을 수정할 수 없다.(다시 만들어야한다.)
    StringBuffer 객체의 경우 문자열을 저장하는 가변 버퍼를 가지고 있다.
    그래서 저장된 문자열의 수정이 가능하다.
    간단한 문자열을 처리하는 경우에는 String클래스를 이용하고,
    문자열의 길이가 길거나 수시로 변하는 경우에는 StringBuffer 클래스를 이용한다.(가급적)
     */

    public static void main(String[] args) {
        //StringBuffer sb = new StringBuffer();   //내부 버퍼의 크기가 16인 객체 생성
        StringBuffer sb = new StringBuffer("Java");    //'Java'로 초기화된 객체 생성
        //StringBuffer sb3 = new StringBuffer(2000);  //버퍼 크기를 2000으로 초기화한 객체 생성

        sb.append("는 정말 ");
        sb.append("재미있다고 하고 싶다.");
        System.out.println(sb);
        sb.replace(11, 12, "없");
        System.out.println(sb);

        /*
        StringBuffer sb2 = new StringBuffer("This");
        sb2.append(" is pencil");   //문자열 이어붙이기
        sb2.insert(7, " my");   //문자열 삽입하기
        System.out.println(sb2);
        sb2.replace(8, 10, "your"); //문자열 수정하기
        System.out.println(sb2);
        sb2.delete(8, 13);  //문자열 삭제하기
        System.out.println(sb2);
        sb2.setLength(4);   //문자열 길이 조정하기
        System.out.println(sb2);
         */
    }
}
