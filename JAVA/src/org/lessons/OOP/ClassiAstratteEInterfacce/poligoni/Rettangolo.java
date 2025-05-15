package org.lessons.OOP.ClassiAstratteEInterfacce.poligoni;

public class Rettangolo extends Poligono {
    private double base;
    private double altezza;

    public Rettangolo(String nome, double base, double altezza) {
        super(4, nome);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return this.base + this.altezza;
    }

    @Override
    public double calcolaArea() {
        return this.base * this.altezza;
    }
    
}
