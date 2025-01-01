
import java.util.*;

public class DequeUsingJCF {
    public static void main(String[] args) {
        
        Deque <Integer> DQ = new LinkedList<>();

        DQ.addFirst(1);
        DQ.addFirst(2);
        DQ.addFirst(3);

        System.out.println(DQ);
        
        DQ.removeFirst();
        System.out.println(DQ);
        
        DQ.addLast(4);
        DQ.addLast(5);
        System.out.println(DQ);
        
        DQ.removeLast();
        System.out.println(DQ);
        
        System.out.println("First Element : "+DQ.getFirst());
        System.out.println("Last Element : "+DQ.getLast());

    }
}
