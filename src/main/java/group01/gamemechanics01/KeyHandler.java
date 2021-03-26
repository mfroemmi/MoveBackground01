/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group01.gamemechanics01;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Marcel
 */
public class KeyHandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Var.up = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Var.down = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Var.left = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Var.right = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Var.up = false;
            if (Var.hitbox == true) {
                Var.worldy -= 2; // Verhindert das Festglitchen
            }
            Var.charakter = Var.charakterup01;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Var.down = false;
            if (Var.hitbox == true) {
                Var.worldy += 2;
            }
            Var.charakter = Var.charakterdown01;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Var.left = false;
            if (Var.hitbox == true) {
                Var.worldx -= 2;
            }
            Var.charakter = Var.charakterleft01;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Var.right = false;
            if (Var.hitbox == true) {
                Var.worldx += 2;
            }
            Var.charakter = Var.charakterright01;
        }

    }

}
