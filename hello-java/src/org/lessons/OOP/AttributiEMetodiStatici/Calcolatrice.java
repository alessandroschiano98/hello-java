package org.lessons.OOP.AttributiEMetodiStatici;

public class Calcolatrice {

    // SERVE A DARE UN RANGE MASSIMO
    public static int valoreMassimoConsentito = Integer.MAX_VALUE;

    public static int somma(int addendo, int addizionando) {
        return addendo + addizionando;
    }

    public static int sottrazione(int sottraendo, int diminuendo) {
        return sottraendo - diminuendo;
    }

    public static int comparazione(int comparando, int comparato){
        if (comparando < comparato){
            return comparando;
        } else {
            return comparato;
        }
    }

}
