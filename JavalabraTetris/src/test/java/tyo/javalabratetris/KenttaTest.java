package tyo.javalabratetris;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tyo.javalabratetris.Kentta;
import static tyo.javalabratetris.Kentta.korkeus;
import static tyo.javalabratetris.Kentta.leveys;
import java.util.Random;

public class KenttaTest {

    Kentta kentta;

    Random random = new Random();

    private static final int testiKorkeus = 16;
    private static final int testiLeveys = 10;

    @Before
    public void setUp() {
        kentta = new Kentta();
    }

    @Test
    public void korkeusJaLeveysOvatOikein() {
        int y = testiKorkeus - 1;
        int x = testiLeveys - 1;
        kentta.setLaattaTrue(y, x);
        kentta.setLaattaTrue(0, 0);
        assertTrue(kentta.getLaattaBoolean(y, x));
        assertTrue(kentta.getLaattaBoolean(0, 0));
    }

    @Test
    public void kentanNollaajaToimii() {
        kentta.nollaaKentta();
        for (int i = 0; i < testiKorkeus; i++) {
            for (int j = 0; j < testiLeveys; j++) {
                assertFalse(kentta.getLaattaBoolean(i, j));
            }
        }
    }

    @Test
    public void laattaSetteriToimii() {
        kentta.nollaaKentta();
        kentta.setLaattaTrue(2, 3);
        assertTrue(kentta.getLaattaBoolean(2, 3));
    }

    @Test
    public void rivinTarkistajaToimiiKunRiviOnKokonaanTrue() {
        kentta.nollaaKentta();
        int satunnainenRivi = random.nextInt(testiKorkeus - 1);
        for (int i = 0; i < testiLeveys; i++) {
            kentta.setLaattaTrue(0, i);
        }
        assertTrue(kentta.tarkistaRivi(0));
    }

    @Test
    public void rivinTarkistajaToimiiKunRiviOnKokonaanFalse() {
        kentta.nollaaKentta();
        assertFalse(kentta.tarkistaRivi(0));
    }

    @Test
    public void rivinTarkistajaToimiiKunRivinLopussaOnFalse() {
        kentta.nollaaKentta();
        for (int i = 0; i < testiLeveys - 1; i++) {
            kentta.setLaattaTrue(0, i);
        }
        assertFalse(kentta.tarkistaRivi(0));
    }

    @Test
    public void rivinTuhoojaToimii() {
        kentta.nollaaKentta();
        int satunnainenRivi = random.nextInt(testiKorkeus - 1);
        for (int i = 0; i < testiLeveys; i++) {
            kentta.setLaattaTrue(satunnainenRivi, i);
        }
        kentta.tuhoaRivi(satunnainenRivi);
        for (int i = 0; i < testiLeveys; i++) {
            assertFalse(kentta.getLaattaBoolean(satunnainenRivi, i));
        }

    }

    @Test
    public void asettaaLaattaVapaaksi() {
        kentta.nollaaKentta();
        kentta.setLaattaTrue(3, 5);
        kentta.setLaattaFalse(3, 5);

        assertEquals(kentta.getLaattaBoolean(3, 5), false);
    }

}
