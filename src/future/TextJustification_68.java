package future;

import java.util.ArrayList;
import java.util.List;

public class TextJustification_68 {
    private List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int maxWidthClone = maxWidth;
        int len = words.length;
        int i = 0;
        while(i<len){
          int charLen = words[i].toCharArray().length;
            System.out.println("Character length : " + charLen);
            List<String> temp = new ArrayList<>();
          if(charLen <= (maxWidthClone  - temp.size()-1)){
              temp.add(words[i]);
              System.out.println("Added value is : "+words[i]);
              System.out.println("Temp value is  : "+temp);
              i++;
              maxWidthClone = maxWidthClone - charLen;
          }else{
              int divisorForFindSpace = temp.size()-1;
              List<Integer> spaceEveryPos = new ArrayList<>();
              if(temp.size()<2){
                 result.add(rightPadWhiteSpace(temp.get(0),maxWidthClone));
              }else{
                while (maxWidthClone!=0){
                    spaceEveryPos.add((int) Math.ceil((double)maxWidthClone / divisorForFindSpace));
                    divisorForFindSpace--;
                }
              }

              for(int j = 0; j<temp.size() ; j++){
                 if(j<spaceEveryPos.size()){
                     result.add(rightPadWhiteSpace(temp.get(j),spaceEveryPos.get(j)));
                 }else{
                     result.add(rightPadWhiteSpace(temp.get(j),0));
                 }
              }
              maxWidthClone = maxWidth;
          }
        }
        return result;
    }

    private String leftPadWhiteSpace(String text, int length) {
        return String.format("%"+length+"s",text);
    }

    private String rightPadWhiteSpace(String text, int length) {
        return String.format("%-"+length+"s",text);
    }

    public static void main(String[] args) {

        TextJustification_68 solutionObj = new TextJustification_68();

        String[] input = {"This", "is", "an", "example", "of", "text", "justification."} ;
        int maxWidth = 16;

        List<String> output = solutionObj.fullJustify(input,maxWidth);

        System.out.println("Output is : " + output);

    }

}
