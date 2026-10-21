
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int ans = -1;

        for (int i : map.keySet()) {
            if (map.get(i) > n) {
                ans = i;
                break;
            }
        }

        return ans;
    }
}
