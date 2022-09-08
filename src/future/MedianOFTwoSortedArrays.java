package future;

import java.util.Arrays;

public class MedianOFTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      return merge2(nums1,nums2);  
    }
    
    static double merge2(int[] nums1, int[] nums2) {
        
        int[] result = new int[nums1.length + nums2.length];
        
        System.arraycopy(nums1, 0, result, 0, nums1.length);  
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        
        Arrays.sort(result);
        
        if(result.length%2 == 0){
            return (double)(result[(result.length/2) - 1] + result[(result.length/2)])/2;
        }else{
            return (double)result[(result.length/2)];
        }
    
    }
  
    public static void main(String[] args) {

        MedianOFTwoSortedArrays solutionObj = new MedianOFTwoSortedArrays();

        int[] input1 = {1,2};
        int[] input2 = {3,4};

        double output = solutionObj.findMedianSortedArrays(input1,input2);

        System.out.println("Output is : " + output);

    }
}
