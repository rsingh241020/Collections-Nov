package list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();
        //adding the data
        stack1.push(3);
        stack1.push(4);
        stack1.push(42);
        stack1.push(12);
        stack1.push(23);
        stack1.push(23);
        stack1.push(null);
        System.out.println(stack1);

        //push from the List
        stack1.pop();
        System.out.println("stack1 after 1st pop"+stack1);
        stack1.pop();
        System.out.println("stack1 after 2nd pop"+stack1);

        System.out.println(stack1);

    }
}
