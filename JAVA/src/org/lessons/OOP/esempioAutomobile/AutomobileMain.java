package org.lessons.OOP.esempioAutomobile;

public class AutomobileMain {
    public static void main(String[] args) {
        Automobile ferrarina = new Automobile("Rosso", "Ferrari", 2002, 500);

        ferrarina.setMarca("Lamborghini");
        Automobile pandino = new Automobile("Bianco", "Fiat", 1994);

        System.out.println(pandino.accendi());
        System.out.println(ferrarina.accendi());
    }


}