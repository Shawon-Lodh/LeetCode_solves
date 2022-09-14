public class ReverseString_344 {

    public void reverseString(char[] s) {
        for(int i=0,j=s.length-1;i<j;i++,j--)
        {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }

    public static void main(String[] args) {

        ReverseString_344 solutionObj = new ReverseString_344();

        char[] input = {'h','e','l','l','o'} ;

        solutionObj.reverseString(input);

//        System.out.println("Output is : " + output);

    }
}
