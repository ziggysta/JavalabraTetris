package tyo.javalabratetris.logiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.Color;
import org.junit.Assert;
import tyo.javalabratetris.logiikka.Kentta;
import tyo.javalabratetris.logiikka.Palikat;

/**
 *
 * @author John
 */
public class PalikatTest {

    Palikat palikat;

//    public PalikatTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
    @Before
    public void setUp() {
        palikat = new Palikat();
    }
//    
//    @After
//    public void tearDown() {
//    }

    @Test
    public void valitunPalanVariOikein() {
        palikat.valitsePala(1);
        assertEquals(palikat.getValitunPalanVari(), Color.yellow);

    }

    @Test
    public void valitunPalanMuotoOikein() {
        palikat.valitsePala(1);
        Assert.assertArrayEquals(palikat.getValittuPala(), palikat.jpala);
    }

}
