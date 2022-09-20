package future;

import java.util.*;

public class VerbalArithmeticPuzzle {


    static Vector<Vector<Integer>> ans = new Vector<Vector<Integer>>();
    static Vector<Integer> tmp = new Vector<Integer>();

    Set<Character> characterList = new HashSet<>();
    HashMap<Character, Integer> characterListMap = new HashMap<>();

    public boolean isSolvable(String[] words, String result) {
        boolean resultValue = false;

        int wordsLen = words.length;
        for(int i =0; i< wordsLen;i++){
            char[] chars = words[i].toCharArray();
            int charsLen = chars.length;
            for(int j = 0; j<charsLen ; j++){
                characterList.add(chars[j]);
            }
        }

        char[] charsRight = result.toCharArray();
        int charsRightLen = charsRight.length;
        for(int j = 0; j<charsRightLen ; j++){
            characterList.add(charsRight[j]);
        }

        System.out.println("Characters List are : "+characterList);

        makeCombiUtil(9,0,characterList.size());

        System.out.println("Total answers are : "+ans.size());

        for(int index=0;index<ans.size();index++){
            Vector<Integer> numbers = ans.get(index);
            System.out.println("Numbers are : "+numbers);

            if(characterList.size()<=10){
                int k = 0;
                for (Iterator<Character> it = characterList.iterator(); it.hasNext(); ) {
                    Character c = it.next();
                    characterListMap.put(c, numbers.get(k));
                    k++;
                }
            }

            System.out.println("Characters List Hash Map are : "+characterListMap);

            int leftSideSum = 0,rightSideSum = 0;
            String temp = "";


            for(int i =0; i< wordsLen;i++){
                char[] chars = words[i].toCharArray();
                int charsLen = chars.length;
                for(int j = 0; j<charsLen ; j++){
                    temp = temp.concat(String.valueOf(characterListMap.get(chars[j])));
                    leftSideSum = leftSideSum + characterListMap.get(chars[j]);
                }
                System.out.println("LeftSide String Num is : "+temp);
                leftSideSum = leftSideSum + Integer.parseInt(temp);
                temp = "";
            }

//        System.out.println("LeftSide sum is : "+leftSideSum);


            for(int j = 0; j<charsRightLen ; j++){
                temp = temp.concat(String.valueOf(characterListMap.get(charsRight[j])));
            }
            System.out.println("RightSide String Num is : "+temp);

            rightSideSum = rightSideSum + Integer.parseInt(temp);


            System.out.println("RightSide sum is : "+rightSideSum);

        }

        return resultValue;
    }

    static void makeCombiUtil(int n, int left, int k)
    {
        if (k == 0) {
            ans.add(tmp);
//            for(int i = 0; i < tmp.size(); i++)
//            {
//                System.out.print(tmp.get(i) + " ");
//            }
//            System.out.println();
            return;
        }

        for (int i = left; i <= n; ++i)
        {
            tmp.add(i);
            makeCombiUtil(n, i + 1, k - 1);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {

        VerbalArithmeticPuzzle solutionObj = new VerbalArithmeticPuzzle();

        String[] input = {"SEND","MORE"};
        String result = "MONEY";

        boolean output = solutionObj.isSolvable(input,result);

        System.out.println("Output is : "+output);

    }
}
