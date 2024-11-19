package map;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<>();
        // LinkedHashMap is  ordered
        linkedhashmap.put(101, "Mango");
        linkedhashmap.put(102, "Banana");
        linkedhashmap.put(103, "Papaya");
        linkedhashmap.put(null, "Guava"); // Only one null is added in the key
        linkedhashmap.put(104, "Sweet Potato");
        linkedhashmap.put(105, "Data");
        linkedhashmap.put(104, "Ravi");
        linkedhashmap.put(100, "Roam");

        System.out.println("Map is" + linkedhashmap);

        linkedhashmap.remove(100);
        System.out.println("Map is after removing" + linkedhashmap);

        // Traversing
        for (Map.Entry m1 : linkedhashmap.entrySet()) {
            System.out.println(m1.getKey() + "-----------------" + m1.getValue());
        }
    }
}
