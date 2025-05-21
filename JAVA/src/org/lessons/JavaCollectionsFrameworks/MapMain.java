package org.lessons.JavaCollectionsFrameworks;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {
        Map<String, String> rubrica = new HashMap<>();
        rubrica.put("Alessandro", " +39 332223442");
        rubrica.put("Gabriele", " +39 3312324558");
        rubrica.put("Francesco", " +39 3398128554");
        System.out.println(rubrica);

        // ! COME ORDINARE PER CHIAVE E VALORE?
        System.out.println(rubrica.keySet());
        System.out.println(rubrica.values());

        // ! CICLO FOR EACH:
        for (String chiave : rubrica.keySet()) {
            System.out.println("Chiave: " + chiave + ", Valore:"+ rubrica.get(chiave));
            
        }
    }

}
