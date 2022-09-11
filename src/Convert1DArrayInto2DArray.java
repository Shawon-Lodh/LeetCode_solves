public class Convert1DArrayInto2DArray {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n)
            return new int[0][0];
        int index = 0;
        int[][] result = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                result[i][j] = original[index++];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Convert1DArrayInto2DArray solutionObj = new Convert1DArrayInto2DArray();

        int[] input = {1,2,3,4};
        int m = 1;
        int n = 3;

        int[][] output = solutionObj.construct2DArray(input,m,n);

        System.out.println("Output is :");
        for(int i = 0;i<output.length;i++){
            for(int j = 0;j<output[i].length;j++){
                System.out.print(output[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
