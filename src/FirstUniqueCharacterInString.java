public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        int uniqCharIndex = -1;

        StringBuilder str = new StringBuilder(s);

        int length = str.length();

        for (int i = 0; i < length; i++) {

            if(countMatches(str,str.charAt(i)) == 1){
                uniqCharIndex = i;
                break;
            }

        }

        return uniqCharIndex;
    }

    public static int countMatches(final StringBuilder str, final char c) {
        if (str.length() == 0)
            return 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(count==2){
              break;
            }
            if (str.charAt(i) == c)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        FirstUniqueCharacterInString solutionObj = new FirstUniqueCharacterInString();

        String input = "loveleetcode";

        int output = solutionObj.firstUniqChar(input);

        System.out.println("Output is : " + output);


    }


}
