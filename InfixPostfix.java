// Referensi code: https://www.youtube.com/watch?v=7jLR-al8RaM

import java.util.Scanner;
import java.util.Stack;

public class InfixPostfix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String infix = s.nextLine();

        String postfix = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char symbol = infix.charAt(i);
            switch (symbol) {
                case '(':
                    stack.push(symbol);
                    break;
                case ')':
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfix += stack.pop();
                    }
                    stack.pop();
                    break;
                case '^': case '*': case '/': case '+': case '-':
                    while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(symbol)) {
                        postfix += stack.pop();
                    }
                    stack.push(symbol);
                    break;
                default:
                    postfix += symbol;
            }
        }

        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }

        System.out.println(postfix);
    }

    public static int precedence(char operator) {
        switch (operator) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }
}