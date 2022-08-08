package future;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {

//        List<Integer> result = new ArrayList<Integer>();

        List<Integer> resultsLength = new ArrayList<Integer>();

        int min = Arrays.stream(nums).min().getAsInt();
        int minIndex = findIndex(nums,min);
        System.out.println("Min is : "+min+" Index is : "+minIndex);

        int i = 0;
//        int length = nums.length;

        int minIndexValue = 0;

        int runningCount = 1;

        if(minIndex != 0){
          runningCount = 2;
        }

        System.out.println("Start from : "+i+" & running count : "+runningCount);

        while (runningCount!=0){
            if(runningCount == 2){
               i = minIndex;
               minIndexValue = minIndex;
            } else if (runningCount == 1) {
                i = 0;
                minIndexValue = 0;
            }


            System.out.println("Start from : "+i+" & running count : "+runningCount);


            resultsLength.add(findSubsequenceLength(nums,i,minIndexValue));

            runningCount--;
        }

        System.out.println("Subsequences lengths are ");
        for(int j : resultsLength){
            System.out.println(j);
        }

        return Collections.max(resultsLength);
    }

    public int findIndex(int arr[], int t)
    {
        int len = arr.length;
        return IntStream.range(0, len)
                .filter(i -> t == arr[i])
                .findFirst() // first occurrence
                .orElse(-1); // No element found
    }

    public int findSubsequenceLength(int nums[], int i, int minIndexValue)
    {
        List<Integer> result = new ArrayList<Integer>();

        for(;i<nums.length;i++){
            if(i == minIndexValue){
                result.add(nums[i]);
            }else{

                if(result.size()>1){
                    if(result.get(result.size()-1)>=nums[i] && result.get(result.size()-2)<nums[i] && result.get(result.size()-2)!=nums[i]){
                        result.set(result.size()-1,nums[i]);
                    }else if(result.get(result.size()-1)<nums[i] && result.get(result.size()-2)<nums[i]){
                        result.add(nums[i]);
                    }
                }else{
                    if(result.get(result.size()-1)>=nums[i]){
                        result.set(result.size()-1,nums[i]);
                    }else{
                        result.add(nums[i]);
                    }
                }

            }
            System.out.println("Every time result condition");
            for(int j : result){
                System.out.println(j);
            }

            System.out.println();
            System.out.println();
        }

        return result.size();
    }

    public static void main(String[] args) {

        LongestIncreasingSubsequence solutionObj = new LongestIncreasingSubsequence();

        int[] input = {5,7,-24,12,13,2,3,12,5,6,35};   //10,9,2,5,3,7,101,18  4,10,4,3,8,9   10,5,0,1,3,2,5,4    10,9,2,5,3,7,101,18    0,3,1,6,2,2,7   10,22,9,33,21,50,41,60,80    10,9,2,5,3,7,101,18    3,10,2,1,20     3,2     50,3,10,7,40,80

        int output = solutionObj.lengthOfLIS(input);

        System.out.println("Output is : " + output);

    }

}

