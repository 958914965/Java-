public class Sum {
    public static int sum(int[] array) {
        int sum = 0;
        if(array==null||array.length==0){
            return sum;
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(sum(array));
    }
}
