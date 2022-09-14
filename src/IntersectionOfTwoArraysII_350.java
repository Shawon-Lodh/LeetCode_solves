import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArraysII_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums1List = new ArrayList<>(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        ArrayList<Integer> nums2List = new ArrayList<>(Arrays.stream(nums2).boxed().collect(Collectors.toList()));

        int nums1ListLength = nums1List.size();
        int nums2ListLength = nums2List.size();
        int searchedIndex = -1;
        List removeFromBaseList = new ArrayList<Integer>();

        if(nums1ListLength<=nums2ListLength){
          for(int i = 0;i<nums1ListLength;i++){
           searchedIndex = linearSearch(nums2List, nums1List.get(i));
             if(searchedIndex != -1){
               nums2List.remove(searchedIndex);
             }else{
               removeFromBaseList.add(nums1List.get(i));
             }
          }
//          System.out.println("remove data is : " + removeFromBaseList);
          for(int i = 0; i<removeFromBaseList.size();i++){
             nums1List.remove(removeFromBaseList.get(i));
          }
          return nums1List.stream().mapToInt(i -> i).toArray();
        }else{
          for(int i = 0;i<nums2ListLength;i++){
           searchedIndex = linearSearch(nums1List, nums2List.get(i));
//           System.out.println("Found index at : " + searchedIndex);
            if(searchedIndex != -1){
              nums1List.remove(searchedIndex);
            }else{
                removeFromBaseList.add(nums2List.get(i));
            }
          }
//          System.out.println("remove data is : " + removeFromBaseList);
          for(int i = 0; i<removeFromBaseList.size();i++){
            nums2List.remove(removeFromBaseList.get(i));
          }
          return nums2List.stream().mapToInt(i -> i).toArray();
        }
    }

    public int linearSearch(ArrayList<Integer> arr, int key){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        IntersectionOfTwoArraysII_350 solutionObj = new IntersectionOfTwoArraysII_350();

        int[] input1 = {4,9,5};
        int[] input2 = {9,4,9,8,4};

        int[] output = solutionObj.intersect(input1,input2);


        System.out.println("Output is : ");
        for(int i = 0 ; i<output.length ; i++){
            System.out.println(output[i]+"\t");
        }

    }

}
