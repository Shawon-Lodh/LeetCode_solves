import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        int[] nums3 = nums1.clone();

        System.out.println("1st array is :");
        for(int i = 0; i<nums1.length; i++){
            System.out.print(nums1[i]+"\t");
        }

        System.out.println();
        System.out.println("2nd array is :");
        for(int i = 0; i<nums2.length; i++){
            System.out.print(nums2[i]+"\t");
        }
        System.out.println();


        int i = 0, j = 0, k = 0;

        if(m==0) {
            while (j < n) {
                nums1[k] = nums2[j];
                j++;
                k++;
            }
        }else{
            while(i<m && j<n){
                if(nums3[i]<= nums2[j]){
                    nums1[k] = nums3[i];
                    i++;
                    k++;
                }else{
                    nums1[k] = nums2[j];
                    j++;
                    k++;
                }
                if(i==m){
                    while(j<n){
                        nums1[k] = nums2[j];
                        j++;
                        k++;
                    }
                }
                if(j==n){
                    while(i<m){
                        nums1[k] = nums3[i];
                        i++;
                        k++;
                    }
                }
            }
        }

        System.out.println("Output is :");
        for(int x = 0; x<nums1.length; x++){
            System.out.print(nums1[x]+"\t");
        }

    }

    public static void main(String[] args) {

        MergeSortedArray solutionObj = new MergeSortedArray();

        int[] input1 = {0};
        int input1Size = 0;
        int[] input2 = {1};
        int input2Size = 1;

        solutionObj.merge(input1,input1Size,input2,input2Size);

    }

}
