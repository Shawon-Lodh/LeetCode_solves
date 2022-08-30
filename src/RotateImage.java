public class RotateImage {

//    static void rotate(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = i; j < matrix[0].length; j++) {
//                int temp = 0;
//                temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length / 2; j++) {
//                int temp = 0;
//                temp = matrix[i][j];
//                matrix[i][j] = matrix[i][matrix.length - 1 - j];
//                matrix[i][matrix.length - 1 - j] = temp;
//            }
//        }
//    }
    public void rotate(int[][] matrix) {

        // matrix transpose

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }


//        System.out.println("Output is : ");
//        for(int i = 0 ; i<matrix.length ; i++){
//            for(int j = 0 ; j<matrix.length ; j++){
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }

        matrix = columnSwap(matrix);

        System.out.println("Output is : ");
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix.length ; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public int[][] columnSwap(int arr[][]){
        int len = arr.length;
//        int ret[][] = new int[len][len];

        int mid;
        boolean isEvenColumn = (arr.length%2 == 0);

        if(isEvenColumn){
            mid = (arr.length/2)-1;
        }else{
            mid = (arr.length/2);
        }

        while(mid!=-1){
            if(mid!=(len-mid-1)){
              for(int i = 0; i<len ; i++){
                 arr[i][mid] ^= arr[i][len-mid-1];
                 arr[i][len-mid-1] ^= arr[i][mid];
                 arr[i][mid] ^= arr[i][len-mid-1];
              }
            }
            mid--;
        }


        return arr;

    }

    public static void main(String[] args) {

        RotateImage solutionObj = new RotateImage();

        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        int[][] input = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

        System.out.println("Input is : ");
        for(int i = 0 ; i<input.length ; i++){
            for(int j = 0 ; j<input.length ; j++){
                System.out.print(input[i][j] + "\t");
            }
            System.out.println();
        }

        solutionObj.rotate(input);

    }
}
