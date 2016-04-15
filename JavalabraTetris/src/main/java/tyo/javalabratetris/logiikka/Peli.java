package tyo.javalabratetris.logiikka;

import tyo.javalabratetris.logiikka.Kentta;
import tyo.javalabratetris.logiikka.Palikat;

import java.awt.Color;

public class Peli {

    Kentta kentta = new Kentta();
    Palikat palikat = new Palikat();

    private boolean[][] putoavaPalikka;
    private Color putoavanPalikanVari;
    private int putoavaPalikkaX;
    private int putoavaPalikkaY;
    private int putoavaPalikkaLeveys;
    private int putoavaPalikkaKorkeus;

    public void uusiPutoavaPala() {

        palikat.satunnainenPala();
        this.putoavaPalikka = palikat.getValittuPala();
        this.putoavanPalikanVari = palikat.getValitunPalanVari();
        this.putoavaPalikkaLeveys = this.putoavaPalikka.length;
        this.putoavaPalikkaKorkeus = this.putoavaPalikka[0].length;
        this.putoavaPalikkaY = 0;
        this.putoavaPalikkaX = kentta.getLeveys() / 2 - this.putoavaPalikkaKorkeus / 2;

    }

    public void kaannaPalaa() {

        int vanhaKorkeus;
        boolean[][] vanhaPalikka = this.putoavaPalikka;
        int vanhaPalikkaRivi = this.putoavaPalikkaX;
        int vanhaPalikkaKorkeus = this.putoavaPalikkaY;
        int vanhaRivi = this.putoavaPalikkaLeveys;
        this.putoavaPalikkaX = vanhaKorkeus = this.putoavaPalikkaLeveys;
        this.putoavaPalikkaY = vanhaRivi;
        this.putoavaPalikkaX -= (vanhaKorkeus - vanhaRivi) / 2;
        this.putoavaPalikkaY -= (vanhaRivi - vanhaKorkeus) / 2;
        this.putoavaPalikka = new boolean[vanhaKorkeus][vanhaRivi];
        for (int vRivi = 0; vRivi < vanhaRivi; ++vRivi) {
            for (int vKork = 0; vKork < vanhaKorkeus; ++vKork) {
                int uusiKorkeus = vanhaKorkeus - 1 - vKork;
                int uusiRivi = vRivi;
                this.putoavaPalikka[uusiKorkeus][uusiRivi] = vanhaPalikka[vRivi][vKork];
            }

        }

        if (!this.putoavaPalikkaOnSallittu()) {
            this.putoavaPalikkaX = vanhaPalikkaRivi;
            this.putoavaPalikkaY = vanhaPalikkaKorkeus;
            this.putoavaPalikkaLeveys = vanhaRivi;
            this.putoavaPalikkaKorkeus = vanhaKorkeus;
            this.putoavaPalikka = vanhaPalikka;
        }
    }

    public boolean liikutaPalaaAlas(int aRivi, int aKorkeus) {
        this.putoavaPalikkaX += aRivi;
        this.putoavaPalikkaY += aKorkeus;
        boolean sallittu = this.putoavaPalikkaOnSallittu();
        if (!sallittu) {
            this.putoavaPalikkaX -= aRivi;
            this.putoavaPalikkaY -= aKorkeus;
        }
        return sallittu;
    }

    public boolean putoavaPalikkaOnSallittu() {
        for (int rivi = 0; rivi < this.putoavaPalikkaLeveys; ++rivi) {
            for (int korkeus = 0; korkeus < this.putoavaPalikkaKorkeus; ++korkeus) {
                if (rivi + this.putoavaPalikkaX >= 0 && rivi + this.putoavaPalikkaX < kentta.getLeveys() && korkeus + this.putoavaPalikkaY >= 0 && korkeus + this.putoavaPalikkaY < kentta.getKorkeus()) {
                    continue;
                }
                return false;
            }
        }
        return true;
    }

}
