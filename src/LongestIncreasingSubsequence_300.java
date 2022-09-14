import java.util.*;

public class LongestIncreasingSubsequence_300 {

    public int lengthOfLIS(int[] nums) {

        ArrayList<Integer> lis = new ArrayList<>();

        for(int num:nums){

            int size = lis.size();

            if(size==0 ||size>0 && num>lis.get(size-1)){
                lis.add(num);
            }else{
                int insertIndex = bs(lis,num);
                lis.set(insertIndex,num);
            }
        }

        return lis.size();
    }

    int bs(List<Integer> list, int target){
        int lo = 0;
        int hi = list.size()-1;

        while(lo<hi){
            int mid = (lo+hi)/2;
            if(list.get(mid)<target){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return lo;
    }

    public static void main(String[] args) {

        LongestIncreasingSubsequence_300 solutionObj = new LongestIncreasingSubsequence_300();

        int[] input = {5,7,-24,12,13,2,3,12,5,6,35};   //10,9,2,5,3,7,101,18  4,10,4,3,8,9   10,5,0,1,3,2,5,4    10,9,2,5,3,7,101,18    0,3,1,6,2,2,7   10,22,9,33,21,50,41,60,80    10,9,2,5,3,7,101,18    3,10,2,1,20     3,2     50,3,10,7,40,80

        int output = solutionObj.lengthOfLIS(input);

        System.out.println("Output is : " + output);

    }

}

