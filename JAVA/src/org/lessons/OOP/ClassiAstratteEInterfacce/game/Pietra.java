package org.lessons.OOP.ClassiAstratteEInterfacce.game;

public class Pietra extends Elemento{
    private float peso;


    public Pietra(String nome, double posX, double posY, float rotation, float peso) {
        super(nome, posX, posY, rotation);
        this.peso = peso;
    }


    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
