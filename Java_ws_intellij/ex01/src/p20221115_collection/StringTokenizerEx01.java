package p20221115_collection;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {
    public static void main(String[] args) {
        String str = "2+3+5+66+88+323";
        StringTokenizer st = new StringTokenizer(str, "+");
        int sum = 0;

        while(st.hasMoreTokens()){
            //System.out.println(Integer.parseInt(st.nextToken()));
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
    }
}
