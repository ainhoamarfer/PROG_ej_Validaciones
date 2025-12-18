package test.pokedexProj;

import org.junit.Test;
import pokedexProj.forms.IdForm;
import pokedexProj.forms.PokemonForm;
import pokedexProj.model.Type;

import static org.junit.Assert.*;

public class FormValidatorTest {

    @Test
    public void idFormValidAndInvalid() {
        IdForm good = new IdForm(3);

        assertTrue(good.validate());
        assertNull(good.getErrorMessage());

        IdForm bad = new IdForm(-1);
        assertFalse(bad.validate());
        assertNotNull(bad.getErrorMessage());
    }

    @Test
    public void pokemonFormTest() {
        PokemonForm good = new PokemonForm("Pikachu", Type.ELECTRIC, 100);

        assertTrue(good.validate());
        assertNull(good.getErrorMessage());

        PokemonForm noName = new PokemonForm("", Type.ELECTRIC, 100);
        assertFalse(noName.validate());
        assertEquals("Nombre vacío", noName.getErrorMessage());

        PokemonForm noType = new PokemonForm("Pikachu", null, 100);
        assertFalse(noType.validate());
        assertEquals("Tipo no valido", noType.getErrorMessage());

        PokemonForm noTypeUnknow = new PokemonForm("Pikachu", Type.UNKNOWN, 100);
        assertFalse(noTypeUnknow.validate());
        assertEquals("Tipo no valido", noTypeUnknow.getErrorMessage());

        PokemonForm noHp = new PokemonForm("Pikachu", Type.ELECTRIC, -100);
        assertFalse(noHp.validate());
        assertEquals("Vida no valida", noHp.getErrorMessage());

        PokemonForm HpTo0 = new PokemonForm("Pikachu", Type.ELECTRIC, 0);
        assertFalse(HpTo0.validate());
        assertEquals("Vida no valida", HpTo0.getErrorMessage());
    }
}
