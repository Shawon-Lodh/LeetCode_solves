public class LicenseKeyFormatting_482 {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-", "");

        if(s.length()<k){
            return s.toUpperCase();
        }

        StringBuilder newS = new StringBuilder(s);
        newS.reverse();

        for(int i = k, j=0; j<newS.length() ; j++){

            if(i!=j){
                if(!Character.isDigit(newS.charAt(j))){
                    newS.setCharAt(j, Character.toUpperCase(newS.charAt(j)));
                }
            }

            if(i<newS.length()){
                newS.insert(i, '-');
                i=i+k+1;
            }
        }
        newS.reverse();

        return newS.toString();
    }

    public static void main(String[] args) {

        LicenseKeyFormatting_482 solutionObj = new LicenseKeyFormatting_482();

        String inputString = "2-5g-3-J";
        int seperation = 2;

        System.out.println("Input is : "+inputString);

        String output = solutionObj.licenseKeyFormatting(inputString, seperation);

        System.out.println("Output is : "+output);

    }

}
