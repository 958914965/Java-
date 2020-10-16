import java.util.Arrays;

public class BulledSort {
        public static void pao(int[] array) {
        int a = 0;

        for (int i = 1; i < array.length; i++) {
            boolean b = false;
            for (int j = 0; j < array.length-i; j++) {
                if(array[j] > array[j+1]) {
                    a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                    b = true;
                }
                System.out.print(b+"  ");
            }
            System.out.println();
            if(b == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,9,8,7};
        pao(array);
        System.out.println(Arrays.toString(array));
    }
}
