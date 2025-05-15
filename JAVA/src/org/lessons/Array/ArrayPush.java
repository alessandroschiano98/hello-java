package org.lessons.Array;

public class ArrayPush {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        // CREARE UN NUOVO ARRAY PIU' LUNGO DI 1
        int[] newNumbers = new int[numbers.length + 1];

        // QUALSIASI METODO PER POTER COPIARE UN ARRAY IN UN ALTRO
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }

        // QUI DEFINISCI DOVE VUOI AGGIUNGERE + IL NUMERO CHE VUOI AGGIUNGERE
        newNumbers[numbers.length] = 777;

        for (int i = 0; i < newNumbers.length; i++) {
            System.out.println(newNumbers[i]);
        }
    }
}
