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
