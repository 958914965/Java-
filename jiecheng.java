import java.util.Scanner;

public class jiecheng {
    public static  int jie(int a) {
        int r = 1;
        for (int i = 1; i <=a; i++) {
            r*=i;
        }
        return r;
    }
public static int sum(int n){
        int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += jie(i);
    }

        return sum;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
