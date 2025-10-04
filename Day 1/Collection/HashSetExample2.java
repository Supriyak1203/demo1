
import java.util.HashSet;
import java.util.Set;
public class HashSetExample2 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Supriya");
        set.add("Pratik");
        set.add("Supriya");
        set.add("Pratik");
        set.add("Krushana");
        System.out.println(set);
    }
    
}
