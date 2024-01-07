public class Number_Objects {
    static int count = 0;
    Number_Objects(){
        count ++;
    }
    public static void main(String[] args) {
        new Number_Objects();
        new Number_Objects();
        new Number_Objects();
        System.out.println("number of objects created: "+count);
    }
}
