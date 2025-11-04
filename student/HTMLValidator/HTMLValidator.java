package HTMLValidator;

import java.util.*;

public class HTMLValidator{
    public boolean validateHTML(String html) {
        if (html == null) return false;
        String[] tagList = new String[html.length()];
        int tagIndex = 0;

        for (int i = 0; i < html.length(); i++) {
            if (html.charAt(i) == '<') {
                int start = i;
                int end = html.indexOf('>', start);
                if (end == -1) return false;

                String tag = html.substring(start + 1, end).trim();
                if (tag.length() == 0) return false;

                if (tag.equals("br/")) {
                    i = end;
                    continue;
                }

                if (tag.charAt(0) == '/') {
                    String tagName = tag.substring(1);
                    if (tagIndex == 0 || !tagList[tagIndex - 1].equals(tagName)) return false;
                    tagIndex--;
                } else {
                    tagList[tagIndex] = tag;
                    tagIndex++;
                }
                i = end;
            }
        }
        return tagIndex == 0;
    }
}
