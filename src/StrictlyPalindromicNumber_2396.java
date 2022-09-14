class StrictlyPalindromicNumber_2396 {
    public boolean isStrictlyPalindromic(int n) {
        boolean result = true;
        for(int i = 2; i<=n-2 ; i++){
           convertFromDecimal(n,i); 
           if(!isPalindrome(convertFromDecimal(n,i))){
               result = isPalindrome(convertFromDecimal(n,i));
               break;
           } 
        }
        
       return result;
    }
    
    public String convertFromDecimal(int number, int base) {
    String result = "";

    int lastQuotient = 0;

    for(int operatingNumber = number;operatingNumber > base; operatingNumber = operatingNumber/base) {
        result = getRepresantationOfLowIntValue(operatingNumber%base) + result;
        lastQuotient = operatingNumber/base;
    }

    result = getRepresantationOfLowIntValue(lastQuotient) + result;

    return result;
}
    
    private String getRepresantationOfLowIntValue(int toConvert) {
    if(toConvert >= 0 && toConvert < 10) {
        return "" + toConvert;
    }

    switch(toConvert) {
        case 10 : return "A";
        case 11 : return "B";
        case 12 : return "C";
        case 13 : return "D";
        case 14 : return "E";
        case 15 : return "F";
    }

    return "Error, cannot transform number < 0 or > 15";
    //throw new IllegalArgumentException("cannot transform number < 0 or >15");
}
    
    public boolean isPalindrome(String original){
        // String original = String.valueOf(n); 
        String reverse = "";
        int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
        return true;
      else  
         return false;
    }
  
  
  public static void main(String[] args) {

        StrictlyPalindromicNumber_2396 solutionObj = new StrictlyPalindromicNumber_2396();

        int input = 4;

        boolean output = solutionObj.isStrictlyPalindromic(input);

        System.out.println("Output is : " + output);

    }
  
}
