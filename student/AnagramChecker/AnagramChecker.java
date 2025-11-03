package AnagramChecker;

import java.util.Arrays;

public class AnagramChecker {
    public boolean isAnagram(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return false;
        }

        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}