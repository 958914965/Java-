import java.util.Scanner;

public class Hanoti {
    public static void hanoti(int n,char a,char b,char c) {
        if(n==1) {
            run(a,c);
            return ;
        } else {
            hanoti(n-1,a,c,b);
            run(a,b);
            hanoti(n-1,b,a,c);
        }
    }
    public static void run (char a,char b) {
        System.out.print(a + "->" + b +"  ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a = 'A';
        char b = 'B';
        char c = 'C';
        hanoti(n,a,b,c);
    }
}
