import java.util.Scanner;
public class Near {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            double num = sc.nextDouble();
            if((num%1)>=0.5){System.out.println((int)(num+1.0-num%1));}
            else {System.out.println((int)(num-num%1));}
    }
}
