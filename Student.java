import java.util.*;

class Students {
    String name = new String();
    String course = new String();
    int roll_no;
    Scanner sc = new Scanner(System.in);
    void read(){
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Enter the Course");
        course = sc.nextLine();
        System.out.println("Enter the Roll no");
        roll_no = sc.nextInt();
    }
    void display(){
        System.out.println("name : " +name);
        System.out.println("Course : " +course);
        System.out.println("RollNo : " +roll_no);
    }
}

/**
 * InnerStudents
 */
class Result extends Students {
    int m1, m2, m3, m4, m5;
    double total, avg;
    char grade;
    Scanner sc = new Scanner(System.in);
    void read_mark(){
        super.read();
        System.out.println("Enter 5 marks out of 50");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();
        total = m1+m2+m3+m4+m5;
        avg = ((total/5)/50)*100;
        if (avg>80) {
            grade = 'A';
        } else if (avg>70) {
            grade = 'B';
        }else if (avg>60) {
            grade = 'C';
        }else if (avg>50) {
            grade = 'D';
        }else if (avg>40) {
            grade = 'E';
        }else if (avg>30) {
            grade = 'F';
        }
    }
    void display_result(){
        super.display();
        System.out.println("total = " +total);
        System.out.println("Avarage = " +avg);
        System.out.println("grade = " +grade);
    }
}
public class Student {
    public static void main(String[] args) {
        Result r1 = new Result();
        r1.read_mark();
        r1.display_result();
    }
}
