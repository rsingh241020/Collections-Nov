package Sets;
import java.util.LinkedHashSet;
public class LinkedHashSetExample {
        public static void main(String[] args) {
            LinkedHashSet<String> hashSet1 = new LinkedHashSet<>();
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

