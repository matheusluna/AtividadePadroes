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
public class Slot50Cent extends Slot{
    
    private Slot slot;

    public Slot50Cent() {
        this.slot = new Slot1Real();
    }
       
    @Override
    public void receber(double valor) {
        if(valor == 0.5){
            this.setCont(this.getCont() + 1);
        }else{
            this.slot.receber(valor);
        }
    }

    @Override
    public double finalizar() {
        return 0.5*this.getCont() + this.slot.finalizar();
    }
    
}
