package pokedexProj.model;

import java.util.Objects;

public class Pokemon {
    private final int id;
    private String name;
    private Type type;
    private int hp;

    public Pokemon(int id, String name, Type type, int hp) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "#" + id + " " + name + " (" + (type == null ? "" : type.toString()) + ") HP:" + hp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return id == pokemon.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
