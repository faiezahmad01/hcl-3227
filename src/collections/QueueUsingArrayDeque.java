package collections;
import java.util.*;

public class QueueUsingArrayDeque {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=1;i<=5;i++){
            q.offer(i);
        }
        System.out.println(q);
        System.out.println(q.poll());
        q.offer(1);
        System.out.println(q);
    }
}
