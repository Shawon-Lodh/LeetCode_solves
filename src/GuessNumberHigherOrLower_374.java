public class GuessNumberHigherOrLower_374 {

    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */

    public int guess(int num) {
        return 1;
    }

    public int guessNumber(int n) {

            if(n==1) return 1;

            int start = 1;
            int end = n;

            int mid;

            while(start<=end){
                mid=start+(end-start)/2;
                if(guess(mid) == -1){
                    end = mid - 1;
                }else if(guess(mid) == 0){
                    return mid;
                }else{
                    start = mid + 1;
                }
            }
            return 0;


        }

    public static void main(String[] args) {

        GuessNumberHigherOrLower_374 solutionObj = new GuessNumberHigherOrLower_374();

        int input = 10;

        int output = solutionObj.guessNumber(input);

        System.out.println("Output is : " + output);

    }
}
