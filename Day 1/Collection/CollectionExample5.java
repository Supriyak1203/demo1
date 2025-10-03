package demo1.Collection;

import java.util.LinkedList;

public class CollectionExample5 {

    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Pune");
        ll.add("Mumbai");
        ll.add("AliyaNagar");
        ll.add("Solapur");
        ll.add("Baramati");

        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);

        for(String city : ll){
            System.out.println(city);
        }
        
    }
    
}
