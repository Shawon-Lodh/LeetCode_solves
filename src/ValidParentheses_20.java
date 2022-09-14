import java.util.Stack;

public class ValidParentheses_20 {

    boolean isMatching(char a, char b) {
        return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
    }

    boolean isValid(String s) {

        Stack<Character> st = new Stack<Character>();
        int i;


        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                st.push(s.charAt(i));
            else {
                if (st.empty())
                    return false;
                else if (isMatching(st.peek(), s.charAt(i)))
                    st.pop();
                else if (!isMatching(st.peek(), s.charAt(i)))
                    return false;

            }


        }
        return st.empty() == true;

    }

    public static void main(String[] args) {

        ValidParentheses_20 solutionObj = new ValidParentheses_20();

        String input = "(]";

        boolean output = solutionObj.isValid(input);

        System.out.println("Output is : " + output);

    }
}
