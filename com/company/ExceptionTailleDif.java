package com.company;

//Exception gérant le cas ou deux tableaux ont des tailles différentes
public class ExceptionTailleDif extends Exception {
    public ExceptionTailleDif(){
        System.out.println("Les deux tableaux on une taille différente");
    }
}
