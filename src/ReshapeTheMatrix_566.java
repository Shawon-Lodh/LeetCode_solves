public class ReshapeTheMatrix_566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r*c)
            return mat;
        int matRow = 0;
        int matCol = 0;
        int[][] result = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                result[i][j] = mat[matRow][matCol];
                if(matCol<mat[0].length-1){
                    matCol++;
                }else{
                    matRow++;
                    matCol = 0;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        ReshapeTheMatrix_566 solutionObj = new ReshapeTheMatrix_566();

        int[][] input = {{1,2},{3,4},{5,6}};
        int r = 3;
        int c = 2;

        int[][] output = solutionObj.matrixReshape(input,r,c);

        System.out.println("Output is :");
        for(int i = 0;i<output.length;i++){
            for(int j = 0;j<output[i].length;j++){
                System.out.print(output[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
