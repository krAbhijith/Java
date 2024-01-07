import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        int n, a=0, b=0, c=1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter value of n");
            n= sc.nextInt();
        }
        System.out.println("Fibonacci Series:");
        for(int i=1; i<=n; i++){
            a = b;
            b = c;
            c = a+b;
            System.err.println(a);
        }
    }
}