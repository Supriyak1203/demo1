

public class ThreadPriority extends Thread {
    ThreadPriority (String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0; i<=5; i++)
        System.out.println(Thread.currentThread().getName() + "-Priority: " + Thread.currentThread().getPriority() + "-Count" +i);
        Thread.yield();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) {
        ThreadPriority t1=new ThreadPriority("Max");
        ThreadPriority t2=new ThreadPriority("Min");
        ThreadPriority t3=new ThreadPriority("normal");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t1.interrupt();
    }
    
}
