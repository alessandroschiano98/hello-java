package org.lessons.JavaCollectionsFrameworks;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {

        Set<String> invitati = new HashSet<>();
        invitati.add("Alessandro");
        invitati.add("Gabriele");
        invitati.add("Francesco");

        // ! NON CONTA L'ORDINE IN UN SET, NON POSSO AVERE DUPLICATI;
        // ! System.out.println(invitati.remove("Gabriele")); ---> COME TUTTI GLI ALTRI COMANDI

        System.out.println(invitati);
        

    }

}
