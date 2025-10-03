import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<String> ts=new TreeSet<>();
        ts.add("Mumbai");
        ts.add("Pune");
        ts.add("AliyaNagar");
        ts.add("Nashik");
        ts.add("Mumbai");
        
        System.out.println(ts);

        for(String city:ts){
            System.out.println(city);
        }
        
        
        
    }
}


