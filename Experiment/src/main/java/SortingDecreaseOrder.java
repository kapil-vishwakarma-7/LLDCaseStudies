import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingDecreaseOrder {
    public static void main(String[] args) {
        Integer[] A = {1,3,56,10,9};

        Arrays.sort(A, Collections.reverseOrder());

        System.out.println(Arrays.toString(A));
    }
}
