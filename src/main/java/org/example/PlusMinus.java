package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
Example
There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:
 */



public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);

        int len = arr.size();
        System.out.println(arr);
        //int arr2[] = {};
        List<Double> arr2 = new ArrayList<>();
        float positive = 0;
        float negative = 0;
        float zeros = 0;

        for(int i=0;i<=len-1;i++){
            if(arr.get(i)>0){
                positive++;
            }else if(arr.get(i)<0){
                negative++;
            } else {
                zeros++;
            }
        }

        System.out.printf(String.format("%.6f\n",(positive/len)));
        System.out.printf(String.format("%.6f\n",(negative/len)));
        System.out.printf(String.format("%.6f",(zeros/len)));





    }

}
