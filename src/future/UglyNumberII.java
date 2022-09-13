package future;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UglyNumberII {

    List<Integer> factors = new ArrayList<>();
    List<Integer> commonPrimeFactors = new ArrayList<>(Arrays.asList(1,2,3,5));

    public int nthUglyNumber(int n) {
        int i = 1;
        int count = 0;
        while(true){
           if(i == 1 || i == 2 || i == 3 || i == 5)
           {
               System.out.println("Selected number is : "+i);
               count++;
               if(count == n)
                   return i;
           }else if(checkPrimeFactors(i)){
              System.out.println("Selected number is : "+i);
              count++;
              if(count == n)
                return i;
           }
           i++;
        }
    }

    public boolean checkPrimeFactors(int n)
    {
        factors.clear();
        int c = 2;
        while (n > 1) {
            if (n % c == 0) {
                factors.add(c);
                n /= c;
            }
            else
                c++;
        }
//        System.out.println("Factors are : "+ factors);
        factors.removeAll(commonPrimeFactors);
//        System.out.println("Factors are : "+ factors);
        return (factors.size() == 0);
    }

    public static void main(String[] args) {

        UglyNumberII solutionObj = new UglyNumberII();

        int input = 15;

        int output = solutionObj.nthUglyNumber(input);

        System.out.println("Output is : "+output);

    }
}
