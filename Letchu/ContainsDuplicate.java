import java.util.*;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> cdp = new HashSet<>();
        for (int num : nums) {
            if (!cdp.add(num))
                return true;
        }
        return false;

    }
}