public class Avg {
    public static double avg(int[] array) {
        double avg = 0.0;
        if(array==null||array.length==0){
            return avg;
        }
        for (int i = 0; i < array.length; i++) {
             avg += array[i];
        }
        avg /= array.length;
        return avg;

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(avg(array));
    }
}
