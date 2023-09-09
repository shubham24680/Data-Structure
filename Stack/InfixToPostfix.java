import java.util.Stack;

public class InfixToPostfix {

    static int Prec(char t) {
        if (t == '^')
            return 3;
        else if (t == '/' || t == '*')
            return 2;
        else if (t == '+' || t == '-')
            return 1;
        return 0;
    }

    static String change(String s) {
        String ans = new String("");
        Stack stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c))
                ans += c;
            else if (c == '(')
                stack.push(c);
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans += stack.peek();
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    ans += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
        return "a";
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(change(exp));
    }
}
