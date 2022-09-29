package future;

import java.util.ArrayList;
import java.util.Arrays;

public class find_1160 {
    public int countCharacters(String[] words, String chars) {
//        ArrayList<Character> charList = new ArrayList<Character>();
//
//        for(int i = 0; i< chars.length(); i++){
//            charList.add(chars.charAt(i));
//        }

        boolean hasTake;

        int length = 0;

        ArrayList<String> acceptedList = new ArrayList<>();
        char[] temp;
        for(int i = 0;i< words.length ; i++){
           if(chars.length()>0){
               hasTake = true;
               temp = words[i].toCharArray();
               for(int j = 0;j< temp.length ; j++){
                   if(!chars.contains(String.valueOf(temp[i]))){
                       hasTake = false;
                       break;
                   }
               }
               if(hasTake){
                   acceptedList.add(Arrays.asList(chars).toString());
                   for(int j = 0;j< temp.length ; j++){
                       chars = chars.replace(String.valueOf(temp[i]), "");
                   }
               }
           }

        }

        for(int i = 0; i<acceptedList.size() ; i++){
            length = length + acceptedList.get(i).length();
        }

        return length;
    }

    public static void main(String[] args) {

        find_1160 solutionObj = new find_1160();

        String[] input = {"cat","bt","hat","tree"};
        String chars = "atach";

        int output = solutionObj.countCharacters(input,chars);

        System.out.println("Output is : " + output);

    }
}
