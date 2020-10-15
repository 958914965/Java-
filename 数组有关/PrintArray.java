public class PrintArray {
    public static void printArray(int[] array) {
        if (array == null ) {
            System.out.println("null");
            return;
        }
        if (array.length == 0) {
            System.out.println("[]");
            return ;
        }
        System.out.print("[ ");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println(array[array.length-1]+" ]");
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        printArray(array);
    }
}
