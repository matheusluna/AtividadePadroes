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
public class Slot1Real extends Slot{
        
    @Override
    public void receber(double valor) {
        if(valor == 1){
            this.setCont(this.getCont() + 1);
        }
    }

    @Override
    public double finalizar() {
        return this.getCont();
    }
    
}
