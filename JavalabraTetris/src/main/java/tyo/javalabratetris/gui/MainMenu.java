package tyo.javalabratetris.gui;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;



public class MainMenu extends JPanel {
    
    
    public MainMenu(){
        this.setLayout(new GridLayout(4,1));
        
        JPanel paneeli = new JPanel();
        paneeli.setLayout(new GridLayout (4,1));
        
        JButton aloitaPeli = new JButton("Aloita Peli");
        JButton asetukset = new JButton("Asetukset");
        JButton highscore = new JButton ("Highscore -lista");
        JButton lopeta = new JButton ("Lopeta peli");
        
        aloitaPeli.setAlignmentX(Component.CENTER_ALIGNMENT);
        aloitaPeli.setFocusable(false);
        
        asetukset.setAlignmentX(Component.CENTER_ALIGNMENT);
        asetukset.setFocusable(false);
        
        highscore.setAlignmentX(Component.CENTER_ALIGNMENT);
        highscore.setFocusable(false);
        
        lopeta.setAlignmentX(Component.CENTER_ALIGNMENT);
        lopeta.setFocusable(false);
        
        
    }
    
    
}
