
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.addFirst("A");
        dq.addLast("B");
        dq.addLast("C");
        
        System.out.println("Deque: " + dq);
        dq.removeFirst();
        System.out.println("After removing first: " + dq);
    }
}