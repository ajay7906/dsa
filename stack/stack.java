package stack;

import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        System.out.println("Pushing elements onto the stack:");
        stack.push(10);
        System.out.println("Pushed: 10");
        stack.push(20);
        System.out.println("Pushed: 20");
        stack.push(30);
        System.out.println("Pushed: 30");

        // Display the stack
        System.out.println("\nStack after pushes: " + stack);

        // Pop elements from the stack
        System.out.println("\nPopping elements from the stack:");
        while (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Popped: " + poppedElement);
        }

        // Display the stack after popping
        System.out.println("\nStack after pops: " + stack);

    }
}