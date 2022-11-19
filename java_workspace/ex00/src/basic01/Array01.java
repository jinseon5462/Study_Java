package basic01;

public class Array01 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        int n = 2;
        int m = 1;

        for (int i = 1; i < A.length; i += 2) {
            A[i] = n;
            n += 2;
        }
        for (int i = 0; i < B.length; i += 2) {
            B[i] = m;
            m += 2;
        }
        for (int i = 1; i < C.length; i += 2) {
            C[i] = A[i];
        }
        for (int i = 0; i < C.length; i += 2) {
            C[i] = B[i];
        }
        for (int i = 0; i < C.length; i++) {
            System.out.printf("C[%d] : %d\n", i, C[i]);
        }
    }
}
