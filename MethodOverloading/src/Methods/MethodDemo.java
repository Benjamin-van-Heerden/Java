package Methods;

import java.util.Arrays;

public class MethodDemo {
    static int multiply(int x, int y) {
        System.out.println("Multiplying two numbers");
        return x * y;
    }

    static int multiply(int x, int y, int z) {
        System.out.println("Multiplying three numbers");
        return x * y * z;
    }

    static int multiply(int... ints) {
        System.out.println("Multiplying more than three numbers");
        int result = 1;
        for (int i : ints) {
            result *= i;
        }
        return result;
    }

    static double multiply(double... doubles) {
        System.out.println("Multiplying doubles");
        double res = doubles[0];
        for (double d : Arrays.copyOfRange(doubles, 1, doubles.length)) {
            res *= d;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(multiply(1, 2));
        System.out.println(multiply(1, 2, 3, 4));
        System.out.println(multiply(1, 2, 4));
        System.out.println(multiply(Math.PI, Math.E, 1.234, 6));
    }
}
