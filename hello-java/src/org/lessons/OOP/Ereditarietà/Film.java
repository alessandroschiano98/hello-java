package org.lessons.OOP.Ereditarietà;

// # definisco una nuova classe chiamata Film
// % che estenda una classe gia' esistente chiamata ContenutoMultimediale
public class Film extends ContenutoMultimediale {
    protected int durata;

    public Film(String titolo, String[] attori, int durata){
        // # invoca il costruttore della mia superclasse
        super(titolo, attori);
        this.durata = durata;
    }

    public int getDurata(){
        return this.durata;
    }
}
