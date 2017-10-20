package com.company;

/**
 * Exception gérant le cas où deux tableaux ont des tailles différentes
 */

public class ExceptionTailleDif extends Exception {
    public ExceptionTailleDif(){
        System.out.println("Les deux tableaux ont des tailles différentes");
    }
}
