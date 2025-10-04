
    class MyThread1 implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        MyThread1 t1 = new MyThread1();
        Thread t2=new Thread(t1) ;
        t2.start(); 
         
    }
}




