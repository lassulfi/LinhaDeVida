/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linhadevida.main;

import com.linhadevida.telas.TelaPrincipal;

/**
 *Classe do método principal - chamada da tela principal
 * @author luis.assulfi
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Teste do sistema");
        System.out.println("Iniciando a aplicacao");
        
        new TelaPrincipal().setVisible(true);
        
    }
    
}
