package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        // TreeMap maintains natural ordering of keys (ascending order)
        TreeMap<Integer, String> treemap = new TreeMap<>();

        // Adding key-value pairs
        treemap.put(101, "Mango");
        treemap.put(102, "Banana");
        treemap.put(103, "Papaya");
        // TreeMap does not allow null keys (will throw NullPointerException if uncommented)
        // treemap.put(null, "Guava");
        treemap.put(104, "Sweet Potato");
        treemap.put(105, "Data");
        // Replacing the value for key 104
        treemap.put(104, "Ravi");
        treemap.put(100, "Roam");

        // Printing the TreeMap
        System.out.println("TreeMap: " + treemap);

        // Removing an entry by key
        treemap.remove(100);
        System.out.println("TreeMap after removing key 100: " + treemap);

        // Traversing the TreeMap using a for-each loop
        for (Map.Entry<Integer, String> entry : treemap.entrySet()) {
            System.out.println(entry.getKey() + " ----------------- " + entry.getValue());
        }
    }
}
