package com.company;
import java.util.Scanner;
import java.util.*;

/**
 * Class VectorHelper contenat les opérations a appliquer sur les vecteurs.
 */
public class VectorHelper {
// commentaire pour montrer l'utilisation de Github.
    /**
     *
     * Méthode CreatVector pour créer un nouveau vecteur.
     * @return un vecteur.
     */

    public ArrayList<Integer> CreatVector() {
        ArrayList<Integer> Vect = new ArrayList<Integer>();
        System.out.println("Veillez saisir la taille du vecteur:");
        Scanner sc = new Scanner(System.in);
        int taille = sc.nextInt();
        int i=0;
        //Boucle de remplissage des élements du vecteur
        while (i < taille) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Veuillez saisir un nombre :");
            //Ajout de la valeur entrée aux vecteur selon l'index "i"
            Vect.add(sc1.nextInt());
            i++;
        }
        return Vect;
    }

    /**
     * Méthode ShowVector pour afficher tous le éléments d'un vecteur donné.
     * @param Vect un vecteur.
     */

    public void ShowVector(ArrayList<Integer> Vect){
        for (int i=0 ; i< Vect.size() ; i++) {
            System.out.println(Vect.get(i));
        }
    }

    /**
     * Méthode TriVector pour trier un vecteur donné.
     * @param VectToSort le vecteur qu'on veut trier.
     * @return le vecteur aprés le tri.
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
                //Permutation de deux élements si il ya désordre
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
     * Méthode SommeVector pour calculer la somme de deux vecteurs en entrée.
     * @param Vect1 le premier vecteur.
     * @param Vect2 le deuxieme vecteur.
     * @return le vecteur résultat.
     * @throws ExceptionTailleDif
     */

    public ArrayList<Integer> SommeVector(ArrayList<Integer> Vect1 ,ArrayList<Integer> Vect2) throws ExceptionTailleDif{
        //Gestion de l'éxception si la taille des deux vecteurs est différentes
        if (Vect1.size() != Vect2.size()) {
            throw new ExceptionTailleDif();
        }
        // Sinon on somme les élements des deux vecteurs un a un selon leur indice "i"
        else{
            ArrayList<Integer> VectorRes =new ArrayList<Integer>();
            for(int i=0; i< Vect1.size() ; i++ ){
                VectorRes.add(Vect1.get(i)+ Vect2.get(i));
            }
            return VectorRes;
        }
    }

    /**
     * Méthode InversVector pour faire l'inversion des élements d'un vecteur donné
     * @param VectToInverse le vecteur à inverser.
     * @return
     */

    public ArrayList<Integer> InversVector(ArrayList<Integer> VectToInverse) {
        int tmp;
        int taille =VectToInverse.size()/2;
        for(int i=0; i< taille ; i++ ){
            //Permutation des élements selon l'index "i"
            tmp = VectToInverse.get(i);
            VectToInverse.set(i,VectToInverse.get(VectToInverse.size()-1-i));
            VectToInverse.set(VectToInverse.size()-1-i,tmp);
        }
        return VectToInverse;
    }

    /**
     * Méthode MaxMinVector pour faire le calcul et l'affichage du minimum et du maximum d'un vecteur donné.
     * @param Vect le vecteur en entrée.
     */

    //
    public void MaxMinVector(ArrayList<Integer> Vect) {
        //initialisation du min et du max
        int min = Vect.get(0);
        int max = Vect.get(Vect.size()-1);
        //parcours des elements du vecteurs et comparaison de ses élements
        for (int i: Vect) {
            if (i>max) max=i;
            if (i<min) min=i;
        }
        //Affichage du min et du max
        System.out.println("Le minimum du vecteur est : "+min);
        System.out.println("Le maximum du vecteur est : "+max);
    }

    /**
     * Méthode retournant la formule de calcul du carée d'un nombre donné.
     * @param element un entier.
     * @return
     */

    public int Formul(int element){
        return element*element ;
    }

    /**
     * Méthode appliquant une formule à tous les élements d'un vecteur donné.
     * @param Vect le vecteur.
     */

    public void ApplyFormul(ArrayList<Integer> Vect){
        int index=0;
        //Parcours des élements du vecteur et application de la formule du carée
        for (int i: Vect) {
            Vect.set(index,Formul(i));
            index++;
        }
    }


}
