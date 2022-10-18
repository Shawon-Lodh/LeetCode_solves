/*
        First, this is string rotation.
        12345 -> 23451 -> 34512 -> 45123 -> 51234
        I use number instead of letters to make it clear.

        If K == 1, we can only rotate the whole string.
        There are S.length different states and
        we return the lexicographically smallest string.

        If K > 1, it means we can:

        rotate the whole string,
        rotate the whole string except the first letter.
        012345 -> 023451 -> 034512 -> 045123 -> 051234
        We can rotate i+1th big letter to the start (method 1),
        then rotate ith big letter to the end (method 2).
        2XXX01 -> XXX012

        In this way, we can bubble sort the whole string lexicographically.
        So just return sorted string.

 */

import java.util.Arrays;

public class OrderlyQueue_899 {
    public String orderlyQueue(String S, int K) {
        if (K > 1) {
            char[] S2 = S.toCharArray();
            Arrays.sort(S2);
            return new String(S2);
        }

        String res = S;
        for (int i = 1; i < S.length(); i++) {
            String tmp = S.substring(i) + S.substring(0, i);
            System.out.println("Temp String is : "+tmp);
            if (res.compareTo(tmp) > 0) res = tmp;
        }

        return res;
    }

    public static void main(String[] args) {

        OrderlyQueue_899 solutionObj = new OrderlyQueue_899();

        String input = "cba";
        int k = 1;

        System.out.println("Input is : " + input);

        String output = solutionObj.orderlyQueue(input,k);

        System.out.println("Output is : " + output);

    }

}
