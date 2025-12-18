package pokedexProj.view;

import pokedexProj.model.Pokemon;
import pokedexProj.model.Type;

import java.util.List;
import java.util.Scanner;
import pokedexProj.forms.PokemonForm;
import pokedexProj.forms.IdForm;

public class PokedexView implements IPokedexView {
    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("\n--- POKEDEX ---");
        System.out.println("1) Listar Pokemons");
        System.out.println("2) Ver Pokemon por id");
        System.out.println("3) Añadir Pokemon");
        System.out.println("4) Borrar Pokemon por id");
        System.out.println("0) Salir");
        System.out.print("Elige una opción: ");
    }

    public MenuOption readOption() {
        String line = scanner.nextLine().trim();
        return MenuOption.fromString(line);
    }

    public void showList(List<Pokemon> list) {
        System.out.println("\n-- Lista de Pokemons --");
        list.forEach(p -> System.out.println(getFullPokemonString(p)));
    }

    public void showPokemon(Pokemon p) {
        if (p == null) {System.out.println("No encontrado"); return;}

        System.out.println(getFullPokemonString(p));
    }

    public String getFullPokemonString(Pokemon p) {
        String s = "";
        s += "=".repeat(20 - p.getName().length() / 2) + p.getName() + "=".repeat(20 - p.getName().length() / 2 + (p.getName().length() % 2 == 0 ? 0 : 1  )) + "\n";
    
        s += "Tipo: " + (p.getType() == null ? "Desconocido" : p.getType().getLabel()) + "\n";
        s += "HP: " + p.getHp() + "\n";
        return s;
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }

    public String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public int readInt(String prompt) {
        System.out.print(prompt);
        try {
            String line = scanner.nextLine().trim();
            return Integer.parseInt(line);
        } catch (Exception e) {
            System.out.println("Entrada inválida, usando 0");
            return 0;
        }
    }

    public PokemonForm readPokemonForm() {
        String name = readLine("Nombre: ");
        String typeStr = readLine("Tipo: ");
        int hp = readInt("HP: ");
        Type type = Type.fromString(typeStr);
        return new PokemonForm(name, type, hp);
    }

    public IdForm readIdForm(String prompt) {
        int id = readInt(prompt);
        return new IdForm(id);
    }
}
