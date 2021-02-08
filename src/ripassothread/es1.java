/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ripassothread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author porretta.christian
 */
public class es1 extends Thread {

    String s;

    public es1(String s) {
        this.s = s;
    }

    public void run() {
        try {
            if (s.equals("bello")) {
                this.sleep(500);
            }
            for (int i = 0;; i++) {
                System.out.println(" " + s + " " + i);
                this.sleep(1000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(es1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
