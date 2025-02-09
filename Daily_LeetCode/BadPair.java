package Daily_LeetCode;

import java.util.HashMap;
import java.util.Map;

public class BadPair {
    public long countBadPairs(int[] nums) {
        int n = nums.length;

        long count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            int diff = i - nums[i];
            int goodP = map.getOrDefault(diff, 0);
            count += i - goodP;
            map.put(diff, goodP+1);
        }

        return count;
    }
}
