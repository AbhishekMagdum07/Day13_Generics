package com.bridgelabz.generics;

public class Generics {

    public <T extends Comparable > T maximum(T a, T b, T c , T d){
        T max = a;

        if(b.compareTo(a) > 0){
            max = b;
        }else if (c.compareTo(max) > 0){
            max = c;
        }else if (d.compareTo(max) > 0){
            max = d;
        }
        return max;
    }
}
