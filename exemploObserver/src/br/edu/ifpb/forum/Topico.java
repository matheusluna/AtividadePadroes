/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.forum;

import br.edu.ifpb.interfaces.ObserversInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class Topico {
    private String Titulo;
    private List<ObserversInterface> observadores = new ArrayList<>();

    public Topico(String Titulo) {
        this.Titulo = Titulo;
    }
    
    public void adicionar(ObserversInterface obs){
        observadores.add(obs);
    }
    
    public void remove(ObserversInterface obs){
        observadores.remove(obs);
    }
    
    public void atualizar(){
        for(ObserversInterface o : observadores){
            o.notifique();
        }
    }
}
