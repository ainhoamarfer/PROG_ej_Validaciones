package pokedexProj;
import pokedexProj.model.Pokedex;
import pokedexProj.model.Type;
import pokedexProj.controller.PokedexController;
import pokedexProj.view.PokedexView;

public class App {
    public static void main(String[] args) throws Exception {
        Pokedex model = new Pokedex();
        PokedexView view = new PokedexView();
        PokedexController controller = new PokedexController(model, view);
        // datos de ejemplo
        controller.addPokemon("Pikachu", Type.ELECTRIC, 35);
        controller.addPokemon("Charmander", Type.FIRE, 39);
        controller.addPokemon("Squirtle", Type.WATER, 44);

        controller.start();
    }
}
