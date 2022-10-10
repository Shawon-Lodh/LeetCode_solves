import java.util.ArrayList;
import java.util.stream.Collectors;

public class NumberOfCommonFactors_2427 {
    ArrayList<Integer> firstNumberFactors = new ArrayList<>();
    ArrayList<Integer> secondNumberFactors = new ArrayList<>();
    public int commonFactors(int a, int b) {
        primeFactorize(a,true);
        System.out.println();
        primeFactorize(b,false);

        System.out.println("First are : "+firstNumberFactors);
        System.out.println("Second are : "+secondNumberFactors);
        System.out.println(firstNumberFactors.stream()
                .filter(secondNumberFactors::contains)
                .collect(Collectors
                        .toList()));
        return firstNumberFactors.stream()
                .filter(secondNumberFactors::contains)
                .collect(Collectors
                        .toList()).size();
    }


    public void primeFactorize (int n, boolean isFirstNumber)
    {
        for(int i = 1; i <= Math.sqrt(n); ++i)
        {
            if (n % i == 0){
                if(i == n / i){
                    System.out.print(i + ", ");
                    if(isFirstNumber){
                        firstNumberFactors.add(i);
                    }else {
                        secondNumberFactors.add(i);
                    }
            } else{
                    System.out.print(i + ", " + n/i + ", ");
                    if(isFirstNumber){
                        firstNumberFactors.add(i);
                        firstNumberFactors.add(n/i);
                    }else {
                        secondNumberFactors.add(i);
                        secondNumberFactors.add(n/i);

                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        NumberOfCommonFactors_2427 solutionObj = new NumberOfCommonFactors_2427();

        int input1 = 12, input2 = 6;

        int output = solutionObj.commonFactors(input1,input2);

        System.out.println("Output is : " + output);

    }
}
