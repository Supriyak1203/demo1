public class ThreadLifecycle implements Runnable {

    public void run(){
        System.out.println("RUNNING");
        try{
            Thread.sleep(2000);
            }  
            catch(InterruptedException e){
                System.out.println(e.getMessage());

            }    
            
            }
    
    public static void main(String[] args) throws InterruptedException {
    ThreadLifecycle t1=new ThreadLifecycle();
    Thread t2=new Thread(t1);
     System.out.println(t2.getState());
     t2.start();
     System.out.println(t2.getState());
      Thread.sleep(1000);
      System.out.println(t2.getState());
      t2.join();
      System.out.println(t2.getState());
}
}
    


