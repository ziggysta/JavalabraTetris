package tyo.javalabratetris;

import java.util.*;

public class Kentta {

    public static int korkeus;
    public static int leveys;
    public static boolean[][] kentta;

    public Kentta() {
        this.korkeus = 16;
        this.leveys = 10;
        this.kentta = new boolean[16][10];
        nollaaKentta();
    }

    public static void nollaaKentta() {
        for (int i = 0; i < korkeus; i++) {
            for (int j = 0; j < leveys; j++) {
                kentta[i][j] = false;
            }
        }
    }

    public void tuhoaRivi(int lahtoKorkeus) {
        for (int i = 0; i < leveys; i++) {
            kentta[lahtoKorkeus][i] = false;
        }

    }

    public boolean tarkistaRivi(int korkeus) {
        for (int i = 0; i < leveys; i++) {
            if (kentta[korkeus][i] == false) {
                return false;
            }
        }
        return true;
    }

    public void setLaattaTrue(int a, int b) {
        kentta[a][b] = true;
    }
    
    public void setLaattaFalse(int a, int b) {
        kentta[a][b] = false;
    }

    public boolean getLaattaBoolean(int a, int b) {
        return kentta[a][b];
    }
    
    public int getKorkeus() {
        return korkeus;
    }
    
    public int getLeveys() {
        return leveys;
    }
}

