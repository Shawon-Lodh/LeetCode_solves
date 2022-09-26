import java.util.Arrays;

public class SquaresOfASortedArray_977 {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        for(int i=0; i<nums.length ; i++){
            result[i] = (int)Math.pow(nums[i],2);
        }

        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {

        SquaresOfASortedArray_977 solutionObj = new SquaresOfASortedArray_977();

        int[] input = {-1,0,1,2,-1,-4};

        int[] output = solutionObj.sortedSquares(input);

//        System.out.println("Output is : " + output);

    }
}
