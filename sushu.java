import java.math.MathContext;
import java.util.Map;
import java.util.Scanner;

public class sushu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        for ( ;i < n; i++) {
            if (n % i == 0) {
                System.out.println("false");
                break;
            }
        }
        if(i >= n) {
            System.out.println("right");
        }
    }
}
