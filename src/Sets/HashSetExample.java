package Sets;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Ronit");
        hashSet1.add("Ravi");
        hashSet1.add("Ram");
        hashSet1.add(null);
        hashSet1.add("Rohan");

        System.out.println("HashSet are :"+hashSet1);

        hashSet1.remove("Ravi");
        System.out.println("HashSet after removing are :"+hashSet1);
        //Traversing the Hashset

        for(String hs:hashSet1){
            System.out.println(hs);
        }


    }
}
