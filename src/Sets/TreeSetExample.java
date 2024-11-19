package Sets;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample {
            public static void main(String[] args) {
                TreeSet<String> treeSet1 = new TreeSet<>();
                treeSet1.add("Ronit");
                treeSet1.add("Ravi");
                treeSet1.add("Ram");
                //treeSet1.add(null); Tree set never store the null
                treeSet1.add("Rohan");

                System.out.println("HashSet are :"+treeSet1);

                treeSet1.remove("Ravi");
                System.out.println("HashSet after removing are :"+treeSet1);
                //Traversing the Hashset

                for(String hs:treeSet1){
                    System.out.println(hs);
                }
            }
        }