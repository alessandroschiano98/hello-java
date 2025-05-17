package org.lessons.OOP.ClassiAstratteEInterfacce.classes;

public abstract class OggettoDisegnabile {
    private int dimensione;

    public void fai(){
        System.out.println("Faccio cose disegnabili");
    }

    public abstract void disegna();
}
