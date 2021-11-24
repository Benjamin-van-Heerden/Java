public class GeneralLoopStatements {
    public static void main(String[] args) {
        System.out.println("While");
        // while loop
        int count = 0;
        while (count < 3) {
            System.out.println(count);
            count++;
        }

        System.out.println("Do While");
        // do while
        int countDo = 0;
        do {
            System.out.println(countDo);
            countDo++;
        } while (countDo < 3);

        System.out.println("For standard");
        // for standard
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println("Enhanced For");
        // for in (enhanced for)
        int[] arr = {0, 1, 2};
        for (int a : arr) {
            System.out.println(a);
        }

    }
}
