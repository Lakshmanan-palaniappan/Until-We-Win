public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int num[] = new int[n];
        int left = 0;
        int right = n - 1;
        int pos = n - 1;
        while (left <= right) {
            int ls = nums[left] * nums[left];
            int rs = nums[right] * nums[right];
            if (ls > rs) {
                num[pos--] = ls;
                left++;
            } else {
                num[pos--] = rs;
                right--;
            }
        }
        return num;

    }
}