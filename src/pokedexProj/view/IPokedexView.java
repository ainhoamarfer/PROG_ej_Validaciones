package pokedexProj.view;

import pokedexProj.model.Pokemon;
import java.util.List;
import pokedexProj.forms.PokemonForm;
import pokedexProj.forms.IdForm;

/**
 * Interfaz que representa la vista de la Pokedex.
 *
 * Encapsula las operaciones de entrada/salida necesarias para interactuar con
 * el usuario: mostrar menús y mensajes, leer opciones y construir formularios.
 */

/**
 * Interfaz que representa la vista de la Pokedex.
 *
 * Encapsula las operaciones de entrada/salida necesarias para interactuar con
 * el usuario: mostrar menús y mensajes, leer opciones y construir formularios.
 */
public interface IPokedexView {

    /** Muestra el menú principal al usuario. */
    void showMenu();

    /**
     * Lee la opción elegida por el usuario desde la entrada.
     *
     * @return la opción seleccionada como {@link MenuOption}
     */
    MenuOption readOption();

    /**
     * Muestra una lista de Pokemons.
     *
     * @param list lista de {@link Pokemon} a mostrar
     */
    void showList(List<Pokemon> list);

    /**
     * Muestra un único Pokemon o un mensaje apropiado si es {@code null}.
     *
     * @param p el {@link Pokemon} a mostrar, o {@code null} si no existe
     */
    void showPokemon(Pokemon p);

    /**
     * Muestra un mensaje general al usuario.
     *
     * @param msg mensaje a mostrar
     */
    void showMessage(String msg);

    /**
     * Lee una línea de texto con un prompt.
     *
     * @param prompt texto de solicitud
     * @return la línea leída
     */
    String readLine(String prompt);

    /**
     * Lee un entero desde la entrada con un prompt.
     *
     * @param prompt texto de solicitud
     * @return el entero leído (implementación puede manejar errores)
     */
    int readInt(String prompt);

    /**
     * Construye un {@link PokemonForm} leyendo los datos necesarios del usuario.
     *
     * @return el formulario con los valores introducidos
     */
    PokemonForm readPokemonForm();

    /**
     * Construye un {@link IdForm} leyendo un identificador del usuario.
     *
     * @param prompt texto de solicitud para el id
     * @return el formulario con el id introducido
     */
    IdForm readIdForm(String prompt);
}
