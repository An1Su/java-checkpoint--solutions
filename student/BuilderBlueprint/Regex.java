package BuilderBlueprint;

import java.util.List;

public class Regex {
    private StringBuilder pattern;

    public Regex(List<String> component) {
        pattern = new StringBuilder();
        if (component != null) {
            for (String s : component) {
                if (s != null && !s.isEmpty()) {
                    pattern.append(s);
                }
            }
        }
    }

    public String getPattern() {
        return pattern.toString();
    }
    @Override
    public String toString() {
        return pattern.toString();
    }

}