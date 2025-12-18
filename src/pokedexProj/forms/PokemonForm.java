package pokedexProj.forms;

import pokedexProj.model.Type;

public class PokemonForm implements FormValidator {
    private String name;
    private Type type;
    private int hp;
    private String error;

    public PokemonForm(String name, Type type, int hp) {
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public boolean validate() {
        if (name == null || name.trim().isEmpty()) {
            error = "Nombre vacío";
            return false;
        }
        if (type == null || type == Type.UNKNOWN) {
            error = "Tipo inválido";
            return false;
        }
        if (hp <= 0) {
            error = "HP debe ser mayor que 0";
            return false;
        }
        error = null;
        return true;
    }

    @Override
    public String getErrorMessage() {
        return error;
    }
}
