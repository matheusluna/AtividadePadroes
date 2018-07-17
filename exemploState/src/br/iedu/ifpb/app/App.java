/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iedu.ifpb.app;

import br.edu.ifpb.semaforo.Semaforo;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mathe
 */
public class App {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        try {
            semaforo.on();
        } catch (InterruptedException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
