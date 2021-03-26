/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group01.gamemechanics01;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author Marcel
 */
public class Var {
    
    static JFrame jf1;
    static int screenheight = 600, screenwidth = 800, labelwidth = 1920, labelheight = 1080;
    static int backgroundnumberX, backgroundnumberY, backgroundheight = 32, backgroundwidth = 32;
    static int x = Var.screenwidth / 2, y = Var.screenheight / 2;
    static int worldx = 0, worldy = 0;
    static int frameborderup, frameborderdown, frameborderleft, frameborderright;
    
    static int movespeed = 2, movedown = 0, moveleft = 0, moveright = 0, moveup = 0;
    
    static boolean down = false, left = false, right = false, up = false; 
    static boolean hitbox = false;
    static boolean mapborder;
    
    static Label lbl1;
    
    static BufferedImage ib1;
    static BufferedImage charakter, charakterdown01, charakterdown02, charakterdown03, 
            charakterleft01, charakterleft02, charakterleft03, 
            charakterright01, charakterright02, charakterright03,
            charakterup01, charakterup02, charakterup03;
    static BufferedImage tree01, tree02;
    
    public Var() {
            
        try {
                
            // Background
            ib1 = ImageIO.read(new File("rsc/bg01.png"));
            
            // Charakter
            charakter = ImageIO.read(new File("rsc/down01.png"));
            charakterdown01 = ImageIO.read(new File("rsc/down01.png"));
            charakterdown02 = ImageIO.read(new File("rsc/down02.png"));
            charakterdown03 = ImageIO.read(new File("rsc/down03.png"));
            charakterleft01 = ImageIO.read(new File("rsc/left01.png"));
            charakterleft02 = ImageIO.read(new File("rsc/left02.png"));
            charakterleft03 = ImageIO.read(new File("rsc/left03.png"));
            charakterright01 = ImageIO.read(new File("rsc/right01.png"));
            charakterright02 = ImageIO.read(new File("rsc/right02.png"));
            charakterright03 = ImageIO.read(new File("rsc/right03.png"));
            charakterup01 = ImageIO.read(new File("rsc/up01.png"));
            charakterup02 = ImageIO.read(new File("rsc/up02.png"));
            charakterup03 = ImageIO.read(new File("rsc/up03.png"));
            
            // Baum
            tree01 = ImageIO.read(new File("rsc/tree01.png"));
            tree02 = ImageIO.read(new File("rsc/tree02.png"));
            
        } catch (IOException e) {

            e.printStackTrace();
            System.out.println("Bilder konnten nicht geladen werden!");

        }
        
    }
    
}
