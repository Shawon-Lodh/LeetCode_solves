public class PalindromeNumber_9 {

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
           if(x == reverse(x)){
               return true;
           } else{
               return false;
           }
        }
    }

    public int reverse(int x) {
        long reverse = 0;
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
            return result;
        } catch(ArithmeticException e) {
            return 0;
        }
    }

    public static void main(String[] args) {

        PalindromeNumber_9 solutionObj = new PalindromeNumber_9();

        int input = -121;

        boolean output = solutionObj.isPalindrome(input);

        System.out.println("Output is : " + output);


    }

}
