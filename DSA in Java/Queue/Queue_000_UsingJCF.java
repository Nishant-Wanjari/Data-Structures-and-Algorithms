import java.util.*;

public class QueueUsingJCF {
    public static void main(String args[]){
        Queue <Integer> queue = new LinkedList <>(); 
        //Queue <Integer> queue = new ArrayDeque <>(); 
        
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }

    } 
}
