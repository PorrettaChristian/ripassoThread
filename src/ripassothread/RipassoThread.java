/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ripassothread;

import java.util.Scanner;

/**
 *
 * @author porretta.christian
 */
public class RipassoThread {
    public static int risultato;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v = 0;
        Scanner sc = new Scanner (System.in);
//        es1 t1 = new es1("bello");
//        es1 t2 = new es1("brutto");
//        t1.start();
//        t2.start();
        risultato = 0;
        es2 t1 = new es2 (1); 
        es2 t2 = new es2 (2);
        t1.start();
        t2.start();
        
    }
    
}
