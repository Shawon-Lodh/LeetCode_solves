import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LongestSubstringWithoutRepeatingCharacters_3 {

    public int lengthOfLongestSubstring(String s) {

        if(s.length()>1){
            char[] allCharsInString = s.toCharArray();
            int i = 0;
            int len = allCharsInString.length;

            List<Character> tempSubstring = new ArrayList<Character>();
//            List<String> allSubstring = new ArrayList<String>();
            List<Integer> allSubstringSizes = new ArrayList<Integer>();

            while(i<len){
                if(!tempSubstring.contains(allCharsInString[i])){
                    tempSubstring.add(allCharsInString[i]);
                }else{
                    printSubString(tempSubstring);
//                    allSubstring.add(charListToString(tempSubstring));
                    allSubstringSizes.add(tempSubstring.size());
                    if(tempSubstring.get(tempSubstring.size() - 1) == allCharsInString[i]){
                        tempSubstring.clear();
                    }else{
//                      tempSubstring.remove(Character.valueOf(allCharsInString[i]));
                        tempSubstring.subList(0, tempSubstring.indexOf(allCharsInString[i])+1).clear();
                    }
//                    tempSubstring.clear();
//                    tempSubstring.remove(Character.valueOf(allCharsInString[i]));
                    tempSubstring.add(allCharsInString[i]);
//                    printSubString(tempSubstring);
                }
                i++;
            }

            if(tempSubstring.size()!=0){
                printSubString(tempSubstring);
//                allSubstring.add(charListToString(tempSubstring));
                allSubstringSizes.add(tempSubstring.size());
                tempSubstring.clear();
            }
//            for(String tempString : allSubstring){
//                System.out.println("Substring is "+ tempString);
//                if(s.contains(tempString)){
//                    allSubstringSizes.add(tempString.length());
//                }
//            }

            return Collections.max(allSubstringSizes);
        }else{
            return s.length();
        }
    }

    String charListToString(List<Character> tempSubstring){
       return tempSubstring.stream()
               .map(String::valueOf)
               .collect(Collectors.joining());
    }

    void printSubString(List<Character> tempSubstring){
        for(int i=0;i<tempSubstring.size() ; i++){
            System.out.print(tempSubstring.get(i));
        }
        System.out.println();
    }


    public static void main(String[] args) {

        LongestSubstringWithoutRepeatingCharacters_3 solutionObj = new LongestSubstringWithoutRepeatingCharacters_3();

        String input = "ohvhjdml"; //"abcabcbb"   "dvdf";

        int output = solutionObj.lengthOfLongestSubstring(input);

        System.out.println("Output is : " + output);

    }
}
