public class MostFrequentEvenElement {
    public int mostFrequentEven(int[] nums) {
        int value, occurrences;
        int maxValue = -1, maxOccurrences = 0;
        for(int i = 0; i < nums.length; i++){
            value = nums[i]; occurrences = 0;
            for(int j = 0; j < nums.length; j++){
                if((nums[j]%2 == 0) && nums[j] == value) occurrences++;
            }
            if(occurrences > maxOccurrences){
                maxValue = value; maxOccurrences = occurrences;
            }
            else if(occurrences == maxOccurrences){
                if(value < maxValue) {
                    maxValue = value;
                    maxOccurrences = occurrences;
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {

        MostFrequentEvenElement solutionObj = new MostFrequentEvenElement();

        int[] input = {0,1,2,2,4,4,1};

        int output = solutionObj.mostFrequentEven(input);

        System.out.println("Output is : " + output);

    }
}
