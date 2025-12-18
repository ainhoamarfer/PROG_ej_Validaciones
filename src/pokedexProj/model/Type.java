package pokedexProj.model;

public enum Type {
    ELECTRIC("Electric"),
    FIRE("Fire"),
    WATER("Water"),
    GRASS("Grass"),
    NORMAL("Normal"),
    UNKNOWN("Unknown");

    private final String label;

    Type(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }

    public static Type fromString(String s) {
        if (s == null) return UNKNOWN;
        String trimmed = s.trim();
        if (trimmed.isEmpty()) return UNKNOWN;
        // direct matches: name or label
        for (Type t : values()) {
            if (t.name().equalsIgnoreCase(trimmed)) return t;
            if (t.label.equalsIgnoreCase(trimmed)) return t;
        }
        // single-letter shortcuts
        String up = trimmed.toUpperCase();
        switch (up) {
            case "E":
                return ELECTRIC;
            case "F":
                return FIRE;
            case "W":
                return WATER;
            case "G":
                return GRASS;
            case "N":
                return NORMAL;
            default:
                return UNKNOWN;
        }
    }
}
