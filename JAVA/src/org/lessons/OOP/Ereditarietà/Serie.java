package org.lessons.OOP.Ereditarietà;

public class Serie extends ContenutoMultimediale {
    protected int numeroDiEpisodi;

    public Serie(String titolo, String[] attori, int numeroDiEpisodi){
        // # invoca il costruttore della mia superclasse
        super(titolo, attori);
        this.numeroDiEpisodi = numeroDiEpisodi;
    }

    public int getNumeroDiEpisodi(){
        return this.numeroDiEpisodi;
    }

}
