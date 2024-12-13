package infix;

import java.util.Stack;

public class Infix {

    // Method to evaluate the infix expression
    public static int evaluateInfix(String expression) {
        Stack<Integer> operands = new Stack<>(); // To store numbers
        Stack<Character> operators = new Stack<>(); // To store operators

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // Skip spaces
            if (ch == ' ') continue;

            // If it's a number, parse it completely (to handle multi-digit numbers)
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--; // Adjust index after the loop
                operands.push(num);
            }
            // If it's a left parenthesis, push to operators stack
            else if (ch == '(') {
                operators.push(ch);
            }
            // If it's a right parenthesis, evaluate until '(' is found
            else if (ch == ')') {
                while (operators.peek() != '(') {
                    performCalculation(operands, operators);
                }
                operators.pop(); // Remove '(' from stack
            }
            // If it's an operator (+, -, *, /)
            else if (isOperator(ch)) {
                // Process all operators with higher or equal precedence
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    performCalculation(operands, operators);
                }
                operators.push(ch); // Push the current operator
            }
        }

        // Process remaining operators
        while (!operators.isEmpty()) {
            performCalculation(operands, operators);
        }

        // The result is the last number in the operands stack
        return operands.pop();
    }

    // Helper method to check if a character is an operator
    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    // Helper method to determine operator precedence
    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') return 1;
        if (operator == '*' || operator == '/') return 2;
        return 0;
    }

    // Helper method to perform a calculation
    private static void performCalculation(Stack<Integer> operands, Stack<Character> operators) {
        int b = operands.pop(); // Second operand
        int a = operands.pop(); // First operand
        char operator = operators.pop();

        int result = 0;
        switch (operator) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
        }

        operands.push(result); // Push the result back to the operands stack
    }

    // Main method to test
    public static void main(String[] args) {
        String expression = "3 + 5 * 2";
        int result = evaluateInfix(expression);
        System.out.println("Result: " + result); // Output: 13
    }
}
