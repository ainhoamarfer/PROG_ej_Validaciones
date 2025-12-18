package pokedexProj.view;

/**
 * Enumerado de opciones del menú de la Pokedex.
 * Se mapea desde el código (cadena) que devuelve la vista.
 */
public enum MenuOption {
    LIST("1"),
    VIEW("2"),
    ADD("3"),
    DELETE("4"),
    EXIT("0"),
    UNKNOWN("");

    private final String code;

    MenuOption(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static MenuOption fromString(String s) {
        if (s == null) return UNKNOWN;
        String t = s.trim();
        if (t.isEmpty()) return UNKNOWN;
        for (MenuOption o : values()) {
            if (o.code.equals(t)) return o;
            if (o.name().equalsIgnoreCase(t)) return o;
        }
        return UNKNOWN;
    }
}
