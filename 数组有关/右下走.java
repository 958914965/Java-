import java.util.Scanner;
public class Main {
    public static int fanc(int n,int m) {
        if(n==1) {
            return m+n;
        }
        if(m==1) {
            return n+m;
        }
        int sum = 0;
        sum += fanc(n,m-1)+fanc(n-1,m);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while(sc.hasNext()){
            int n= sc.nextInt();
            int m= sc.nextInt();
        System.out.println(fanc(n, m));
    }
}
}