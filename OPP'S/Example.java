class A{
    String str1="Supriya";
    void demo(){
        System.out.println("hii for class a");
    }
}

class B extends A{
    String str2="Sita";
    void start(){
        System.out.println("hiii for class b");
    }
}



public class Example {
    public static void main(String[] args) {

        B obj=new B();
        System.out.println(obj.str1);
        System.out.println(obj.str2);
        obj.demo();obj.start();
        
    }
    
}
