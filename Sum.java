import java.util.*;
public class Sum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First no:");
            int n1 = sc.nextInt();
            System.out.println("Second no:");
            int n2 = sc.nextInt();
            System.out.println("num1+num2="+(n1+n2));
            System.out.println("num1-num2="+ (n1-n2));
            System.out.println("num1*num2="+(n1*n2));
            System.out.println("num1/num2="+(n1/n2));
            System.out.println("num1%num2="+(n1%n2));
        }
    }
}
