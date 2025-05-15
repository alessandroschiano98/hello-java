package org.lessons.OOP.ClassiAstratteEInterfacce.poligoni;

public class Main {
    
    public static void main(String[] args) {
        // ^ Poligono pol = new Poligono(4, "Poligonuzzo");
        Rettangolo rettangolino = new Rettangolo("Rettangolino simpatico", 10, 10);
        System.out.println(rettangolino.calcolaArea());
        System.out.println(rettangolino.calcolaPerimetro());

        Triangolo triangoletto = new Triangolo("Triangolo rettangoloo", 5, 4, 6, 4, 5);
        System.out.println(triangoletto.calcolaArea());
        System.out.println(triangoletto.calcolaPerimetro());
        System.out.println(triangoletto.getNome());
    }
}
