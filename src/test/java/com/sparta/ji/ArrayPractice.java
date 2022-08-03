package com.sparta.ji;

import org.junit.jupiter.api.Test;

public class ArrayPractice {

    @Test
    public void checkFirTheBigestNumber(){
        int [] ages = {22,4,5,2,7,60,9};
        //System.out.println("biggest number is: " +biggest(ages));
    }
    static int biggest(int [] number){
        int temp = 0;
        for (int i = 0; i<number.length-1; i++) {
            if (number[i]> number[i+1]){
                temp = number[i];
                number[i+1] = temp;
                temp =  number[i];
            }
        }
        return temp;
    }


}

