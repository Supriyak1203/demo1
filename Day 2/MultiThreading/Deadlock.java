
public class Deadlock {
     public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                synchronized (lock1) {
                    System.out.println("Thread 1");

                    try 
                    { 
                        Thread.sleep(100); 
                    } 
                    
                    catch (InterruptedException e) 
                    {
            
                    }

                    synchronized (lock2) {
                        System.out.println("Thread1");
                    }
                }
            }
        });

        
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                synchronized (lock2) {
                    System.out.println("Thread 2");

                    try { 
                        Thread.sleep(100); 
                    } 
                    catch (InterruptedException e) {

                    }

                    synchronized (lock1) {
                        System.out.println("Thread 2");
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
    

