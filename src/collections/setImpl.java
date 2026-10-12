package collections;
import java.util.*;

public class setImpl {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        System.out.println(set);
        set.remove(10);
        System.out.println(set);
    }
}