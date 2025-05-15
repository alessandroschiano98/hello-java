package org.lessons.OOP.AttributiEMetodiStatici;

public class Main {
    public static void main(String[] args) {

        Veicolo macchina = new Veicolo("Macchina rossa");
        Veicolo aeroplanino = new Veicolo("Aeroplanino telecomandato");

        Veicolo.numeroRuote = 4;
        System.out.println(macchina.dammiNome());
        System.out.println(aeroplanino.dammiNome());

        System.out.println(Veicolo.numeroRuote);
        System.out.println(aeroplanino.numeroRuote);
        System.out.println(macchina.numeroRuote);


        // CALCOLATRICE
        System.out.println(Calcolatrice.valoreMassimoConsentito); // RANGE MASSIMO, COSI' SE INSERISCONO UN NUMERO FUORI RANGE DA ERRORE;
        System.out.println(Calcolatrice.somma(5, 7));
        System.out.println(Calcolatrice.sottrazione(5, 7));
        System.out.println(Calcolatrice.comparazione(2, 5));

    }

}
