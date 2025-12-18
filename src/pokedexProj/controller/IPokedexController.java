package pokedexProj.controller;

import pokedexProj.model.Pokemon;
import pokedexProj.model.Pokedex;
import pokedexProj.model.Type;

/**
 * Interfaz que define las operaciones públicas del controlador de la Pokedex.
 *
 * Implementaciones deben encargarse de coordinar la interacción entre el
 * modelo (`Pokedex`) y la vista (`IPokedexView`). Provee métodos para crear
 * y eliminar Pokemons, iniciar el bucle principal de la aplicación y
 * acceder al modelo subyacente.
 */
public interface IPokedexController {

    /**
     * Crea y añade un nuevo Pokemon al modelo.
     *
     * @param name nombre del Pokemon
     * @param type tipo del Pokemon (enum {@link Type})
     * @param hp puntos de vida
     * @return el {@link Pokemon} creado y añadido al modelo
     */
    Pokemon addPokemon(String name, Type type, int hp);

    /**
     * Elimina un Pokemon por su identificador.
     *
     * @param id identificador del Pokemon a eliminar
     * @return {@code true} si se eliminó con éxito, {@code false} si no se encontró
     */
    boolean removePokemon(int id);

    /**
     * Inicia el bucle principal del controlador (por ejemplo, un menú
     * interactivo) y gestiona la interacción usuario-modelo-vista.
     */
    void start();

    /**
     * Devuelve la instancia del modelo utilizada por el controlador.
     *
     * @return la {@link Pokedex} asociada
     */
    Pokedex getModel();
}
