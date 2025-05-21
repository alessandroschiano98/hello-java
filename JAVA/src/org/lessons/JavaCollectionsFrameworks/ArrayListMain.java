package org.lessons.JavaCollectionsFrameworks;

import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args) {
        // ! AGGIUNGO UNA LISTA DI ARRAY;
        ArrayList<String> stringhe = new ArrayList<>();
        // ! USO ADD PER AGGIUNGERE UN ELEMENTO;
        stringhe.add("Alessandro");
        stringhe.add("Gabriele");
        stringhe.add("Francesco");

        // ! STAMPO;
        System.out.println(stringhe);

        // ! USO REMOVE PER RIMUOVERE UN ELEMENTO;
        // ! System.out.println(stringhe.remove("Francesco"));

        // ! USO .GET PER CERCARE TRAMITE IL NUMERO, IL MIO ELEMENTO;
        // !  System.out.println(stringhe.get(1));

        // ! USO .INDEXOF PER CERCARE TRAMITE LA STRINGA, IN CHE POSIZIONE NELL'ARRAY STA;
        // ! System.out.println(stringhe.indexOf("Francesco"));

        

    }

}
