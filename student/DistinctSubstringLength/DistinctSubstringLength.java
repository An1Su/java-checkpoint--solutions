package DistinctSubstringLength;

import java.util.HashSet;

public class DistinctSubstringLength {
    public int maxLength(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int max = 0;
        int start = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int z = 0; z < s.length(); z++) {
            char c = s.charAt(z);

            while (seen.contains(c)) {
                seen.remove(s.charAt(start));
                start++;
            }

            seen.add(c);
            int length = z - start + 1;
            if (length > max) max = length;
        }

        return max;
    }
}