import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        int n, temp;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements");
            n =sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }   
                }
            }
            System.out.println("ascending order");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]+" ");
            }
        }
    }
}
