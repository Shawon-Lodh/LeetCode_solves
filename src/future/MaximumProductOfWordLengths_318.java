package future;

import java.util.*;

public class MaximumProductOfWordLengths_318 {
    ArrayList<ArrayList<Character>> chSetList = new ArrayList<>();

    public int maxProduct(String[] words) {

        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());

        for(int i = 0;i<words.length; i++){
            ArrayList<Character> chSet = new ArrayList<>();
            for(char c : words[i].toCharArray()) {
//              System.out.print("Characters are : "+c+" ");
                chSet.add(c);
            }
            // Displaying the Set
            System.out.println("Set: " + chSet);
            chSetList.add(chSet);
        }
        System.out.println("Set List: " + chSetList);

        return checkAllElementsLengthISSameORNot() ? (chSetList.get(0).size() * chSetList.get(1).size()) : compare();

    }

    public boolean checkAllElementsLengthISSameORNot(){
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<chSetList.size();i++){
           set.add(chSetList.get(i).size());
        }
        return set.size() <= 1;
    }

    public int compare(){
        boolean match;
        ArrayList<Integer> product = new ArrayList<>(Collections.singletonList(0));
        for(int i = 0; i<chSetList.size();i++){
            for(int j = i+1; j<chSetList.size();j++){
//                System.out.println("value of i is :"+i+" value of j is :"+j);
                match = false;
                for (Character value : chSetList.get(j)){
                    if(chSetList.get(i).contains(value)){
                        match = true;
//                        System.out.println("value of i is :"+i+" value of j is :"+j+"\nMatched item "+chSetList.get(i)+" "+chSetList.get(j));
                        break;
                    }
                }
                if(!match){
                    System.out.println("value of i is :"+i+" value of j is :"+j+"\nNot Matched item "+chSetList.get(i)+" "+chSetList.get(j));
                    product.add(chSetList.get(i).size() * chSetList.get(j).size());
                }
            }
        }

        System.out.println(product);
        return Collections.max(product);
    }

    public static void main(String[] args) {

        MaximumProductOfWordLengths_318 solutionObj = new MaximumProductOfWordLengths_318();

        String[] input = {"eee","www","yyyyyyyyyyy","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb","ffffffffffffffffffffffffffff","aaaaaaaaaaaaaaaaa","cccccccccccc","cececececececec","cefde","dabae"};

        int output = solutionObj.maxProduct(input);

        System.out.println("Output is : " + output);


    }
}
