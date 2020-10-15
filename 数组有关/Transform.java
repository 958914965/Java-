import java.util.Arrays;

public class Transform {
    public static void transform(int[] array) {
        if(array==null||array.length==0){
            System.out.println("error");
            return ;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i]*2;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        transform(array);
        System.out.println(Arrays.toString(array));
    }
}
