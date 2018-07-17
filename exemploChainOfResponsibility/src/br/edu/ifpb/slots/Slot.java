/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.slots;

/**
 *
 * @author mathe
 */
public abstract class Slot {
    
    private int cont = 0;

    public Slot() {
    }

    public int getCont() {
        return cont;
    }

    public void setCont(double cont) {
        this.cont = (int) cont;
    }
    
    public abstract void receber(double valor);
    
    public abstract double finalizar();
}
