package Comparator;
import java.util.Arrays;
import java.util.Comparator;

public class comparatorEX {
    public static void main(String[] args) {

        Integer[] arr = {5, 2, 8, 1, 3};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(b, a);
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
