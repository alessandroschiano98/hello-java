package org.lessons.OOP.ClassiAstratteEInterfacce.poligoni;

public abstract class Poligono {

    private int numeroLati;
    private String nome;

    public Poligono(int numeroLati, String nome){
        this.numeroLati = numeroLati;
        this.nome = nome;
    }

    public int getNumeroLati(){
        return this.numeroLati;
    }

    public void setNumeroLati(int numeroLati){
        this.numeroLati = numeroLati;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome (String nome){
        this.nome = nome;

    }
    
    public abstract double calcolaPerimetro();

    public abstract double calcolaArea();

}
