package demo1.Collection;

import java.util.ArrayList;

public class CollectionExample4 {
    public static void main(String[] args) {
        
        ArrayList<Integer> al=new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);

        al.remove(3);
        System.out.println(al);

        for(int i =al.size()-1; i>=0; i--)
        System.out.println(al.get(i));
    }
    
}
