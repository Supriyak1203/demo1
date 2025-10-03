
package demo1.Collection;
import java.util.HashMap;
import java.util.Map;
public class CollectiomExample3 {
    public static void main(String[] args) {
        Map<Integer,String> student=new HashMap<>();
        student.put(101,"supriya");
        student.put(102,"Anisha");
        student.put(103,"geeta");
        student.put(104,"sita");
        System.out.println(student.get(102));

    }
    
}
