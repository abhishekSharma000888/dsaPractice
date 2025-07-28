package practice27;

import java.util.Stack;

public class ParenthesisCheck {
    public static void main(String[] args) {
        String input1 = "({()})";
        String input2 = "({)]";

        System.out.println(isBalanced(input1)); // true
        System.out.println(isBalanced(input2)); // false
    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            // If it's an opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If it's a closing bracket, check top of stack
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (!isMatchingPair(top, ch)) return false;
            }
        }

        // At the end, the stack should be empty for balanced brackets
        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }
}
