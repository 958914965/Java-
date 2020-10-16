public class Max {
    public static int max(int[] array) {
        if (array == null || array.length==0) {
            return -1;
        }
        int a = array[0];
        for (int i = 1; i < array.length; i++) {
            a = a > array[i] ? a : array[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,-6};
        int a =max(array);
        System.out.println(a);
    }
}
