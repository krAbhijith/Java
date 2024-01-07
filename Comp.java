import java.util.Scanner;

class Complex{
    int x, y;
    Complex(int s, int w){
        x=s;
        y=w;
    }
    void sum(Complex obj2){
        x = x + obj2.x;
        y = y + obj2.y;
    }
    void display(){
        System.out.println(x+"+i"+y);
    }
}
public class Comp {
    public static void main(String[] args) {
        int m, n, p, q;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the real & imaginary part of first complex number");
            m = sc.nextInt();
            n = sc.nextInt();
            System.out.println("Enter the real & imaginary part of Second complex number");
            p = sc.nextInt();
            q = sc.nextInt();
        }
        Complex obj1 = new Complex(p, q);
        Complex obj2 = new Complex(m, n);
        obj1.sum(obj2);
        System.out.println("sum is :");
        obj1.display();
    }
}
