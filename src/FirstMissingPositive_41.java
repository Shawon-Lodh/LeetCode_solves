public class FirstMissingPositive_41 {

    // another solution

//    public int firstMissingPositive2(int[] nums) {
//        int len = nums.length;
//        ArrayList<Integer> numList = new ArrayList<>();
////        for(int i = 0; i<nums.length; i++){
////            System.out.print(nums[i]+"\t");
////        }
//
//        Arrays.sort(nums);
//
//        int value = 1;
//        while(true){
//            if(binarySearch(nums,value) != -1){
//                value++;
//            }else{
//                return value;
//            }
//        }
//
////        for(int i = 0; i<nums.length; i++){
////            numList.add(nums[i]);
////        }
////
//////        for(int i = 0, value = 1; i<numList.size() && value<=len ; i++){
//////            if(nums[i]>=1){
//////                System.out.println("value of i is :"+i+ " & value is : "+ value);
//////                if(nums[i] != value){
//////                    return value;
//////                }else{
//////                    value++;
//////                }
//////            }
//////        }
////
////        int value = 1;
////        while(true){
////            if(numList.contains(value)){
////                value++;
////            }else{
////                return value;
////            }
////        }
//
//    }
//
//    int binarySearch(int[] nums, int key){
//      if(Arrays.binarySearch(nums,key)<0){
//          return -1;
//      }else{
//          return Arrays.binarySearch(nums,key);
//      }
//    }

    public int firstMissingPositive(int[] nums) {

        int len = nums.length;
        int[] numCopyWithExtraOne = new int[len+1];


        for(int i = 0; i<len; i++){
            if(nums[i]>0 && nums[i]<=len){
                numCopyWithExtraOne[nums[i]] = nums[i];
            }
        }

        int index = 1;
        while(index<len+1){
            if(numCopyWithExtraOne[index] == index){
                index++;
            }else{
                return index;
            }
        }

        return len+1;
    }

    public static void main(String[] args) {

        FirstMissingPositive_41 solutionObj = new FirstMissingPositive_41();

        int[] input = {1,2,0};

        int output = solutionObj.firstMissingPositive(input);

        System.out.println("Output is : " + output);

    }
}
