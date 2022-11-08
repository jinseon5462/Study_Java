package p20221029_stringexample;

public class StringEx02 {
    public static void main(String[] args){
        String str1 = "ABC DEFG";
        String str2 = "ABC DEFG";
        String str3 = "ABCDEFG";
        // ==
        if(str1 == str2) {
            System.out.println("두 문자열은 같습니다.");
        }else{
            System.out.println("두 문자열은 다릅니다.");
        }

        //.equals()
        if(str1.equals(str2)){
            System.out.println("두 문자열은 같습니다.");
        }else{
            System.out.println("두 문자열은 다릅니다.");
        }

        // true or false
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}