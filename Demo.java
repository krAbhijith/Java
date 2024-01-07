class A {
    A(){
        System.out.println("This is constructor of class A");
    }
}
class B extends A{
    B(){
        System.out.println("This is constructor of class B");
    }
}
class C extends B {
    C(){
        System.out.println("This is constructor of class C");
    }
}
public class Demo {
    public static void main(String[] args) {
        new C();
    }
}
