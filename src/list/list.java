package list;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class list {
    public static void main(String[] args) {
//        int a =10;
//        int b = null; integer can not store the null value;
//        Integer a = 23;
//        Integer b = null; // Wrapper class allows the Null Vlaue

        //Defining the arrayList
        List<Integer> list1 = new ArrayList<Integer>();

        //Insert the data in list
        list1.add(45);
        list1.add(54);
        list1.add(null);
        list1.add(42);
        list1.add(32);
        list1.add(453);

        System.out.println("List1 is :"+list1);

        //remove the data
        list1.remove(2);
        System.out.println("List After removing the 2 index element"+list1);

        //Search the data at a specific Position
        System.out.println("List element at a 2nd Index : "+list1.get(3));
        System.out.println("List element at a 4nd Index : "+list1.get(4));

        //Update the data
        list1.set(4,3);
        System.out.println("After 3 insert at the Position of 4 "+list1);

        //Size Of the List
        System.out.println(list1.size());

        //Sorting the List
        Collections.sort(list1);
        System.out.println("After the Sorting"+list1);

        //Traversing the list

        System.out.println("Traversing the List of the List");
        for(Integer l1: list1){
            System.out.println(l1);
        }

    }
}
