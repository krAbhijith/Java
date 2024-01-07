import java.util.Scanner;

class Area{
    double l, b, h, volume, r;
    void vol(double a, double c, double d){
        l = a;
        b = c;
        h = d;
        volume = l * b * h;
    }
    void vol(double a, double b){
        r = a;
        h = b;
        volume = 3.14 * r * r * h;
    }
    void vol(double a){
        l = a;
        volume = l * l * l; 
    }
    void display(){
        System.out.println("Volume ="+volume);
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Area a1 = new Area();
        double l, b, h, r;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length, breadth, height of the box ");
            l = sc.nextDouble();
            b = sc.nextDouble();
            h = sc.nextDouble();
            a1.vol(l, b, h);
            a1.display();
            System.out.println("Enter the radius & height of cylinder ");
            r = sc.nextDouble();
            h = sc.nextDouble();
            a1.vol(r, h);
            a1.display();
            System.out.println("Enter sides of cube ");
            l = sc.nextDouble();
        }
        a1.vol(l);
        a1.display();
    }
}
