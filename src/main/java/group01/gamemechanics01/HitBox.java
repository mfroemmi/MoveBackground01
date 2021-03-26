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
public class HitBox {

    Timer hitbox;

    public HitBox() {

        hitbox = new Timer();
        hitbox.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                
                //Baum
                if (Var.y < 320 + Var.worldy && Var.y > 250 + Var.worldy &&
                        Var.x > 220 + Var.worldx && Var.x < 315 + Var.worldx) {
                    Var.hitbox = true;
                } else {
                    Var.hitbox = false;
                }
                
            }

        }, 0, 10);

    }

}
