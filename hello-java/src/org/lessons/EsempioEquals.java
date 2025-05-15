package org.lessons;

import java.util.Scanner;

public class EsempioEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringaUno = "ciao";
        String stringaDue = scanner.nextLine();
        scanner.close();
        System.out.println(stringaUno.equals(stringaDue));
    }

}
