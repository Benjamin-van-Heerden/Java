public class WhileDoWhile {
    public static void main(String[] args) {
        boolean bool = true;
        while (bool) {
            System.out.println("This executes since once since bool is true initially; bool = " + bool);
            bool = false;
        }

        do {
            System.out.println("Even though bool is now false this always executes at least once; bool = " + bool);
        } while (bool);

        System.out.println("While would be used most often, do-while is conducive to off-by-one errors, but is useful when it is needed");
    }
}
