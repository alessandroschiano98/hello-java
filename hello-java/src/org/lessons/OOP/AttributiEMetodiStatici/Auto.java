package org.lessons.OOP.AttributiEMetodiStatici;

public class Auto  extends Veicolo{
    public Auto(String nome){
        super(nome);
    }

    @Override
    public static String toString(){
        return super.toString() + " to string dell'auto";
    }

}
