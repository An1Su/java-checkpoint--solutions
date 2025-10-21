package ConfigProtector;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConfigProtector {
    public String hideSensitiveData(String configFile, List<String> sensitiveKeys) {
        for (String key : sensitiveKeys) {
            Pattern pattern = Pattern.compile(key + "=([^\\n]*)");
            Matcher matcher = pattern.matcher(configFile);

            StringBuilder result = new StringBuilder();
            while (matcher.find()) {
                String value = matcher.group(1);
                String masked = "*".repeat(value.length());
                matcher.appendReplacement(result, key + "=" + masked);

            }
            matcher.appendTail(result);
            configFile = result.toString();
        }
        return configFile;
    }
}