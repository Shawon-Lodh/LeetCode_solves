public class FindNumbersWithEvenNumberOfDigits_1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length; i++){
            if((String.valueOf(nums[i]).length()) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        FindNumbersWithEvenNumberOfDigits_1295 solutionObj = new FindNumbersWithEvenNumberOfDigits_1295();

        int[] input = {-1,0,1,2,-1,-4};

        int output = solutionObj.findNumbers(input);

        System.out.println("Output is : " + output);

    }

}
