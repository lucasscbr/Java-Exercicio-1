/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primeironome;

import java.util.Scanner;

public class Main {

    /*Aparentemente métodos em java começam com letra minúscula.
    //Java tb n têm ref '-'
    public void primeiroNome(ref String nome) {	
	}
    */
public static String primeiroNome(String nome) {
    if (nome.indexOf(" ") != -1)
            {
                nome = nome.substring(0, nome.indexOf(" "));
                return nome;
            }
            else    
	return nome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeCompleto;
        
        System.out.println("Digite um nome completo: ");
        nomeCompleto = sc.nextLine().trim();        
        
        System.out.printf("O primeiro nome é: %s",primeiroNome(nomeCompleto));
    }
    
}
