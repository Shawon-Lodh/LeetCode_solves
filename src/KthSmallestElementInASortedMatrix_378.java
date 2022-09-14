import java.util.*;

public class KthSmallestElementInASortedMatrix_378 {
    public int kthSmallest(int[][] matrix, int k) {
        System.out.println("List is : "+ flattenArray(matrix));
        return flattenArray(matrix).get(k - 1);
    }

    public static List<Integer> flattenArray(int[][] array) {
        List<Integer> oneDimensionalArray = new ArrayList<>();
        for (int[] row : array) {
            for (int col : row) {
                oneDimensionalArray.add(col);
            }
        }
        Collections.sort(oneDimensionalArray);
        return oneDimensionalArray;
    }

    public static void main(String[] args) {

        KthSmallestElementInASortedMatrix_378 solutionObj = new KthSmallestElementInASortedMatrix_378();

        int[][] input = {
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };

        int target = 8;

        int output = solutionObj.kthSmallest(input,target);

        System.out.println("Output is : " + output);


    }

}
