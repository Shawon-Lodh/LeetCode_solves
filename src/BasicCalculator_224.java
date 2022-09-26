import java.util.Stack;

public class BasicCalculator_224 {

    public int calculate(String s) {
        Stack<String> st = new Stack<>();
        s = s.replaceAll(" ", "");
        System.out.println(s);

        char ch;
        String temp = "";

        int number = 0;
        int result = 0;

        for(int i = 0; i<s.length(); i++){
            ch = s.charAt(i);
            if(ch == ')'){
                if(!temp.equals("")){
                    System.out.println("Pushed Char is  : "+temp);
                    st.push(temp);
                    temp = "";
                }
                while(!st.peek().equals("(")){
                    if(st.peek().equals("+") || st.peek().equals("(")){
                        st.pop();
                    }else if(st.peek().equals("-")){
                        number = (-1) * number;
                        st.pop();
                    }else{
                        result = result + number;
                        number = Integer.parseInt(st.peek());
                        st.pop();
                        System.out.println("Result is : "+result);
                    }
                }
                result = result + number;
                number = 0;
                st.pop();
                System.out.println("Result after one operation is : "+result);
                if(!st.empty()){
                    if(st.peek().equals("+")){
                        st.pop();
                    }else if(st.peek().equals("-")){
                        result = (-1) * result;
                        st.pop();
                    }
                }
                System.out.println("Pushed Char is  : "+ result);
                st.push(String.valueOf(result));
                result = 0;
            }else{
                if(ch == '('){
                    System.out.println("Pushed Char is  : "+s.charAt(i));
                    st.push(String.valueOf(s.charAt(i)));
                }else if(ch == '+' || ch == '-'){
                    if(!temp.equals("")){
                        System.out.println("Pushed Char is  : "+temp);
                        st.push(temp);
                        temp = "";
                    }
                    System.out.println("Pushed Char is  : "+s.charAt(i));
                    st.push(String.valueOf(s.charAt(i)));
                }else{
                    temp = temp.concat(String.valueOf(ch));
                }
            }
        }

        if(!temp.equals("")){
            System.out.println("Pushed Char is  : "+temp);
            st.push(temp);
            temp = "";
        }


        if(!st.empty()){
            while(!st.empty()){
                if(st.peek().equals("+")){
                    st.pop();
                }else if(st.peek().equals("-")){
                    number = (-1) * number;
                    st.pop();
                }else{
                    result = result + number;
                    number = Integer.parseInt(String.valueOf(st.peek()));
                    st.pop();
                    System.out.println("Result is : "+result);
                }
            }
            result = result + number;
            number = 0;
            System.out.println("Result after one operation is : "+result);

            System.out.println("Pushed Char is  : "+String.valueOf(result));
            st.push(String.valueOf(result));
            result = 0;
        }
        return Integer.parseInt(st.peek());
    }

    public static void main(String[] args) {

        BasicCalculator_224 solutionObj = new BasicCalculator_224();

        String input = "(5-(1+(5)))";  //" 2-1 + 2 "  , "(1+(4+5+2)-3)+(6+8)" , "1 + 1" , "-(2 + 3)" , "1+2-8-(2 + 3)" , "10+8" ,"(1-(3-4))" ,"(7)-(0)+(4)" ,"- (3 + (4 + 5))" , "-2+ 1" , "(5-(1+(5)))"

        int output = solutionObj.calculate(input);

        System.out.println("Output is : " + output);

    }
}
