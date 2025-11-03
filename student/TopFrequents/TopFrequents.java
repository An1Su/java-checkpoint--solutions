package TopFrequents;

import java.util.*;

public class TopFrequents {
    public List<Integer> findTopKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> firstIndex = new HashMap<>();

        for (int z = 0; z < nums.length; z++) {
            int num = nums[z];
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (!firstIndex.containsKey(num)) {
                firstIndex.put(num, z);
            }
        }

        List<Integer> result = new ArrayList<>(freq.keySet());

        result.sort((a, b) -> {
            int fa = freq.get(a);
            int fb = freq.get(b);
            if (fa != fb) return fb - fa;
            return firstIndex.get(a) - firstIndex.get(b);
        });

        if (k > result.size()) k = result.size();
        return result.subList(0, k);
    }
}