import java.util.HashMap;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while (i < nums.length) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[] { i, map.get(x) };
            }
            map.put(nums[i], i);
            ++i;
        }
        return new int[] {};
    }
}
