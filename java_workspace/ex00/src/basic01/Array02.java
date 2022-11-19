package basic01;

public class Array02 {
    public static void main(String[] args){
        int[][] A = new int[5][5];
        int i, j;
        int k = 0;

        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                A[i][j] = k + 1;
                k++;
            }
        }
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
    }
}
