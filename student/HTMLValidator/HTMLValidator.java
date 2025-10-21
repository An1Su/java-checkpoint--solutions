package HTMLValidator;

import java.util.*;

public class HTMLValidator {
    public boolean validateHTML(String html) {
        Stack<String> stack = new Stack<>();
        int i = 0;

        while (i < html.length()) {
            if (html.charAt(i) == '<') {
                int j = html.indexOf('>', i);
                if (j == -1) return false;

                String tag = html.substring(i + 1, j).trim();

                if (tag.endsWith("/")) {
                    i = j + 1;
                    continue; // самозакрывающийся тег
                }

                boolean isClosing = tag.startsWith("/");
                String tagName = isClosing ? tag.substring(1) : tag;

                if (isClosing) {
                    if (stack.isEmpty() || !stack.peek().equals(tagName)) {
                        return false;
                    }
                    stack.pop();
                } else {
                    stack.push(tagName);
                }

                i = j + 1;
            } else {
                i++;
            }
        }

        return stack.isEmpty();
    }
}