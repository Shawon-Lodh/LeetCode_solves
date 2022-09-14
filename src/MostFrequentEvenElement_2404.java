import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement_2404 {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(nums[i]%2 == 0){
              freq.put(nums[i],freq.get(nums[i]) == null ? 1 : freq.get(nums[i])+1);
            }
        }
        if(freq.size() != 0){
            int maxValue = Collections.max(freq.values());
            ArrayList<Integer> keys = new ArrayList<>();
            freq.forEach((k,val) -> {
                if (val.equals(maxValue)){
                    keys.add(k);
                }
            });
            return  Collections.min(keys);
        }

        return -1;
    }

    public static void main(String[] args) {

        MostFrequentEvenElement_2404 solutionObj = new MostFrequentEvenElement_2404();

        int[] input = {8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};

        int output = solutionObj.mostFrequentEven(input);

        System.out.println("Output is : " + output);

    }
}
