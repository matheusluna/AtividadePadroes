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
public class Slot1Cent extends Slot{
    
    private Slot slot;

    public Slot1Cent() {
        this.slot = new Slot5Cent();
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }
    
    @Override
    public void receber(double valor){
        if(valor == 0.01){
            this.setCont(this.getCont() + 1);
        }else{
            this.slot.receber(valor);
        }
    }

    @Override
    public double finalizar() {
        return 0.01*this.getCont() + this.slot.finalizar();
    }
    
}
