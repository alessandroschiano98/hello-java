package org.lessons;

import java.util.Random;
import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
    
        Random  randomGenerator = new Random();

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero massimo da generare: ");
        int numeroMassimo = input.nextInt();
	
        int numeroGenerato = randomGenerator.nextInt(numeroMassimo);
        System.out.println(numeroGenerato);

        input.close();
    }
}

// & org.lessons.java.Math
// & java.utils.Math
