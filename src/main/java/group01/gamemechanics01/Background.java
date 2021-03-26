/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group01.gamemechanics01;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

/**
 *
 * @author Marcel
 */
public class Background extends JLabel {

    static BufferedImage bg;

    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = bg.createGraphics();

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Background-Spalten
        for (int i = 0; i <= Var.backgroundnumberY; i++) {
            //Background-Zeilen
            for (int ix = 0; ix <= Var.backgroundnumberX; ix++) {
                g2d.drawImage(Var.ib1, Var.backgroundwidth * ix + Var.worldx - Var.labelwidth / 2 + Var.screenwidth / 2,
                        Var.backgroundheight * i + Var.worldy - Var.labelheight / 2 + Var.screenheight / 2, Var.backgroundwidth, Var.backgroundheight, null);
            }
        }
        
        File file = new File("mybg.png");
        try {
            ImageIO.write(bg, "png", file);
        } catch (IOException ex) {
            Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    public Background() {
        Var.backgroundnumberX = Var.labelwidth / Var.backgroundwidth;
        Var.backgroundnumberY = Var.labelheight / Var.backgroundheight;
    }
}
