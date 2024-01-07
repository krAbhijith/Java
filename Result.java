
import java.util.*;
class Reverse {
    int sum(int num){
        int rem, s=0;
        while(num>0){
            rem = num%10;
            s += rem;
            num /=10;
        }
        return s;
    }
    int rev(int num){
        int rem, s=0;
        while(num>0){
            rem = num%10;
            s = (s*10) + rem;
            num /=10;
        }
        return s;
    }
}
public class Result {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        Reverse obj = new Reverse();
        int s = obj.sum(n);
        int r = obj.rev(n);
        System.out.println("Sum is:"+ s); 
        System.out.println("Reverse is:"+ r); 
    }
}
