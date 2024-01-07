import java.util.*;

class DistancebwPoints{
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        double dis;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter x1");
            x1= sc.nextInt();
            System.out.println("Enter y1");
            y1= sc.nextInt();
            System.out.println("Enter x2");
            x2= sc.nextInt();
            System.out.println("Enter y2");
            y2= sc.nextInt();
        }

        dis = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("distance between"+"("+x1+","+y1+")"+"("+x2+","+y2+")="+dis);
    }
}