package org.lessons.OOP.AttributiEMetodiStatici;

public class Veicolo {
   // public static int numeroRuote = 4;
    public static final int numeroRuote = 4; // quando è final non si può più cambiare, è una costante.
    private String nome; /* 1 per istanza */

    public Veicolo(String nome) {
        this.nome = nome;
    }

    public String dammiNome() {
        return this.nome;
    }

    public static int dammiNumeroRuote() {
        return numeroRuote;
    }

    @Override
    public String toString(){
        return " ";
    }

}
