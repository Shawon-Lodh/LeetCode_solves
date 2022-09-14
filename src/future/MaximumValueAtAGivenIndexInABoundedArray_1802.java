package future;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MaximumValueAtAGivenIndexInABoundedArray_1802 {

    public int maxValue(int n, int index, int maxSum) {
        List<Integer> nums = generateArray(n,maxSum);

        for (int i : nums)
            System.out.println(i);

        return nums.get(index);
    }

    public List<Integer> generateArray(int n, int maxSum) {
        List<Integer> nums = new ArrayList<>();

        List<Integer> tempList = new ArrayList<>();
        int maximizedNum = maxSum;

        while(true){
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    nums.add(getRandomNumber(0, maxSum));
                } else {
                    while(true){
                        System.out.println("Started as new");
                        int temp =  maximizedNum; //getRandomNumber(0,maxSum);
                        System.out.println("Past : " + nums.get(i - 1) + "Present" + temp);
                        if(getAbs(nums.get(i - 1) - temp)<= 1){
                            tempList.add(temp);
//                            nums.add(temp);
//                            break;
                        }else{
                            if(maximizedNum == 0){
                                nums.add(Collections.max(tempList));
                                maximizedNum = maxSum;
                                tempList.clear();
                                break;
                            }else{
                                maximizedNum = maximizedNum -1;
                            }
                        }
//                        else{
//                            if(min == n){
//                                break;
//                            }
//                            else{
//                                min +=1;
////                                max = min +1;
//                            }
//                        }
                    }
                }
            }
            if(generateSum(nums) <= maxSum) break;
            else nums.clear();
        }

        return nums;
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public int getRandomWithExclusion(int min, int max, int... exclude) {
        int random = min + new Random().nextInt(max - min + 1 - exclude.length);
        for (int ex : exclude) {
            if (random < ex) {
                break;
            }
            random++;
        }
        return random;
    }

    public int getAbs(int x) {
        if(x>=0) return x;
        else return -x;
    }

    public int generateSum(List<Integer> nums) {
        int sum = 0;
        for (int i : nums)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {

        MaximumValueAtAGivenIndexInABoundedArray_1802 solutionObj = new MaximumValueAtAGivenIndexInABoundedArray_1802();

//        int maxSum = solutionObj.getRandomNumber(1, (int) Math.pow(10,9));
//        int n = solutionObj.getRandomNumber(1, maxSum);
//        int index = solutionObj.getRandomNumber(1, n);

        int maxSum = 10;
        int n = 6;
        int index = 1;

        System.out.println("Input is : n=" + n + " index = "+ index + " maxsum = "+maxSum);

        int output = solutionObj.maxValue(n,index,maxSum);

        System.out.println("Output is : " + output);


    }
}
