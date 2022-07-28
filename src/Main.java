import java.util.Arrays;

class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int noTotalConsecutive = 0;
        Arrays.sort(nums);
        System.out.println("Sorted Array is : ");
        for(int val : nums) {
            System.out.println(val);
        }
        int length = nums.length;
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {

        LongestConsecutiveSequence solutionObj = new LongestConsecutiveSequence();

        int[] input = {100,4,200,1,3,2};

        System.out.println("Input is : ");
        for(int val : input) {
            System.out.println(val);
        }


        int output = solutionObj.longestConsecutive(input);

        System.out.println("Output is : " + output);

    }
}