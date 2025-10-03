

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 class Student implements Comparable<Student>{
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public int compareTo(Student s){
        return this.name.compareTo(s.name);
    } 

    @Override
    public String toString(){
        return id + " - " +name;
    }

    
}

public class CollectionEx{
    public static void main(String [] args){
        List<Student> list=new ArrayList<>();
        list.add(new Student(101, "Supriya"));
        list.add(new Student(102, "Priya"));
        list.add(new Student(103, "Sita"));
        list.add(new Student(104, "Supriya"));

        Collections.sort(list);
        System.out.println("Soretd by name" +list);

         Collections.sort(list, (a,b) -> a.id-b.id);
           System.out.println("Soretd by id" +list);

    }
}
