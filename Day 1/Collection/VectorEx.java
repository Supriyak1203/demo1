import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("One");
        v.add("Two");
        v.add("Three");
        
        System.out.println( v);
        v.remove("Two");
        System.out.println( v);
    }
}
