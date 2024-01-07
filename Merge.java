import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        int s1,  s2, s;
        int [] a1 = new int[50];
        int [] a2 = new int[50];
        int [] a3 = new int[100];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array1 size");
            s1 = sc.nextInt();
            System.out.println("Enter Array1 Elements");
            for (int i = 0; i < s1; i++) {
                a1[i] = sc.nextInt();
            }
            System.out.println("Enter array2 size");
            s2 = sc.nextInt();
            System.out.println("Enter Array2 Elements");
            for (int i = 0; i < s2; i++) {
                a2[i] = sc.nextInt();
            }
        }
        for (int i = 0; i < s1; i++) {
            a3[i] = a1[i];
        }
        s = s1 + s2;
        for (int i = 0, k = s1;  i < s2 && k < s; i++, k++) {
            a3[k] = a2[i];
        }
        System.out.println("merged array is:");
        for (int i = 0; i < s; i++) {
            System.out.print(a3[i]+" ");
        }
    }
}
