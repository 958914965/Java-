import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int a = 0;
        int[] B = new int[A.length];
        for(int i = 0;i < A.length;i++) {
            B[i] = 1;
            for(int j = 0;j < A.length;j++){
                a = A[i];
                A[i] = 1;
                B[i] *= A[j];
                A[i] = a;
            }
        }
        return B;
    }
}