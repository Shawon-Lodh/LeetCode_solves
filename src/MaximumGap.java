import java.util.Arrays;

public class MaximumGap {
    public int maximumGap(int[] nums) {
        if(nums.length>=2){
            int max = Integer.MIN_VALUE;

            Arrays.sort(nums);

            System.out.println("Sorted Arrays are : ");
            for(int i = 0 ;i<nums.length;i++){
                System.out.print(nums[i]+"\t");
            }
            System.out.println();

            for(int i = nums.length-1 ; i>0 ; i--){
                if(max<(nums[i]-nums[i-1])){
                    max = nums[i]-nums[i-1];
                }
            }

            return max;
        }
        return 0;
    }
    public static void main(String[] args) {

        MaximumGap solutionObj = new MaximumGap();

        int[] input = {19,7,2,24,11,16,1,11,23};

        for(int i = 0 ;i<input.length;i++){
            System.out.print(input[i]+"\t");
        }
        System.out.println();

        long output = solutionObj.maximumGap(input);

        System.out.println("Output is : " + output);

    }
}
