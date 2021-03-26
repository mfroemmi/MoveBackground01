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
public class MapBorder {

    Timer mapborder;

    public MapBorder() {

        Var.frameborderup = Var.labelheight / 2 - Var.screenheight / 2;
        Var.frameborderdown = Var.labelheight / 2 + Var.screenheight / 2;
        Var.frameborderleft = Var.labelwidth / 2 - Var.screenwidth / 2;
        Var.frameborderright = Var.labelwidth / 2 + Var.screenwidth / 2;
        
        mapborder = new Timer();
        mapborder.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                //MapBorder Up
                if (Var.up == true) {
                    if (Var.frameborderup - Var.worldy <= 0 || Var.y > Var.screenheight / 2) {  
                        Var.mapborder = true;
                    } else {
                        Var.mapborder = false;
                    }
                }
                //MapBorder Down
                if (Var.down == true) {
                    if (Var.frameborderdown - Var.worldy >= Var.labelheight || Var.y < Var.screenheight / 2) {
                        Var.mapborder = true;
                    } else {
                        Var.mapborder = false;
                    }
                }
                //MapBorder Left
                if (Var.left == true) {
                    if (Var.frameborderleft - Var.worldx <= 0 || Var.x > Var.screenwidth / 2) {
                        Var.mapborder = true;
                    } else {
                        Var.mapborder = false;
                    }
                }
                //MapBorder Right
                if (Var.right == true) {
                    if (Var.frameborderright - Var.worldx >= Var.labelwidth || Var.x < Var.screenwidth / 2) {
                        Var.mapborder = true;
                    } else {
                        Var.mapborder = false;
                    }
                }

            }

        }, 0, 10);

    }

}
