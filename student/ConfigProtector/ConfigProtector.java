package ConfigProtector;

import java.util.List;

public class ConfigProtector {
    public String hideSensitiveData(String configFile, List<String> sensitiveKeys) {
        if (configFile == null || configFile.isEmpty()) {
            return "";
        }
        if (sensitiveKeys == null) {
            sensitiveKeys = List.of();
        }
        StringBuilder result = new StringBuilder();
        String[] lines = configFile.split("\n");

        for (String line : lines) {
            String[] parts = line.split("=", 2);
            if (parts.length < 2) {
                result.append(line).append("\n");
                continue;
            }
            String key = parts[0];
            String value = parts[1];

            if (sensitiveKeys.contains(key)) {
                value = "*".repeat(value.length());
            }

            result.append(key).append("=").append(value).append("\n");
        }
        return result.toString();
    }
}