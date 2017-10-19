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

    public ArrayList<Integer> TriVector( ArrayList<Integer> VectToSort) {
        boolean tab_en_ordre = false;
        int tmp;
        int taille = VectToSort.size();
        while(!tab_en_ordre)
        {
            tab_en_ordre = true;
            for(int i=0 ; i < taille-1 ; i++)
            {
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


    public ArrayList<Integer> SommeVector(ArrayList<Integer> Vect1 ,ArrayList<Integer> Vect2) throws ExceptionTailleDif{
        if (Vect1.size() != Vect2.size()) {
            throw new ExceptionTailleDif();
        }
        else{
            ArrayList<Integer> VectorRes =new ArrayList<Integer>();
            for(int i=0; i< Vect1.size() ; i++ ){
                VectorRes.add(Vect1.get(i)+ Vect2.get(i));
            }
            return VectorRes;
        }
    }

    public ArrayList<Integer> InversVector(ArrayList<Integer> VectToInverse) {
        int tmp;
        int taille =VectToInverse.size()/2;
        for(int i=0; i< taille ; i++ ){
            tmp = VectToInverse.get(i);
            VectToInverse.set(i,VectToInverse.get(VectToInverse.size()-1-i));
            VectToInverse.set(VectToInverse.size()-1-i,tmp);
        }
        return VectToInverse;
    }

    public void MaxMinVector(ArrayList<Integer> Vect) {
        int min = Vect.get(0);
        int max = Vect.get(Vect.size()-1);
        for (int i: Vect) {
            if (i>max) max=i;
            if (i<min) min=i;
        }
        System.out.println("Le minimum du vecteur est : "+min);
        System.out.println("Le maximum du vecteur est : "+max);
    }



}
