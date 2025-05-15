package org.lessons;

import java.util.Scanner;

// * Dichiarazione di una classe
public class Intro {

    // * sono un metodo che tutti possono vedere = public
    // * sono un metodo che non ritorna nessun elemento all'interno del mio corpo => void 
    // * sono un metodo a cui ci si puo' riferire con il nome main => main
    // * dispongo come parametri di un solo parametro chiamato args, di tipo array di String => String[] args
    // * potenzialmente, se dovessero esserci problemi allora emetterei un evento eccezionale di tipo Exception => throws Exception
    public static void main(String[] args) throws Exception {   
        // int numero = 3; 

        // String parola = "Ciaoo";
        // String parolaDue = "Classe WDPT6";
        
        // System.out.println(parola);
        // System.out.println("Rosso");

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un nome");
        String nome = input.nextLine();        

        System.out.println("Il nome che  hai appena inserito e': " + nome);

        System.out.println("Inserisci il tuo numero preferito");

        // String numeroPreferito = input.nextLine(); 
        String numeroInserito = input.nextLine(); 
        int numeroPreferito = Integer.parseInt(numeroInserito) + 100;

        System.out.println("Il tuo numero preferito e': " + numeroPreferito);
        
        input.close();
    }

    // # public cosaRitorno nomeDelMetodo(Tipo1 argomento1, Tipo2 argomento2, Tipo3 argomento3){}

}
