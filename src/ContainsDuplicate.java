import java.util.*;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        boolean result = false;

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                result = true;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        ContainsDuplicate solutionObj = new ContainsDuplicate();

        int[] input = {1,2,3,4};

        boolean output = solutionObj.containsDuplicate(input);

        System.out.println("Output is : " + output);

    }

}



