package FirstUnique;


public class FirstUnique {
    public char findFirstUnique(String s) {
        if (s == null || s.length() == 0) return '_';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean foundDuplicate = false;

            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(j) == c) {
                    foundDuplicate = true;
                    break;
                }
            }

            if (!foundDuplicate) return c;
        }

        return '_';
    }
}