import java.util.Arrays;

public class BinarySearch {

    public int search(int[] nums, int target) {
        // int targetIndex = -1;
        // int length = nums.length;
        int start = 0;
        int end = (nums.length-1);
        int mid = (start+end)/2;

        if(nums[start]>target || nums[end]<target) return -1;

        while(start<=end){
            if(nums[mid]>target){
                end = mid - 1;
            }else if(nums[mid] == target){
                return mid;
            }else{
                start = mid + 1;
            }

            mid = (start+end)/2;
        }
        // for(int i = 0; i<length ; i++){
        //     if(nums[i]>target || nums[length - 1]<target) return -1;
        //     if(nums[i] == target){
        //         return i;
        //     }
        // }
        return -1;
    }

    public static void main(String[] args) {

        BinarySearch solutionObj = new BinarySearch();

        int[] input = {-1,0,3,5,9,12};

        int target = 9;

        int output = solutionObj.search(input,target);

        System.out.println("Output is : " + output);

    }
}
