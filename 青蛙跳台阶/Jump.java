import java.util.Scanner;

public class Jump {
    public static int jump(int n) {
        if(n==1||n==2){
            return n;
        }

        int a = jump(n-1)+jump(n-2);
        return a;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(jump(n));
    }
}
