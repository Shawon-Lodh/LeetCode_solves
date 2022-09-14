public class TwoSum_1 {

    public int[] twoSum(int[] numbers, int target) {

        int len = numbers.length;

        int[] result = new int[2] ;
        int number1 = 0;
        int sum = 0;

        for (int i = 0; i < len; i++) {
            number1 = numbers[i];

            for(int j = i+1; j < len; j++)
            {

                sum = number1+numbers[j];
                if(sum == target)
                {
                    result[0]=i;
                    result[1]=j;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {

        TwoSum_1 solutionObj = new TwoSum_1();

        int[] input = {2,7,11,15};

        int target = 9;

        int[] output = solutionObj.twoSum(input,target);


    }
}
