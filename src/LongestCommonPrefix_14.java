import java.util.*;

public class LongestCommonPrefix_14 {

    public String longestCommonPrefix(String[] strs) {
        String lCP = "";
        boolean findInAll = false;
        ArrayList<String> strsArray = new ArrayList<>(Arrays.asList(strs));
        String shortestString = strsArray.stream().min(Comparator.comparing(String::length)).get();
        ArrayList<String>allSubStringList = generateSubStringList(shortestString);
        for(String subString : allSubStringList){
            for(int i = 0; i<strs.length ; i++){
//                System.out.println("Main String is : "+strs[i]);
//                System.out.println("Suffix String is : "+subString);
//                System.out.println("Does str start with specified suffix? " + strs[i].startsWith(subString));

                if(strs[i].startsWith(subString)){
                 findInAll = true;
                }else{
                 findInAll = false;
                 break;
                }
            }
            if(findInAll){
                lCP = subString;
                break;
            }
        }
        return lCP;
    }

    public ArrayList<String> generateSubStringList(String str){
        ArrayList<String>allSubStringList = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                allSubStringList.add(str.substring(i,j));
            }
        }
        Collections.sort(allSubStringList, (s1, s2) -> s2.length() - s1.length());
//        System.out.println("All substring of " + str + " are:");
//        System.out.println(allSubStringList);
        return  allSubStringList;
    }

    public static void main(String[] args) {

        LongestCommonPrefix_14 solutionObj = new LongestCommonPrefix_14();

        String[] input = {"dog","racecar","car"};

        String output = solutionObj.longestCommonPrefix(input);

        System.out.println("Output is : " + output);

    }
}
