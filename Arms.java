import java.util.*;
public class Arms {
    public static void main(String[] args) {
        int temp, digit, sum, n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the limit");
            n= sc.nextInt();
        }
        for (int index = 0; index < n; index++) {
            temp = index;
            sum = 0;
            while (temp!=0) {
                digit= temp%10;
                sum = sum+ (digit*digit*digit);
                temp /= 10;
            }
            if (sum == index) {
                System.out.println(index);
            }
        }
    }
}
