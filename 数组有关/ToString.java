public class ToString {
    public static String toString(int[] array) {
        if(array == null) {
            return "";
        }
        if(array.length == 0) {
            return "[]";
        }
        String r = "[ ";
        for (int i = 0; i < array.length-1; i++) {
            r = r +array[i]+ ",";
        }
        r = r + array[array.length-1] + " ]";
        return r;
    }


    public static void main(String[] args) {
        int[] array = {1,23,4,5,6,8,8};
        System.out.println(toString(array));
    }
}
