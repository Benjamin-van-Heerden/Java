import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String[]> customer = new HashMap<>();
        String[][] customerNameHobby = {{"Alice", "Swimming"}, {"Bob", "Fishing"}};
        customer.put(0, customerNameHobby[0]);
        customer.put(1, customerNameHobby[1]);

        System.out.println(Arrays.toString(customer.get(0)));

        HashMap<String, Integer> map = new HashMap<>();

        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 40);

        map.put("c", 30);

        if (map.containsKey("a")) {
            System.out.println("'a' is in map");
        }

        for (String key : map.keySet()) {
            System.out.println("key: " + key + " value: " + map.get(key));
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }

    }
}
