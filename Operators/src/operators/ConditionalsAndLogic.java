package operators;

public class ConditionalsAndLogic {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int[] arr;
        arr = new int[2];
        arr[0] = 4;
        arr[1] = 3;

        if (a <= b && b != arr[0] && b == arr[1] || false) {
            System.out.println("Comparison operations are easy!");
        }

    }
}
