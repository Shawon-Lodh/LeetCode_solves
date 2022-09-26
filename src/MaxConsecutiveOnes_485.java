public class MaxConsecutiveOnes_485 {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int temp = 0;
        int i = 0;

        while(i<nums.length){
            if(nums[i]==1){
                temp++;
            }else{
                if(max<temp){
                    max = temp;
                }
                temp = 0;
            }
            i++;
        }
        if(max<temp){
            max = temp;
        }
        return max;
    }

    public static void main(String[] args) {

        MaxConsecutiveOnes_485 solutionObj = new MaxConsecutiveOnes_485();

        int[] input = {-1,0,1,2,-1,-4};

        int output = solutionObj.findMaxConsecutiveOnes(input);

        System.out.println("Output is : " + output);

    }


}
