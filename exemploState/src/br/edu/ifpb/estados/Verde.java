/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.estados;

import br.edu.ifpb.interfaces.EstadoInterface;

/**
 *
 * @author mathe
 */
public class Verde implements EstadoInterface{
    
    private String status = "Verde";

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }      
    
    @Override
    public EstadoInterface trocar() {
        return new Amarelo();
    }
    
}
