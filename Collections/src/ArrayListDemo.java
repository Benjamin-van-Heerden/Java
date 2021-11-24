import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>(5);
        // populate

        for (int a = 0; a < 5; a++) {
            array.add(a);
        }

        System.out.println(array);

        // remove the third element and add 42 twice (size can change dynamically)
        array.remove(2);
        array.add(42);
        array.add(42);
        System.out.println(array);

        // print individually
        for (int a = 0; a < array.size(); a++) {
            System.out.println(array.get(a));
        }

        // or
        for (int i : array) {
            System.out.println(i);
        }

    }
}
