import java.util.Scanner;

public class Smallest_largest {
    public static void main(String[] args) {
        int n, temp;
        int [] arr;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many number do you want");
            n = sc.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter element"+(i+1)+":");
                arr[i]= sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\n The smallest number is:"+arr[n-1]);
        System.out.println("\n The largest number is:"+arr[0]);
        System.out.println("\n The second largest number is:"+arr[1]);
    }
}
