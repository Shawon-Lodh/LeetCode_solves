import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku_36 {

    public boolean isValidSudoku(char[][] board) {


//        System.out.println("Input is : ");
//        for(int i = 0;i<board.length;i++){
//            for(int j = 0;j<board[i].length;j++){
//                System.out.print(String.valueOf(board[i][j]) + '\t');
//            }
//            System.out.println();
//        }

//        System.out.println("Row checking validity is : "+ checkBasedOnRowOrColumn(board));
        if(!checkBasedOnRowOrColumn(board)){
            return false;
        }

//        System.out.println("Column checking validity is : "+ checkBasedOnRowOrColumn(getTransposeMatrix(board)));

        if(!checkBasedOnRowOrColumn(getTransposeMatrix(board))){
            return false;
        }

        int rowGap = 0 , colGap = 0;

        while(rowGap != board.length){
            char[][] copy = new char[3][3];
            for(int i = 0; i<3; i++){
                System.arraycopy(board[rowGap + i], colGap, copy[i], 0, 3);
            }

//            System.out.println("Row index control from : "+ rowGap + " Col index control from :"+ colGap);

//            System.out.println("Cube checking validity is : "+ checkBasedOnCube(copy));

            if(!checkBasedOnCube(copy)){
//                System.out.println("Cube checking validity is : "+ checkBasedOnCube(copy));
                return false;
            }

            if(colGap == board.length - 3){
                rowGap = rowGap + 3;
                colGap = 0;
            }else{
                colGap = colGap + 3;
            }

        }

       return true;
    }

    public boolean checkBasedOnRowOrColumn(char[][] board) {

//        System.out.println("Input is : ");
//        for(int i = 0;i<board.length;i++){
//            for(int j = 0;j<board[i].length;j++){
//                System.out.print(String.valueOf(board[i][j]) + '\t');
//            }
//            System.out.println();
//        }

        for (char[] chars : board) {
            char[] temp = chars.clone();
            Arrays.sort(temp);
            int k = temp.length - 1;
//            System.out.println("Value of row");
//            for(int index = 0; index<k ; index++){
//                System.out.print(temp[index] + "\t");
//            }
            while (k != 0) {
//                System.out.println("Value of k is : "+k);
                if (temp[k] == '.') {
                    break;
                } else {
                    if (temp[k] == temp[k - 1]) {
                        return false;
                    } else {
                        k = k - 1;
                    }
                }
            }
        }
        return true;
    }

    public boolean checkBasedOnCube(char[][] boardCubePart) {

//        System.out.println("Cube based Input is : ");
//        for(int i = 0;i<boardCubePart.length;i++){
//            for(int j = 0;j<boardCubePart[i].length;j++){
//                System.out.print(String.valueOf(boardCubePart[i][j]) + '\t');
//            }
//            System.out.println();
//        }

        Set<Character> set = new HashSet<>();

        for (char[] chars : boardCubePart) {
            for (int j = 0; j < boardCubePart.length; j++) {
                if (set.contains(chars[j]) && chars[j] != '.') {
                    return false;
                }
                set.add(chars[j]);
            }
        }
        return true;
    }

    char[][] getTransposeMatrix(char[][] input){
        char[][] boardTranspose = new char[input.length][input.length];

        for(int i = 0;i<input.length;i++){
            for(int j = 0;j<input[i].length;j++){
                boardTranspose[i][j] = input[j][i];
            }
//            System.out.println();
        }
        return boardTranspose;
    }

    public static void main(String[] args) {

       ValidSudoku_36 solutionObj = new ValidSudoku_36();

       char[][] input = {{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};


        boolean output = solutionObj.isValidSudoku(input);

        System.out.println("Output is : "+output);

    }
}
