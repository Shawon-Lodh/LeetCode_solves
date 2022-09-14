public class RansomNote_383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        boolean status = false;
        StringBuilder magazineStr = new StringBuilder().append(magazine);
        StringBuilder ransomNoteStr = new StringBuilder().append(ransomNote);
        int matchedIndex = -1;

        for(int i = 0; i < ransomNoteStr.length(); i++)
        {
            matchedIndex = magazineStr.indexOf(String.valueOf(ransomNoteStr.charAt(i)));
            if(matchedIndex == -1){
                status = false;
                break;
            }else{
                status = true;
                magazineStr.deleteCharAt(matchedIndex);
            }
        }
        return status;
    }

    public static void main(String[] args) {

        RansomNote_383 solutionObj = new RansomNote_383();

        String input1 = "ab";
        String input2 = "bb";

        boolean output = solutionObj.canConstruct(input1,input2);

        System.out.println("Output is : " + output);

    }
}
