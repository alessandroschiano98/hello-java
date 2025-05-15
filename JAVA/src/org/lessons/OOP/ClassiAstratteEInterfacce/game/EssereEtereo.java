package org.lessons.OOP.ClassiAstratteEInterfacce.game;

public class EssereEtereo extends Elemento implements Sbloccabile{
    private int puntiLuce;

    public EssereEtereo(String nome, double posX, double posY, float rotation, int puntiLuce) {
        super(nome, posX, posY, rotation);
        this.puntiLuce = puntiLuce;
    }


    public int getPuntiLuce() {
        return this.puntiLuce;
    }

    public void setPuntiLuce(int puntiLuce) {
        this.puntiLuce = puntiLuce;
    }    

    
    @Override
    public void sblocca() {
        System.out.println("Mi hai sbloccato perché hai giocato per più di tre ore");
    }

}
