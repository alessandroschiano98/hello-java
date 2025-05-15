package org.lessons.Array;

public class Array {
    public static void main(String[] args) {

        // % voglio un array di interi
        int[] interi = { 25, 35, 45, 54, 75 };
        System.out.println(interi[3]); // POSIZIONE 0-1-2-[3] //
        interi[3] = 431; // VIENE SOSTITUITO IL 54 CON IL 431
        System.out.println(interi[3]);

        // int[] interiSenzaRiempirli = new int [10]; // QUESTO E' UN ARRAY CON 10 SPAZI
        // System.out.println(interiSenzaRiempirli);

        // NUMERI DA 0 A 10 (CICLO FOR) uguale a JavaScript //
        /*
         * for ( int i = 0; i < 10; i++){
         * System.out.println(i);
         * }
         */

        for (int i = 0; i < interi.length; i++) {
            System.out.println("All'indice " + i + " si trova l'elemento " + interi[i]); // RICORDA DI MANTENERE GLI SPAZI 
        }

    }
}
