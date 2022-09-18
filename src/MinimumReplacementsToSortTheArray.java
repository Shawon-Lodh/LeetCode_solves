public class MinimumReplacementsToSortTheArray {

    public long minimumReplacement(int[] nums) {
        int len = nums.length;
        long prev = nums[len-1];
        long division;
        long count = 0;
        for(int i = len-2; i>=0; i--){
           if(nums[i]>prev){
               division = (int) Math.ceil(nums[i]/(double)prev);
               prev = nums[i]/division;
               count = count + (division-1);
               System.out.println(count);
           }else{
               prev = nums[i];
           }
        }

        return count;
    }

    public static void main(String[] args) {

        MinimumReplacementsToSortTheArray solutionObj = new MinimumReplacementsToSortTheArray();

        int[] input = {19,7,2,24,11,16,1,11,23};

        for(int i = 0 ;i<input.length;i++){
            System.out.print(input[i]+"\t");
        }
        System.out.println();

        long output = solutionObj.minimumReplacement(input);

        System.out.println("Output is : " + output);

    }
}
