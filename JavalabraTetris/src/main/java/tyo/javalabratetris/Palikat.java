package tyo.javalabratetris;

import java.awt.Color;
import java.util.Random;

public class Palikat {
    public boolean[][] pala;
    public Color palanVari;
    
    public Palikat() {
           this.pala = TYHJAPALA;
           this.palanVari = Color.black;
    }

    private Random random = new Random();
    

    public final boolean[][] IPALA = {
        {true, true, true, true}
    };

    public final boolean[][] JPALA = {
        {true, false, false},
        {true, true, true}
    };

    public final boolean[][] LPALA = {
        {false, false, true},
        {true, true, true}
    };

    public final boolean[][] OPALA = {
        {true, true},
        {true, true}
    };

    public final boolean[][] SPALA = {
        {false, true, true},
        {true, true, false}
    };

    public final boolean[][] TPALA = {
        {false, true, false},
        {true, true, true}
    };

    public final boolean[][] ZPALA = {
        {true, true, false},
        {false, true, true}
    };
    
    public final boolean [][] TYHJAPALA = { {false} };
    
    private boolean[][][] TETRISPALASET = new boolean[][][]{IPALA, JPALA, LPALA, OPALA, SPALA, TPALA, ZPALA};

    private Color[] TETRISVARIT = new Color[]{Color.red, Color.yellow, Color.magenta, Color.blue, Color.cyan, Color.green, Color.orange};

    public void satunnainenPala() {
        int indeksi = this.random.nextInt(TETRISPALASET.length);
        this.pala = TETRISPALASET[indeksi];
        this.palanVari = TETRISVARIT[indeksi];
    }

    public void valitsePala(int luku) {
        if (luku < 6 && luku >= 0) {
            this.pala = TETRISPALASET[luku];
            this.palanVari = TETRISVARIT[luku];
        }

    }
    
    public Color getTietynPalanVari(int luku) {
        return TETRISVARIT[luku];
    }

    public boolean[][] getTeittyPala(int luku) {
        return TETRISPALASET[luku];
    }

    public Color getValitunPalanVari() {
        return this.palanVari;
    }

    public boolean[][] getValittuPala() {
        return this.pala;
    }
    
    

}
