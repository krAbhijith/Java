import java.util.Scanner;

class Conversions {
    public void convert_binary(int num){
        int [] binary = new int[40];
        int i=0;
        while (num>0) {
            binary[i] = num%2;
            num/= 2;
            i++;
        }
        for (int j = i-1; j >=0 ; j--) {
            System.out.print(binary[j]);
        }
    }
    public void convert_octal(int num){
        int rem;
        String str = "";
        char [] dig = {'0', '1', '2', '3', '4', '5', '6', '7'};
        while (num>0) {
            rem = num%8;
            str = dig[rem]+str;
            num/=8;
        }
        System.out.println(str);
    }
    public void convert_hdecimal(int num){
        int rem;
        String str = "";
        char [] dig = {'0', '1', '2', '3', '4', '5', '6', '7', '9', 'A', 'B', 'C', 'E', 'F'};
        while (num>0) {
            rem = num%16;
            str = dig[rem]+str;
            num/=16;
        }
        System.out.println(str);
    }
}

/**
 * BaseConversion
 */
class BaseConversion {
    public static void main(String[] args) {
        int dec;
        Conversions obj = new Conversions();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a decimal number");
            dec = sc.nextInt();
        }
        System.out.println("\n Binary represntation:");
        obj.convert_binary(dec);
        System.out.println("\n Octal represntation:");
        obj.convert_octal(dec);
        System.out.println("\n Hexadecimal represntation:");
        obj.convert_hdecimal(dec);
    }
}