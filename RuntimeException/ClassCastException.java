package demo1.RuntimeException;

public class ClassCastException {
    public static void main(String[] args) {
        Object obj=new Integer(100);
        String str=(String) obj;
        System.out.println(str);
    }
    
}
