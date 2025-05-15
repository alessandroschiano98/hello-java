/*  
package org.lessons;
public class LongestWorld {
   public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String firstWord = "ciao";
        String secondWord = "ciao";

        // VEDERE QUALE PAROLA E' LA + LUNGA
        if (firstWord.length() > secondWord.length()) {
            System.out.println("La prima parola è la più lunga");
        } else if (firstWord.length()< secondWord.length()) {
            System.out.println("La seconda parola è la più lunga");
        }
        else {
            System.err.println("Le parole sono lunghe uguali");
        }
    }
}
*/
package org.lessons;

import java.util.Scanner;

public class LongestWorld {
    public static void main(String[] args) {
        // QUELLO CHE TROVERO ALL'INTERNO DELLA CONSOLE CHIEDERA' ALL'UTENTE //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first word:");
        String firstWord = scanner.nextLine();
        System.out.println("Type the second word:");
        String secondWord = scanner.nextLine();

        scanner.close();

        // VEDERE QUALE PAROLA E' LA + LUNGA
        if (firstWord.length() > secondWord.length()) {
            System.out.println("La prima parola è la più lunga");
        } else if (firstWord.length() < secondWord.length()) {
            System.out.println("La seconda parola è la più lunga");
        } else {
            System.err.println("Le parole sono lunghe uguali");
        }
    }
}