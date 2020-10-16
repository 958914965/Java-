public class BinarySearch {
    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if(key == array[mid]) {
                return mid;
            }
            if(key < array[mid]) {
                right = mid - 1;
            }
            if(key > array[mid]) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int a =binarySearch(array,20);
        System.out.println(a);
     }
}
