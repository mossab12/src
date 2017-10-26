package com.company;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;

/**
 * Class VectorHelper contenat les operations a appliquer sur les vecteurs.
 */
public class VectorHelper {
    /**
     * Methode CreatVector pour creer un nouveau vecteur.
     * @return un vecteur.
     */

    public ArrayList<Integer> CreatVector() {
        ArrayList<Integer> Vect = new ArrayList<Integer>();
        System.out.println("Veillez saisir la taille du vecteur:");
        Scanner sc = new Scanner(System.in);
        int taille = sc.nextInt();
        int i=0;
        //Boucle de remplissage des elements du vecteur
        while (i < taille) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Veuillez saisir un nombre :");
            //Ajout de la valeur entree aux vecteur selon l'index "i"
            Vect.add(sc1.nextInt());
            i++;
        }
        return Vect;
    }

    /**
     * Methode ShowVector pour afficher tous le elements d'un vecteur donne.
     * @param Vect un vecteur.
     */

    public void ShowVector(ArrayList<Integer> Vect){
        for (int i=0 ; i< Vect.size() ; i++) {
            System.out.println(Vect.get(i));
        }
    }

    /**
     * Methode TriVector pour trier un vecteur donne.
     * @param VectToSort le vecteur qu'on veut trier.
     * @return le vecteur apres le tri.
     */

    public ArrayList<Integer> TriVector( ArrayList<Integer> VectToSort) {
        boolean tab_en_ordre = false;
        int tmp;
        int taille = VectToSort.size();
        //Algorithme du tri par Bulle d'un vecteur
        while(!tab_en_ordre)
        {
            tab_en_ordre = true;
            for(int i=0 ; i < taille-1 ; i++)
            {
                //Permutation de deux elements si il ya desordre
                if(VectToSort.get(i) > VectToSort.get(i+1))
                {
                    tmp = VectToSort.get(i);
                    VectToSort.set(i,VectToSort.get(i+1));
                    VectToSort.set(i+1,tmp);
                    tab_en_ordre = false;
                }
            }
            taille--;
        }
        return VectToSort;
    }

    /**
     * Methode SommeVector pour calculer la somme de deux vecteurs en entree.
     * @param Vect1 le premier vecteur.
     * @param Vect2 le deuxieme vecteur.
     * @return le vecteur resultat.
     * @throws ExceptionTailleDif
     */

    public ArrayList<Integer> SommeVector(ArrayList<Integer> Vect1 ,ArrayList<Integer> Vect2) throws ExceptionTailleDif{
        //Gestion de l'exception si la taille des deux vecteurs est differentes
        if (Vect1.size() != Vect2.size()) {
            throw new ExceptionTailleDif();
        }
        // Sinon on somme les elements des deux vecteurs un a un selon leur indice "i"
        else{
            ArrayList<Integer> VectorRes =new ArrayList<Integer>();
            for(int i=0; i< Vect1.size() ; i++ ){
                VectorRes.add(Vect1.get(i)+ Vect2.get(i));
            }
            return VectorRes;
        }
    }

    /**
     * Methode InversVector pour faire l'inversion des elements d'un vecteur donne
     * @param VectToInverse le vecteur a inverser.
     * @return le vecteur inverse
     */

    public ArrayList<Integer> InversVector(ArrayList<Integer> VectToInverse) {
        int tmp;
        int taille =VectToInverse.size()/2;
        for(int i=0; i< taille ; i++ ){
            //Permutation des elements selon l'index "i"
            tmp = VectToInverse.get(i);
            VectToInverse.set(i,VectToInverse.get(VectToInverse.size()-1-i));
            VectToInverse.set(VectToInverse.size()-1-i,tmp);
        }
        return VectToInverse;
    }

    /**
     * Methode MaxMinVector pour faire le calcul et l'affichage du minimum et du maximum d'un vecteur donne.
     * @param Vect le vecteur en entree.
     */

    //
    public int [] MaxMinVector(ArrayList<Integer> Vect) {
        //initialisation du min et du max
        int [] Resultat = new int [2];
        int min = Vect.get(0);
        int max = Vect.get(Vect.size()-1);
        //parcours des elements du vecteurs et comparaison de ses elements
        for (int i: Vect) {
            if (i>max) max=i;
            if (i<min) min=i;
        }
        //Affichage du min et du max
        Resultat[0]=min;
        Resultat[1]=max;
        return Resultat;
    }

    /**
     * Methode retournant la formule de calcul du caree d'un nombre donne.
     * @param element un entier.
     * @return un tableau de taille 2, le premier element c'est le min et le deuxieme le max.
     */

    public int Formul(int element){
        return element*element ;
    }

    /**
     * Methode appliquant une formule a tous les elements d'un vecteur donne.
     * @param Vect le vecteur.
     */

    public ArrayList<Integer> ApplyFormul(ArrayList<Integer> Vect){
        int index=0;
        //Parcours des elements du vecteur et application de la formule du caree
        for (int i: Vect) {
            Vect.set(index,Formul(i));
            index++;
        }
        return Vect;
    }


}
