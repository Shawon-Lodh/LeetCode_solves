package future;

public class RomanToInteger_13 {

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

    public int romanToInt(String s) {

        StringBuilder inputString = new StringBuilder(s);

        int[] numInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

//        int startIndex = inputString.indexOf("CM");
//        int endIndex = inputString.indexOf("CM") + "CM".length();

        int output = 0;

        System.out.println("Input String is : "+inputString);

//        while (inputString.length() != 0){
//            for(int i = 0; i<numRoman.length ; i++){
//                if(inputString.indexOf(numRoman[i]) != -1){
//                    inputString = inputString.replace(inputString.indexOf(numRoman[i]),(inputString.indexOf(numRoman[i])+ numRoman[i].length()),"");
//                    System.out.println("Condition of input String is : "+inputString);
//                    System.out.println("Increase amount is  : "+numInt[i]);
//                    output += numInt[i];
//                }
//            }
//        }

        while(inputString.length()!=0){

            for(int j = 0 ; j< numRoman.length ; j++){

//                System.out.println("Array Length is : "+ inputString.length());

                if(inputString.length() > 1){
                    if(numRoman[j].contains(inputString.substring(0,2))){
                        System.out.println("Substring for matching  : "+ inputString.substring(0,2));
                        System.out.println("Matched String is  : "+numRoman[j]);
                        output += numInt[j];
                        System.out.println("Increase by  : "+numInt[j]);
                        inputString = inputString.replace(0,2,"");
                        System.out.println("Condition After : "+inputString);
                        System.out.println("Array Length is : "+ inputString.length());
                        break;
                    }else if(numRoman[j].contains(inputString.substring(0,1))){
                        System.out.println("Substring for matching  : "+ inputString.substring(0,1));
                        System.out.println("2nd block : Matched String is  : "+numRoman[j]);
                        output += numInt[j];
                        System.out.println("2nd block : Increase by  : "+numInt[j]);
                        inputString = inputString.replace(0,1,"");
                        System.out.println("2nd block : Condition After : "+inputString);
                        System.out.println("Array Length is : "+ inputString.length());
                        break;
                    }
                }else{
                    if(numRoman[j].contains(inputString.substring(0,1))){
                        System.out.println("Substring for matching  : "+ inputString.substring(0,1));
                        System.out.println("2nd block : Matched String is  : "+numRoman[j]);
                        output += numInt[j];
                        System.out.println("2nd block : Increase by  : "+numInt[j]);
                        inputString = inputString.replace(0,1,"");
                        System.out.println("2nd block : Condition After : "+inputString);
                        System.out.println("Array Length is : "+ inputString.length());
                        break;
                    }
                }
            }

        }


//        System.out.println("Output is : "+output);
//
//
//        System.out.println(inputString.indexOf("M"));
//
//        System.out.println(inputString.lastIndexOf("CM"));

//        inputString = inputString.replace(startIndex,endIndex,"");
//
//        System.out.println(inputString);

        return 0;
    }

    public static void main(String[] args) {

        RomanToInteger_13 solutionObj = new RomanToInteger_13();

        String input = "MCMXCIV";

        int output = solutionObj.romanToInt(input);

        System.out.println("Output is : " + output);

    }
}
