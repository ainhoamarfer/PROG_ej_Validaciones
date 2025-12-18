package pokedexProj.forms;

/**
 * Interfaz para validadores de formularios.
 *
 * Las implementaciones encapsulan la lógica de validación y proporcionan un
 * mensaje de error legible si la validación falla.
 */
public interface FormValidator {

    /**
     * Realiza la validación del formulario.
     *
     * @return {@code true} si el formulario es válido, {@code false} en caso contrario
     */
    boolean validate();

    /**
     * Si la última validación falló, devuelve un mensaje de error corto y
     * apto para mostrar al usuario. Si no hay errores devuelve {@code null}.
     *
     * @return mensaje de error o {@code null} si no hay error
     */
    String getErrorMessage();
}
