public class ReverseInteger {

    public int reverse(int x) {
        long reverse = 0;
        boolean numberIsNegative = false;
        if(x<0){
            x *= -1;
            numberIsNegative = true;
        }
        while(x!=0){
            int remainder = x%10;
            if(remainder != 0){
                reverse = (reverse*10) + remainder;
            }else{
                if(reverse != 0){
                    reverse = (reverse*10) + remainder;
                }
            }
            x = x/10;
        }
        try {
            int result = Math.toIntExact(reverse);
            if(numberIsNegative){
                return result *= -1;
            }else{
                return result;
            }
        } catch(ArithmeticException e) {
            return 0;
        }
    }

    public static void main(String[] args) {

        ReverseInteger solutionObj = new ReverseInteger();

        int input = 123;

        int output = solutionObj.reverse(input);

        System.out.println("Output is : " + output);

    }
}
