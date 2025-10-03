package demo1.Collection;
import java.util.ArrayList;


public class CollectionExample {
    public static void main(String [] args){
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("graphes");
        fruits.add("Mango");

        System.out.println(fruits);

        System.out.println(fruits.get(3));

        fruits.remove("graphes");
        System.out.println(fruits);

        System.out.println(fruits.subList(1, 3));
    }
}
