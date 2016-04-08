package tyo.javalabratetris;

import java.awt.Color;
import java.util.Random;

public class Palikat {

    public boolean[][] pala;
    public Color palanVari;

    public Palikat() {
        this.pala = tyhjapala;
        this.palanVari = Color.black;
    }

    private Random random = new Random();

    public final boolean[][] ipala = {
        {true, true, true, true}
    };

    public final boolean[][] jpala = {
        {true, false, false},
        {true, true, true}
    };

    public final boolean[][] lpala = {
        {false, false, true},
        {true, true, true}
    };

    public final boolean[][] opala = {
        {true, true},
        {true, true}
    };

    public final boolean[][] spala = {
        {false, true, true},
        {true, true, false}
    };

    public final boolean[][] tpala = {
        {false, true, false},
        {true, true, true}
    };

    public final boolean[][] zpala = {
        {true, true, false},
        {false, true, true}
    };

    public final boolean[][] tyhjapala = {{false}};

    private boolean[][][] tetrispalaset = new boolean[][][]{ipala, jpala, lpala, opala, spala, tpala, zpala};

    private Color[] tetrisvarit = new Color[]{Color.red, Color.yellow, Color.magenta, Color.blue, Color.cyan, Color.green, Color.orange};

    public void satunnainenPala() {
        int indeksi = this.random.nextInt(tetrispalaset.length);
        this.pala = tetrispalaset[indeksi];
        this.palanVari = tetrisvarit[indeksi];
    }

    public void valitsePala(int luku) {
        if (luku < 6 && luku >= 0) {
            this.pala = tetrispalaset[luku];
            this.palanVari = tetrisvarit[luku];
        }

    }

    public Color getTietynPalanVari(int luku) {
        return tetrisvarit[luku];
    }

    public boolean[][] getTeittyPala(int luku) {
        return tetrispalaset[luku];
    }

    public Color getValitunPalanVari() {
        return this.palanVari;
    }

    public boolean[][] getValittuPala() {
        return this.pala;
    }

}
