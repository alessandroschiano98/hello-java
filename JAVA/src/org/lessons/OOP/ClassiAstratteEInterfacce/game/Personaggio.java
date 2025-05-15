package org.lessons.OOP.ClassiAstratteEInterfacce.game;

public class Personaggio extends Elemento implements Sbloccabile{
    private int puntiDifesa;


    public Personaggio(String nome, double posX, double posY, float rotation, int puntiDifesa) {
        super(nome, posX, posY, rotation);
        this.puntiDifesa = puntiDifesa;
    }
    

    public int getPuntiDifesa() {
        return this.puntiDifesa;
    }

    public void setPuntiDifesa(int puntiDifesa) {
        this.puntiDifesa = puntiDifesa;
    }

    @Override
    public void sblocca() {
        System.out.println("Mi hai sbloccato perché hai raggiunto questo livello di punti");
    }

}