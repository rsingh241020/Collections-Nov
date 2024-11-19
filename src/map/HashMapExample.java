package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map1 = new HashMap<>();
        // Map is  unordered
        map1.put(101,"Mango");
        map1.put(102,"Banana");
        map1.put(103,"Papaya");
        map1.put(null,"Guava"); // Only one null is added in the key
        map1.put(104,"Sweet Potato");
        map1.put(105,"Data");
        map1.put(104,"Ravi");
        map1.put(100,"Roam");

        System.out.println("Map is"+map1);

        map1.remove(100);
        System.out.println("Map is after removing"+map1);

        // Traversing
        for(Map.Entry m1:map1.entrySet()){
            System.out.println(m1.getKey()+"-----------------"+m1.getValue());
        }




    }
}
