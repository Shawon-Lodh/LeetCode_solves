public class IntegerToRoman {

    public String intToRoman(int num) {
        String output = findRomanNum("",num);
        return output;
    }

    String findRomanNum(String output, int num){

        System.out.println("Output is : "+output+" & number is : "+num);

        if(num>=1000){
            output = output + "M";
            return findRomanNum(output,num-1000);
        }else if(num >= 900){
            output = output + "CM";
            return findRomanNum(output,num-900);
        }else if(num>=500){
            output = output + "D";
            return findRomanNum(output,num-500);
        }else if(num >= 400){
            output = output + "CD";
            return findRomanNum(output,num-400);
        }else if(num>=100){
            output = output + "C";
            return findRomanNum(output,num-100);
        }else if(num >= 90){
            output = output + "XC";
            return findRomanNum(output,num-90);
        }else if(num>=50){
            output = output + "L";
            return findRomanNum(output,num-50);
        }else if(num >= 40){
            output = output + "XL";
            return findRomanNum(output,num-40);
        }else if(num>=10){
            output = output + "X";
            return findRomanNum(output,num-10);
        }else if(num >= 9){
            output = output + "IX";
            return findRomanNum(output,num-9);
        }else if(num>=5){
            output = output + "V";
            return findRomanNum(output,num-5);
        }else if(num >= 4){
            output = output + "IV";
            return findRomanNum(output,num-4);
        }else if(num>=1){
            output = output + "I";
            return findRomanNum(output,num-1);
        }else{
            return output;
        }
    }


    public static void main(String[] args) {

        IntegerToRoman solutionObj = new IntegerToRoman();

        int input = 5;

        String output = solutionObj.intToRoman(input);

        System.out.println("Output is : " + output);

    }
}

