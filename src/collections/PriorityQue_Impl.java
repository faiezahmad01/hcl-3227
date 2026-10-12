package collections;
import java.util.*;

public class PriorityQue_Impl {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(9);
        pq.add(7);
        while(!pq.isEmpty()){
            System.out.println(pq.poll()+" ");
        }
    }
}
