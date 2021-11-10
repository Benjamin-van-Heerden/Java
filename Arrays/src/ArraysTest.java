import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] oneD = {1, 2, 3, 4};
        for (int j : oneD) {
            System.out.println(j);
        }
        // read the colon as "in"
        System.out.println("###");

        int[][] twoD = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int count = 0;
        for (int[] parent : twoD) {
            for (int child : parent) {
                System.out.println(child + " is the " + count + "th child of " + Arrays.toString(parent));
                count++;
            }
            count = 0;
        }

        int[][][] threeD = {{{1, 2}, {3, 4}}, {{5, 6, 7}, {8, 9}}};

        for (int[][] z : threeD) {
            for (int[] y : z) {
                for (int x : y) {
                    System.out.println("x = " + x + " y = " + Arrays.toString(y));
                }
            }
        }

    }
}
