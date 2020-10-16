import java.util.Arrays;

public class CopyOf {
    public static int[] copyOf(int[] array) {
        int[] ary = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ary[i] = array[i];
        }
        return ary;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] ary = copyOf(array);
        ary[0] = 99999;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ary));
    }
}
