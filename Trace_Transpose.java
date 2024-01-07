import java.util.Scanner;

public class Trace_Transpose {
    public static void main(String[] args) {
        System.out.println("Enter rows and cols");
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int arr[][] = new int[row][col];
            System.out.println("Enter matrix");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j]= sc.nextInt();
                    System.out.println(" ");
                }
            }
            System.out.println("entered Matrix is :");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(" ");
            }
            int trace = 0;
            for (int i = 0; i < row; i++) {
                trace += arr[i][i];
            }
            System.out.println("Trace of the matrix is :"+ trace);
            System.out.println("Transpose of the matrix is :");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[j][i] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
