import java.util.ArrayList;

public class FindSubarraysWithEqualSum_2395 {

    public boolean findSubarrays(int[] nums) {
        boolean result = false;
        ArrayList<Integer> sums = new ArrayList<>();
        if(nums.length>2){

//            long sum = nums[0]+nums[1];
            sums.add(nums[0]+nums[1]);
//            System.out.println(sum);

            for(int i = 1; i<(nums.length-1); i=i+1){
//                System.out.println("Tested indexes are : "+i+" & "+(i+1));
                System.out.println("Tested indexes values are : "+nums[i]+" & "+nums[i+1]);
                System.out.println("Sum is : "+(nums[i]+nums[i+1]));
                if(sums.contains(nums[i]+nums[i+1])){
                    result = true;
                    break;
                }else{
                    sums.add(nums[i]+nums[i+1]);
                }

            }

        }

        System.out.println(sums);

        return result;
    }

    public static void main(String[] args) {

        FindSubarraysWithEqualSum_2395 solutionObj = new FindSubarraysWithEqualSum_2395();

        int[] input = {77,95,90,98,8,100,88,96,6,40,86,56,98,96,40,52,30,33,97,72,54,15,33,77,78,8,21,47,99,48};

        boolean output = solutionObj.findSubarrays(input);

        System.out.println("Output is : " + output);

    }
}
