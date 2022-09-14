public class IntegerToRoman_12 {

    public String intToRoman(int num) {

        StringBuilder outputString = new StringBuilder();
        int[] numInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


        for(int i=0;num>0;i++){
            while(num>= numInt[i]){
                outputString.append(numRoman[i]);
                num -= numInt[i];
            }
        }

        return outputString.toString();
    }

    public static void main(String[] args) {

        IntegerToRoman_12 solutionObj = new IntegerToRoman_12();

        int input = 1994;

        String output = solutionObj.intToRoman(input);

        System.out.println("Output is : " + output);

    }
}

