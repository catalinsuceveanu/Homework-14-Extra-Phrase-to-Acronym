package catalin.util;

import org.junit.Assert;
import org.junit.Test;

import static catalin.util.Main.acronymator;

public class acronymatorTest {
    @Test
    public void whenAcronymatorGetsAPhraseWithFirstLettersCapital() {
        final String phrase = "Portable Network Graphics ";
        final String expectedAcronym = "PNG";
        final String actualAcronym = acronymator(phrase);

        Assert.assertEquals(expectedAcronym, actualAcronym);
    }

    @Test
    public void whenAcronymatorGetsAPhraseWithFirstLetterBothCapitalAndNotCapitalAndAMinus() {
        final String phrase = "Complementary metal-oxide semiconductor";
        final String expectedAcronym = "CMOS";
        final String actualAcronym = acronymator(phrase);

        Assert.assertEquals(expectedAcronym, actualAcronym);
    }

    @Test
    public void whenAcronymatorGetsAPhraseWithApostropheInside() {
        final String phrase = "Halley's Comet";
        final String expectedAcronym = "HC";
        final String actualAcronym = acronymator(phrase);

        Assert.assertEquals(expectedAcronym, actualAcronym);
    }

    @Test
    public void whenAcronymatorGetsAPhraseWithAFirstCharNotBeingALetterAndIrregularCharsThroughout() {
        final String phrase = " _- This Is a Test";
        final String expectedAcronym = "TIAT";
        final String actualAcronym = acronymator(phrase);

        Assert.assertEquals(expectedAcronym, actualAcronym);
    }
}
