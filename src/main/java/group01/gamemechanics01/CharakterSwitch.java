/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group01.gamemechanics01;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Marcel
 */
public class CharakterSwitch {

    Timer movement;

    public CharakterSwitch() {

        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (Var.up == true) {

                    if (Var.moveup == 0) {
                        Var.charakter = Var.charakterup02;
                        Var.moveup++;
                    } else if (Var.moveup == 1) {
                        Var.charakter = Var.charakterup03;
                        Var.moveup--;
                    }

                }

                if (Var.down == true) {

                    if (Var.movedown == 0) {
                        Var.charakter = Var.charakterdown02;
                        Var.movedown++;
                    } else if (Var.movedown == 1) {
                        Var.charakter = Var.charakterdown03;
                        Var.movedown--;
                    }

                }

                if (Var.left == true) {

                    if (Var.moveleft == 0) {
                        Var.charakter = Var.charakterleft02;
                        Var.moveleft++;
                    } else if (Var.moveleft == 1) {
                        Var.charakter = Var.charakterleft03;
                        Var.moveleft--;
                    } 

                }

                if (Var.right == true) {

                    if (Var.moveright == 0) {
                        Var.charakter = Var.charakterright02;
                        Var.moveright++;
                    } else if (Var.moveright == 1) {
                        Var.charakter = Var.charakterright03;
                        Var.moveright--;
                    } 

                }

            }

        }, 0, 200);

    }

}
