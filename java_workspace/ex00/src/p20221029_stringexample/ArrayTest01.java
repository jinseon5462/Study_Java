package p20221029_stringexample;

public class ArrayTest01 {
    public static void main(String[] args){
        int[] arr = new int[10];
        int n = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = n++;
        }
    }
}