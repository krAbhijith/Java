
class EvenThread implements Runnable{
    int i,s=0;
    public void run(){
        for (int i = 0; i < 10; i++) {
            if (i%2 == 0) {
                System.out.println(+i);
            }
        }
    }
}
class OddThread implements Runnable{
    int i,s=0;
    public void run(){
        for (int i = 0; i < 10; i++) {
            if (i%2 != 0) {
                System.out.println(+i);
            }
        }
    }
}

/**
 * ThreadEvenOdd
 */
public class ThreadEvenOdd {
    public static void main(String[] args) {
        EvenThread st = new EvenThread();
        Thread th = new Thread(st, "Even Thread");
        System.out.println("thread is crated "+th.getName());
        th.start();
        OddThread sd = new OddThread();
        Thread td = new Thread(sd, "Odd Thread");
        System.out.println("thread is crated "+td.getName());
        td.start();
    }
}