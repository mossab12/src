package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        VectorHelper v= new VectorHelper();
        ArrayList<Integer> a =v.CreatVector();
        v.MaxMinVector(a);
        v.InversVector(a);
        v.ShowVector(a);
    }
}
