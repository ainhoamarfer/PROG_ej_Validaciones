package pokedexProj.controller;

import pokedexProj.forms.IdForm;
import pokedexProj.forms.PokemonForm;
import pokedexProj.model.Pokemon;
import pokedexProj.model.Pokedex;
import pokedexProj.model.Type;
import pokedexProj.view.IPokedexView;
import pokedexProj.view.MenuOption;

import java.util.Optional;

public class PokedexController implements IPokedexController {
    private final Pokedex model;
    private final IPokedexView view;

    public PokedexController(Pokedex model, IPokedexView view) {
        this.model = model;
        this.view = view;
    }

    public Pokemon addPokemon(String name, Type type, int hp) {
        return model.add(name, type, hp);
    }

    public boolean removePokemon(int id) {
        return model.removeById(id);
    }

    public void start() {
        boolean running = true;
        while (running) {
            view.showMenu();
            MenuOption opt = view.readOption();
            switch (opt) {
                case LIST:
                    view.showList(model.listAll());
                    break;
                case VIEW:
                    IdForm idForm = view.readIdForm("Id: ");
                    if (!idForm.validate()) {
                        view.showMessage(idForm.getErrorMessage());
                        break;
                    }
                    Optional<Pokemon> p = model.findById(idForm.getId());
                    view.showPokemon(p.orElse(null));
                    break;
                case ADD:
                    PokemonForm form = view.readPokemonForm();
                    if (!form.validate()) {
                        view.showMessage(form.getErrorMessage());
                        break;
                    }
                    Pokemon created = addPokemon(form.getName(), form.getType(), form.getHp());
                    view.showMessage("Añadido: " + created);
                    break;
                case DELETE:
                    IdForm idb = view.readIdForm("Id a borrar: ");
                    if (!idb.validate()) {
                        view.showMessage(idb.getErrorMessage());
                        break;
                    }
                    boolean ok = removePokemon(idb.getId());
                    view.showMessage(ok ? "Borrado." : "No encontrado.");
                    break;
                case EXIT:
                    running = false;
                    break;
                default:
                    view.showMessage("Opción no válida");
            }
        }
        view.showMessage("Saliendo. ¡Hasta luego!");
    }

    public Pokedex getModel() {
        return model;
    }
}
