/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group01.gamemechanics01;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/**
 *
 * @author Marcel
 */
public class Label extends JLabel {

    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Background-Spalten
        for (int i = 0; i <= Var.backgroundnumberY; i++) {
            //Background-Zeilen
            for (int ix = 0; ix <= Var.backgroundnumberX; ix++) {
                g.drawImage(Var.ib1, Var.backgroundwidth * ix + Var.worldx - Var.labelwidth / 2 + Var.screenwidth / 2, 
                        Var.backgroundheight * i + Var.worldy - Var.labelheight / 2 + Var.screenheight / 2, Var.backgroundwidth, Var.backgroundheight, null);
            }
        }
        
        g.drawImage(Var.tree01, 150 + Var.worldx, 300 + Var.worldy, 241, 57, null);
        
        // Charakter
        g.drawImage(Var.charakter, Var.x - 20, Var.y, 40, 50, null);
        
        g.drawImage(Var.tree02, 150 + Var.worldx, 17 + Var.worldy, 241, 283, null);

        repaint();
    }
}
