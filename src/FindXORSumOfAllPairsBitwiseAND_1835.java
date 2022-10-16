public class FindXORSumOfAllPairsBitwiseAND_1835 {

    public int getXORSum(int[] arr1, int[] arr2) {
      int temp = 0, result = 0;

      int[] a1, a2;

      a1 = arr1.length<arr2.length ? arr2 : arr1;
      a2 = arr1.length<arr2.length ? arr1 : arr2;

      int a1length = a1.length, a2length = a2.length;

      for(int i = 0;i<a1length;i++){
        temp = temp ^ a1[i];
      }

        for(int i = 0;i<a2length;i++){
            result = result ^ (a2[i] & temp);
        }
      return  result;
    }

    public static void main(String[] args) {

        FindXORSumOfAllPairsBitwiseAND_1835 solutionObj = new FindXORSumOfAllPairsBitwiseAND_1835();

        int[] input1 = {1,2,3};
        int[] input2 = {6,5};

        int output = solutionObj.getXORSum(input1,input2);

        System.out.println("Output is : " + output);

    }
}

