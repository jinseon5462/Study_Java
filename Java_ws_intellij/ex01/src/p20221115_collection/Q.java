package p20221115_collection;

public class Q {
    /*
    텍스트를 키보드로 입력받아 알파벳이 아닌 문자는 제외하고
    영문자 히스토그램을 만들어보자. 싫어도 만들자
    대문자와 소문자는 모두 같은것으로 간주하고,
    세미콜론(;)만 있는 라인을 만나면 입력의 끝으로 해석한다.
     */
    public static void main(String[] args) {
        int[] a = new int[26];
        String str = "hello java";

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                int idx = c - 'a';
                a[idx]++;
            }
        }

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
    }
}
