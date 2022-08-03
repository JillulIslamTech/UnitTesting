package com.sparta.ji;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayTask {

    public static void main(String[] args) {
        String cars[] = {"Volvo", "BMW", "Ford", "Mazda"};
        sortTheArray(cars);
    }

    public static void sortTheArray(String arrayName[]){

        int size = arrayName.length;
        for (int i = 0; i<size-1; i++){
            for (int j = i+1; j<size; j++){
                if (arrayName[i].compareTo(arrayName[j])>0){
                    String temp = arrayName[i];
                    arrayName[i] = arrayName[j];
                    arrayName[j] = temp;
                }
            }
        }
        System.out.println("After sorting : "+ Arrays.toString(arrayName));
    }
}
