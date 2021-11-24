import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<String>();

        hash.add("A");
        hash.add("B");
        hash.add("C");
        if (hash.add("C")) {
            System.out.println("Added C successfully");
        }
        else {
            System.out.println("Could not add C, operation overridden");
        }
        System.out.println(hash);

    }
}
