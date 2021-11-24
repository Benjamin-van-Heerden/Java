import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<String>();

        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.addFirst("K");
        arr.addLast("L");
        arr.add("M");
        arr.add(2, "E");

        System.out.println(arr);

        if (arr.contains("F")) {
            System.out.println("F is in");
        }
        else {
            System.out.println("F is not in");
        }

        arr.remove("B");
        arr.remove(2);
        arr.removeFirst();
        arr.removeLast();

        System.out.println(arr);

    }
}
