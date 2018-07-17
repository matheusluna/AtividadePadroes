/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.notificadores;

import br.edu.ifpb.interfaces.ObserversInterface;

/**
 *
 * @author mathe
 */
public class Notification implements ObserversInterface{

    @Override
    public void notifique() {
        System.out.println("Notification notificado");
    }
    
}
