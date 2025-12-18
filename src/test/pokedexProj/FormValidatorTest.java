package test.pokedexProj;

import org.junit.Test;
import pokedexProj.forms.IdForm;

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

    }
}
