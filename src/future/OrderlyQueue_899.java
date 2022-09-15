package future;

public class OrderlyQueue_899 {
//    public String orderlyQueue(String s, int k) {
//        ArrayList<String> allStr = new ArrayList<>();
//        if(k>s.length()-1){
//            k = s.length()-1;
//        }
//        int lastIndexForCheck = k;
//        if(s.length()>k){
//            while(lastIndexForCheck!=-1){
////                StringBuilder str = new StringBuilder(s);
//                Character lastChar = s.charAt(lastIndexForCheck);
//                System.out.println("character is : " + lastChar);
////                str.deleteCharAt(k);
////                str.replace(k,k+1,"");
//                char[] charArr = new char[s.length()-1];
//
//                for (int i = 0,j = 0; i < s.length(); i++) {
//                    if(i != lastIndexForCheck){
//                        charArr[j] = s.charAt(i);
//                        j++;
//                    }
//                }
//
////                System.out.println("Char array contains : ");
////
////                for (int i = 0; i < charArr.length; i++) {
////                    System.out.print(charArr[i] + " ");
////                }
////                if(lastIndexForCheck == k-1){
////                    Arrays.sort(charArr);
////                }
//                Arrays.sort(charArr);
////                for(int i = 0; i<str.length()-1 ; i++){
////                    if(str.charAt(i) > str.charAt(i+1)){
////                        char temp = str.charAt(i);
////                        str.replace(i,i+1, String.valueOf(str.charAt(i+1)));
////                        str.replace(i+1,i+2, String.valueOf(temp));
////                    }
////                }
//
//                allStr.add(String.valueOf(charArr).concat(String.valueOf(lastChar)));
//                lastIndexForCheck--;
////                System.out.println();
//            }
////            Collections.sort(allStr);
//            System.out.println(allStr);
//          return allStr.get(0);
//        }else{
//            return s;
//        }
//    }

    boolean programContinuous = true;
    public String orderlyQueue(String s, int k) {
//        System.out.println(isLexicographicallySmallest("gvxz"));
        int indexForCheck = k;

        while(programContinuous){
            System.out.println("Index for check is : "+indexForCheck);
            if(indexForCheck == -1){
                System.out.println("String is : " + s);
                return s;
            }else{
                s = s.substring(0, indexForCheck) + s.substring(indexForCheck+1) + s.charAt(indexForCheck);
                System.out.println("String is : " + s);
            }
            indexForCheck = findIndexAfterLexicographicallySmallest(s,k);
        }
        return s;
    }

    int findIndexAfterLexicographicallySmallest(String s, int k){
        int indexForCheck = -1;
        for(int i=0; i<s.length()-1 ; i++){
            if(Character.getNumericValue(s.charAt(i))>Character.getNumericValue(s.charAt(i+1))){
                if(i<k)
                    indexForCheck = i;
            }
        }
        return indexForCheck;
    }

    public static void main(String[] args) {

        OrderlyQueue_899 solutionObj = new OrderlyQueue_899();

        String input = "kuh";
        int k = 1;

        System.out.println("Input is : " + input);

        String output = solutionObj.orderlyQueue(input,k);

        System.out.println("Output is : " + output);

    }
}
