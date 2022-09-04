public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maximum_sum = Integer.MIN_VALUE;
        int total_count = 0;

        for(int i = 0; i<nums.length; i++){
          total_count = total_count + nums[i];
          if(maximum_sum < total_count){
             maximum_sum = total_count;
          }
          if(total_count<0){
              total_count = 0;
          }
        }

        return maximum_sum;
    }

    public static void main(String[] args) {

        MaximumSubarray solutionObj = new MaximumSubarray();

        int[] input = {-5,4,6,-3,4,-1};

        int output = solutionObj.maxSubArray(input);

        System.out.println("Output is : " + output);
    }
}
