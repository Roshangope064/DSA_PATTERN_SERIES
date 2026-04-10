package TwoPointers;

public class MergeTwoSortedArray {
    void main(){
            int []arr0 = {0, 0, 1, 1, 1, 2};
            int []arr1 = {0, 0, 1, 1, 1, 2};
            int i = 0;
            int j = 0;
            int index = 0;
            int [] arr2 = new int[(arr0.length+arr1.length)];
            while(i<arr0.length && j<arr1.length){
                if(arr0[i]<arr1[j])arr2[index++] = arr0[i++];
                else arr2[index++] = arr1[j++];
            }
            while(i<arr0.length)arr2[index++] =arr0[i++];
            while(j<arr1.length)arr2[index++] =arr1[j++];
            for(int n : arr2){
                System.out.print(n+" ");
            }
    }
}
