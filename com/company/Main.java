package com.company;
import java.util.*;
import java.util.Scanner;


//Classe principale de l'application "main"
public class Main {

    public static void main(String[] args) {
        VectorHelper v= new VectorHelper();
        ArrayList<Integer> a = new ArrayList<Integer>();
        int choice;
        while (true){
            System.out.println("Veillez donner le numéro de l'une des opérations suivantes: ");
            System.out.println("1.Création d'un vecteur");
            System.out.println("2.Affichage des élements d'un vecteur");
            System.out.println("3.Trie d'un vecteur");
            System.out.println("4.Calcul de la somme de deux vecteurs");
            System.out.println("5.Inversion des élements d'un vecteur");
            System.out.println("6.Obtention simultané du minimum et du maximum d'un vecteur");
            System.out.println("7.Application de la formule (calcul du carée) aux élements d'un vecteur");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    a = v.CreatVector();
                    break;
                case 2:
                    if (a.size()==0) System.out.println("Vecteur vide veillez le créer d'abord et réessayer");
                    else {
                        v.ShowVector(a);
                    }
                    break;
                case 3:
                    if (a.size()==0) System.out.println("Vecteur vide veillez le créer d'abord et réessayer");
                    else {
                        v.TriVector(a);
                        System.out.println("Effectué..le vecteur est trié !");
                    }
                    break;
                case 4:
                    System.out.println("****Création du premier vecteur a sommer****");
                    ArrayList<Integer> V1 = v.CreatVector();
                    System.out.println("****Création du deuxieme vecteur a sommer****");
                    ArrayList<Integer> V2 = v.CreatVector();
                    try {
                        ArrayList <Integer> VRes =v.SommeVector(V1,V2);
                        System.out.println("****Création du deuxieme vecteur a sommer****");
                        System.out.println("Le Vecteur somme résultant est : ");
                        v.ShowVector(VRes);
                    }
                    catch (ExceptionTailleDif ex) {}
                    break;
                case 5:
                    if (a.size()==0) System.out.println("Vecteur vide veillez le créer d'abord et réessayer");
                    else {
                        v.InversVector(a);
                        System.out.println("Effectué..les élements du vecteur ont été inversé !");
                    }
                    break;
                case 6:
                    if (a.size()==0) System.out.println("Vecteur vide veillez le créer d'abord et réessayer");
                    else {
                        int [] res = v.MaxMinVector(a);
                        System.out.println("Effectué..la recherche du min et du max est réussite!");
                        System.out.println("Le minimum du vecteur est : "+res[0]);
                        System.out.println("Le maximum du vecteur est : "+res[1]);
                    }
                    break;
                case 7:
                    if (a.size()==0) System.out.println("Vecteur vide veillez le créer d'abord et réessayer");
                    else {
                        v.ApplyFormul(a);
                        System.out.println("Effectué..la formule a été appliqué a tous les élements du vecteur!");
                    }
                    break;
                default:
                    System.out.println("Numéro éronée veillez réessayer !");

            }
            System.out.println("\n");
        }
    }
}
