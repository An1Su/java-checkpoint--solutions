/*package HTMLValidator;

import java.util.*;

public class HTMLValidator {
    public boolean validateHTML(String html) {
    int start = -1;
    int end = -1;
    boolean isClosing = false;
    String[] tagList = new String[html.length()];
    int lastIndex = -1;

    for (int i = 0; i < html.length(); i++) {
        if (html.charAt(i) == '<') {
            start = i;
            isClosing = (i + 1 < html.length() && html.charAt(i + 1) == '/');
        }
        if (html.charAt(i) == '>') {
            end = i;
            String fullTag = html.substring(start + 1, end);
            if (isClosing) {
                fullTag = fullTag.substring(1);
                if (lastIndex < 0 || !tagList[lastIndex].equals(fullTag)) {
                    return false;
                }
                lastIndex--;
            } else {
                lastIndex++;
                tagList[lastIndex] = fullTag;
            }
            isClosing = false;
        }
    }
    return lastIndex == -1;
}


}*/