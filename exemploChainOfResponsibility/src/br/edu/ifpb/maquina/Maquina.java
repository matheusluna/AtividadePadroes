/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.maquina;

import br.edu.ifpb.slots.Slot;
import br.edu.ifpb.slots.Slot1Cent;

/**
 *
 * @author mathe
 */
public class Maquina {
    private Slot slot;

    public Maquina() {
        this.slot = new Slot1Cent();
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }
    
    public void abastecer(double valor){
        this.slot.receber(valor);
    }
    
    public void receber(double valor){
        double moedasColetadas = slot.finalizar();
        
        if(moedasColetadas == valor){
            System.out.println("Produto entregue!");
        }else{
            System.out.println("Valor incompatível com o produto!");
        }
    }
}
