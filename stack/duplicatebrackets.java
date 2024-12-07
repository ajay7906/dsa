package stack;

import java.util.*;

public class duplicatebrackets {
    public static boolean hasDuplicate(String expression){
        Stack <Character> stack = new Stack<>();

        for(char ch : expression.toCharArray()){  
            if(ch == ')'){
                int elementInside = 0;
                while(!stack.isEmpty() && stack.peek() != '('){
                    stack.pop();
                    elementInside++;
                }
              
            }
            // Pop the opening bracket '('
            if (!stack.isEmpty()) {
                stack.pop();
            }

            // If no meaningful elements were inside, return true
            if (elementInside == 0) {
                return true;
            }

        }
    }
}