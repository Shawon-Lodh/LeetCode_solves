package future;

import java.util.*;

public class PrintWordsVertically_1324 {

    public List<String> printVertically(String s) {

      ArrayList<String> sList = new ArrayList<>(Arrays.asList(s.split(" ")));
        ArrayList<String> result = new ArrayList<>();
      int length = Collections.max(sList, Comparator.comparing(String::length)).length();
//        System.out.println(length);

      int j = 0;

      int arrLength = sList.size();

      while(j<length){
        String temp = "";
        for(int i = 0 ; i<arrLength ; i++){
           if(sList.get(i).length()>j){
             temp = temp.concat(String.valueOf(sList.get(i).charAt(j)));
           }else{
             temp = temp.concat(" ");
           }
        }
        result.add(temp);
        j++;
      }

      System.out.println(result);

      return sList;
    }

    public static void main(String[] args) {

        PrintWordsVertically_1324 solutionObj = new PrintWordsVertically_1324();

        String input = "TO BE OR NOT TO BE";

        List<String> output = solutionObj.printVertically(input);

        System.out.println("Output is : " + output);

    }

}
