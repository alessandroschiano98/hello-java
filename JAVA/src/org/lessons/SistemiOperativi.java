package org.lessons;

public class SistemiOperativi {

    public static void main(String[] args) {
        
        int utentiMac = 4;
        int utentiWindows = 7;
        int utentiLinux = 1;

        int numeroUtenti = utentiMac + utentiLinux + utentiWindows;

        // ! utentiMac * 100 / numeroUtenti

        float percentualeUtentiMac =  (float) utentiMac *  100 / (float) numeroUtenti;

        float percentualeUtentiWindows =  (float) utentiWindows *  100 / (float) numeroUtenti;

        float percentualeUtentiLinux =  (float) utentiLinux *  100 / (float) numeroUtenti;

        System.out.println(percentualeUtentiMac);
        System.out.println(percentualeUtentiWindows);
        System.out.println(percentualeUtentiLinux);



    }
    
}
