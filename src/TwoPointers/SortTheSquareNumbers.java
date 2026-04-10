package TwoPointers;

public class SortTheSquareNumbers {
    void main() {
        int [] nums = {-4,-1,0,3,10};
        int i = 0, j = nums.length - 1,index = nums.length - 1;
        int[] result = new int[nums.length];
        while (i != j) {
            if ((nums[i] * nums[i]) < (nums[j] * nums[j])) {
                result[index--] = nums[j] * nums[j];
                j--;
            }
            else {
                result[index--] = nums[i] * nums[i];
                i++;
            }
        }
        result[index--] = nums[i] * nums[i];
        for(int n: result) System.out.println(n+" ");
    }
}
