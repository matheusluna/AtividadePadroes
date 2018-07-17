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
public class Slot10Cent extends Slot{
    
    private Slot slot;

    public Slot10Cent() {
        this.slot = new Slot25cent();
    }
        
    @Override
    public void receber(double valor) {
        if(valor == 0.1){
            this.setCont(this.getCont() + 1);
        }else{
            this.slot.receber(valor);
        }
    }

    @Override
    public double finalizar() {
        return 0.1*this.getCont() + this.slot.finalizar();
    }
    
}
