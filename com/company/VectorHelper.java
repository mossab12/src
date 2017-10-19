package com.company;
import java.util.Scanner;
import java.util.*;
import static java.lang.Integer.parseInt;

public class VectorHelper {


    public ArrayList<Integer> CreatVector() {
        ArrayList<Integer> Vect = new ArrayList<Integer>();
        System.out.println("Veillez saisir la taille du vecteur:");
        Scanner sc = new Scanner(System.in);
        int taille = sc.nextInt();
        int i=0;
        while (i < taille) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Veuillez saisir un nombre :");
            Vect.add(sc1.nextInt());
            i++;
        }
        return Vect;
    }

    public void ShowVector(ArrayList<Integer> Vect){
        for (int i=0 ; i< Vect.size() ; i++) {
            System.out.println(Vect.get(i));
        }
    }

}
