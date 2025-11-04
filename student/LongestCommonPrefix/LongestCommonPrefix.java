package LongestCommonPrefix;

public class LongestCommonPrefix {
    public String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String first = strs[0];
        if (first == null) return "";

        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);

            for (int z = 1; z < strs.length; z++) {
                if (strs[z] == null || i >= strs[z].length() || strs[z].charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }
}

