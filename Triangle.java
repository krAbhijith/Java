import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double a, b, c, s, area;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the sides of a triangle");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
        if ((a+b) > c && (b+c)>a && (a+c)>b) {
            if (a==b && b==c) {
                System.out.println("equilateral triangle");
            }else if (a==b || b==c || a==c) {
                System.out.println("isoceles triangle");
            }else{
                System.out.println("Scalene triangle");
            }
            s = (a+b+c)/2;
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("area="+area);
        }else{
            System.out.println("cannot form a triangle");
        }
    }
}
