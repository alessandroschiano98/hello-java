package org.lessons;

public class Stringhe {

    public static void main(String[] args) {

        String parola = "SupercalifragilistichespiralidosO";

        System.out.println(parola);

        parola = parola.toLowerCase();

        // System.out.println(parola);
        // System.out.println(parola.length());
        // System.out.println(parola.toUpperCase());
        String risultatoFormattato = String.format(
                "Questa e' %s la parola e so che e' molto lunga, ovvero %d , ma e' comunque una parola %s", parola,
                parola.length(), parola.toUpperCase());
        System.out.println(risultatoFormattato);

    }

}
