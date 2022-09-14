package future;

public class IntegerToEnglishWords_273 {

    String output = "";
    int multiplierNumber = 0;
    int multiplyResult = 0;

    public String numberToWords(int num) {
        while(num!=0){
            if(String.valueOf(num).length() >= 4 && String.valueOf(num).length()<=6){
                multiplierNumber = Integer.parseInt(String.format("%-"+ 4 +"s", "1").replace(' ', '0'));
            }else if(String.valueOf(num).length() >= 7 && String.valueOf(num).length()<=9){
                multiplierNumber = Integer.parseInt(String.format("%-"+ 7 +"s", "1").replace(' ', '0'));
            }else{
                multiplierNumber = Integer.parseInt(String.format("%-"+ String.valueOf(num).length()+"s", "1").replace(' ', '0'));
            }
            if(num>99){
                multiplyResult = num / multiplierNumber;
                if(multiplyResult>19){
                    System.out.println("Break number is : "+multiplyResult);
                    System.out.println("Break Output is : "+numberToWords(multiplyResult));
//                    numberToWords(multiplyResult);
                }else{
                    output = output + ' ' + getSingleNumsWord(multiplyResult);
                }
                output = output + ' ' + getSingleNumsWord(multiplierNumber);
                num = num % multiplierNumber;
            }else if(num>19){
                multiplyResult = num / multiplierNumber;
                output = output + ' ' + getSingleNumsWord(multiplyResult * multiplierNumber);
                num = num % multiplierNumber;
            }else{
                output = output + ' ' + getSingleNumsWord(num);
                num = 0;
            }
        }
        return output;
    }

    String getSingleNumsWord(int num){
        switch(num) {
            case 1:
                return  "One";
            case 2:
                return  "Two";
            case 3:
                return  "Three";
            case 4:
                return  "Four";
            case 5:
                return  "Five";
            case 6:
                return  "Six";
            case 7:
                return  "Seven";
            case 8:
                return  "Eight";
            case 9:
                return  "Nine";
            case 10:
                return  "Ten";
            case 11:
                return  "Eleven";
            case 12:
                return  "Twelve";
            case 13:
                return  "Thirteen";
            case 14:
                return  "Fourteen";
            case 15:
                return  "Fifteen";
            case 16:
                return  "Sixteen";
            case 17:
                return  "Seventeen";
            case 18:
                return  "Eighteen";
            case 19:
                return  "Nineteen";
            case 20:
                return  "Twenty";
            case 30:
                return  "Thirty";
            case 40:
                return  "Forty";
            case 50:
                return  "Fifty";
            case 60:
                return  "Sixty";
            case 70:
                return  "Seventy";
            case 80:
                return  "Eighty";
            case 90:
                return  "NineTy";
            case 100:
                return  "Hundred";
            case 1000:
                return  "Thousand";
//            case 10000:
//                return  "Ten Thousand";
//            case 100000:
//                return  "Hundred Thousand";
            case 1000000:
                return  "Million";
//            case 10000000:
//                return  "Ten Million";
//            case 100000000:
//                return  "Hundred Million";
            case 1000000000:
                return  "Billion";
            default:
                return  "Zero";
        }
    }

    public static void main(String[] args) {

        IntegerToEnglishWords_273 solutionObj = new IntegerToEnglishWords_273();

        int input = 22345;

        String output = solutionObj.numberToWords(input);

        System.out.println(String.format("%-"+ String.valueOf(input).length()+"s", "1").replace(' ', '0'));

        System.out.println("IUnput is : " + input);

        System.out.println("Output is : " + output);


    }
}
