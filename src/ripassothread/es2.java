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
public class es2 extends Thread {

    private int n;

    public es2(int n) {
        this.n = n;
    }

    public void run() {
        if(n == 2){
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(es2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (;;) {
            RipassoThread.risultato = RipassoThread.risultato + n;
            System.out.println("risultato: "+RipassoThread.risultato);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(es2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}



