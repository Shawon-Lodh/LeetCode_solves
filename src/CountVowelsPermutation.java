import java.util.*;

//public class CountVowelsPermutationOriginalSolutionWithTLEProblem {
//
//    List<String> singleStringCombinationSet = new ArrayList<String>();
//    List<String> defaultVowels = new ArrayList<String>(Arrays.asList("a","e","i","o","u"));
//
//    public int countVowelPermutation(int n) {
//
//      if(n == 1) {
//          return defaultVowels.toArray().length;
//      }else{
//          return getCombination(n);
//      }
//
//    }
//
//    public int getCombination(int n){
////        List<String> tempCombinationStringSet = defaultVowels;
//        Set<String> tempCombinationStringSet = new LinkedHashSet<>(defaultVowels);
//        for(int i = 1 ; i<n ; i++){
//            System.out.println("Serial is : "+(i));
//           for(String s : tempCombinationStringSet){
//               getStringCombinationSetBasedOnLastCharacter(s);
//           }
//
//            System.out.println("Combination is :");
//            for(String tempStr : singleStringCombinationSet){
//                System.out.println(tempStr);
//            }
//
//           tempCombinationStringSet.clear();
//           tempCombinationStringSet.addAll(singleStringCombinationSet);
//           singleStringCombinationSet.clear();
//        }
//        return tempCombinationStringSet.toArray().length;
//    }
//
//    public List<String> getStringCombinationSetBasedOnLastCharacter(String s){
//
//        switch(s.charAt(s.length() - 1)) {
//            case 'a':
//                singleStringCombinationSet.add(s+"e");
//                break;
//            case 'e':
//                singleStringCombinationSet.add(s+"a");
//                singleStringCombinationSet.add(s+"i");
//                break;
//            case 'i':
//                singleStringCombinationSet.add(s+"u");
//                singleStringCombinationSet.add(s+"o");
//                singleStringCombinationSet.add(s+"a");
//                singleStringCombinationSet.add(s+"e");
//                break;
//            case 'o':
//                singleStringCombinationSet.add(s+"i");
//                singleStringCombinationSet.add(s+"u");
//                break;
//            case 'u':
//                singleStringCombinationSet.add(s+"a");
//                break;
//        }
//
//        return singleStringCombinationSet;
//    }
//
//    public static void main(String[] args) {
//
//        CountVowelsPermutationOriginalSolutionWithTLEProblem solutionObj = new CountVowelsPermutationOriginalSolutionWithTLEProblem();
//
//        int input = 6;
//
//        int output = solutionObj.countVowelPermutation(input);
//
//        System.out.println("Output is : " + output);
//
//    }
//}

public class CountVowelsPermutation {

    public int countVowelPermutation(int n) {

        long mod = (long) Math.pow(10,9) + 7 ;
        long final_a = 1, final_e = 1, final_i = 1, final_o = 1, final_u = 1;
        long temp_a, temp_e, temp_i, temp_o, temp_u;

        int i;

        for(i = 1 ; i < n ; i++){
            temp_a = final_a;
            temp_e = final_e;
            temp_i = final_i;
            temp_o = final_o;
            temp_u = final_u;

            final_a = (temp_e)%mod;
            final_e = (temp_a + temp_i)%mod;
            final_i = (temp_a + temp_e + temp_o + temp_u)%mod;
            final_o = (temp_i + temp_u)%mod;
            final_u = (temp_a)%mod;

        }

        return (int)((final_a + final_e + final_i + final_o + final_u) % mod);
    }


    public static void main(String[] args) {

        CountVowelsPermutation solutionObj = new CountVowelsPermutation();

        int input = 1900;

        int output = solutionObj.countVowelPermutation(input);

        System.out.println("Output is : " + output);

    }
}

