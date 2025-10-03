package demo1.RuntimeException;

public class IillegalAgrumentException {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println("thread Running");

        t.start();
        t.start();
    }
    
}
