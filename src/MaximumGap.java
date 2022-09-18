import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumGap {
    public int maximumGap(int[] nums) {
        if(nums.length>=2){
            ArrayList<Integer> differences = new ArrayList<>();

            Arrays.sort(nums);

//            System.out.println("Sorted Arrays are : ");
//            for(int i = 0 ;i<nums.length;i++){
//                System.out.print(nums[i]+"\t");
//            }

            for(int i = nums.length-1 ; i>0 ; i--){
                differences.add(nums[i]-nums[i-1]);
            }

            return Collections.max(differences);
        }
        return 0;
    }
    public static void main(String[] args) {

        MaximumGap solutionObj = new MaximumGap();

        int[] input = {1,10000000};

        for(int i = 0 ;i<input.length;i++){
            System.out.print(input[i]+"\t");
        }
        System.out.println();

        long output = solutionObj.maximumGap(input);

        System.out.println("Output is : " + output);

    }
}
