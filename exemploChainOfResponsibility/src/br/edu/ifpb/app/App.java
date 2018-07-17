/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.app;

import br.edu.ifpb.maquina.Maquina;

/**
 *
 * @author mathe
 */
public class App {
    public static void main(String[] args) {
        Maquina maquina = new Maquina();
        maquina.abastecer(0.50);
        maquina.abastecer(0.50);
        maquina.abastecer(0.50);
        maquina.abastecer(0.50);
        maquina.abastecer(0.50);
        maquina.receber(2.0);
        
    }
}
