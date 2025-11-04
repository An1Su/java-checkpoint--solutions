package BuilderBlueprint;

public class RegexDirector {
    private RegexBuilder builder;

    public void setBuilder(RegexBuilder builder) {
        this.builder = builder;
    }

    public Regex construct() {
        if (builder == null) {
            return null;
        }
        builder.buildLiteral("Hello");
        builder.buildWhitespace();
        builder.buildWordCharacter();
        builder.buildAnyCharacter();
        return builder.getResult();
    }
}