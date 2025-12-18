package pokedexProj.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Pokedex {
    private final List<Pokemon> pokemons = new ArrayList<>();
    private int nextId = 1;

    public synchronized Pokemon add(String name, Type type, int hp) {
        Pokemon p = new Pokemon(nextId++, name, type, hp);
        pokemons.add(p);
        return p;
    }

    public synchronized boolean removeById(int id) {
        return pokemons.removeIf(p -> p.getId() == id);
    }

    public Optional<Pokemon> findById(int id) {
        return pokemons.stream().filter(p -> p.getId() == id).findFirst();
    }

    public List<Pokemon> listAll() {
        return Collections.unmodifiableList(pokemons);
    }

    public void clear() {
        pokemons.clear();
        nextId = 1;
    }
}
