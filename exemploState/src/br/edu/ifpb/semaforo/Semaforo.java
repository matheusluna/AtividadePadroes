/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.semaforo;

import br.edu.ifpb.estados.Amarelo;
import br.edu.ifpb.estados.Vermelho;
import br.edu.ifpb.interfaces.EstadoInterface;

/**
 *
 * @author mathe
 */
public class Semaforo {
    public EstadoInterface estado;

    public Semaforo() {
        this.estado = new Vermelho();
    }
    
    public void on() throws InterruptedException{
        this.estado = new Vermelho();
        while (true) {
            Thread.sleep(500);
            this.estado = estado.trocar();
            status();
        }
    }
    
    public void off(){
        this.estado = new Amarelo();
    }
    
    public void panic(){
        this.estado = new Vermelho();
    }
    
    public void status(){
        System.out.println(estado.getStatus());
    }
    
}
