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
public class CharakterMovement {

    Timer movement;

    public CharakterMovement() {

        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (Var.up == true) {
                    if (Var.hitbox == false) {
                        if (Var.mapborder == true) {
                            Var.y -= Var.movespeed;

                            Var.left = false;
                            Var.right = false;
                            Var.down = false;
                        } else {
                            Var.worldy += Var.movespeed;

                            Var.left = false;
                            Var.right = false;
                            Var.down = false;
                        }

                    }
                }

                if (Var.down == true) {
                    if (Var.hitbox == false) {
                        if (Var.mapborder == true) {
                            Var.y += Var.movespeed;

                            Var.left = false;
                            Var.right = false;
                            Var.up = false;
                        } else {
                            Var.worldy -= Var.movespeed;

                            Var.left = false;
                            Var.right = false;
                            Var.up = false;
                        }

                    }
                }

                if (Var.left == true) {
                    if (Var.hitbox == false) {
                        if (Var.mapborder == true) {
                            Var.x -= Var.movespeed;

                            Var.up = false;
                            Var.right = false;
                            Var.down = false;
                        } else {
                            Var.worldx += Var.movespeed;

                            Var.up = false;
                            Var.right = false;
                            Var.down = false;
                        }
                    }
                }

                if (Var.right == true) {
                    if (Var.hitbox == false) {
                        if (Var.mapborder == true) {
                            Var.x += Var.movespeed;

                            Var.left = false;
                            Var.up = false;
                            Var.down = false;
                        } else {
                            Var.worldx -= Var.movespeed;

                            Var.left = false;
                            Var.up = false;
                            Var.down = false;
                        }
                    }
                }

            }

        }, 0, 10);

    }

}
