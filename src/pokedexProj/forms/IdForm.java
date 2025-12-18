package pokedexProj.forms;

public class IdForm implements FormValidator {
    private final int id;
    private String error;

    public IdForm(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean validate() {
        if (id <= 0) {
            error = "Id debe ser mayor que 0";
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

