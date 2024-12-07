package stack;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Loop through each character in the string
        for (char ch : s.toCharArray()) {
            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If closing bracket, check for matching top of stack
            else if (ch == ')' || ch == '}' || ch == ']') {
                // Stack must not be empty and top must match
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "{[()]}";
        String input2 = "{[(])}";
        String input3 = "{{[[(())]]}}";

        System.out.println(isBalanced(input1)); // true
        System.out.println(isBalanced(input2)); // false
        System.out.println(isBalanced(input3)); // true
    }
}
