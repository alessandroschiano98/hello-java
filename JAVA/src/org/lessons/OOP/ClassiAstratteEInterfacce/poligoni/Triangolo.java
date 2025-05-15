package org.lessons.OOP.ClassiAstratteEInterfacce.poligoni;

public class Triangolo extends Poligono {
    private double primoLato;
    private double secondoLato;
    private double terzoLato;
    private double base;
    private double altezza;

    public Triangolo(String nome, double primoLato, double secondoLato, double terzoLato, double base, double altezza) {
        super(3, nome);
        this.primoLato = primoLato;
        this.secondoLato = secondoLato;
        this.terzoLato = terzoLato;
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return this.primoLato + this.secondoLato + this.terzoLato;

    }

    @Override
    public double calcolaArea() {
        return (this.altezza *this.base) / 2;

    }

}
