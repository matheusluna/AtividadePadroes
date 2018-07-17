/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.forum;

import br.edu.ifpb.notificadores.Email;
import br.edu.ifpb.notificadores.Notification;
import br.edu.ifpb.notificadores.Sms;

/**
 *
 * @author mathe
 */
public class Forum {
    public static void main(String[] args) {
        Topico topico = new Topico("Linux");
        Email email = new Email();
        Email email2 = new Email();
        Email email3 = new Email();
        Sms sms = new Sms();
        Sms sms2 = new Sms();
        Notification notification = new Notification();
        Notification notification2 = new Notification();
        
        topico.adicionar(email);
        topico.adicionar(email2);
        topico.adicionar(email3);
        topico.adicionar(sms);
        topico.adicionar(sms2);
        topico.adicionar(notification);
        topico.adicionar(notification2);
        
        topico.atualizar();
        
        
    }
}
