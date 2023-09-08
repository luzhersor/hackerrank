package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class ConsecutiveSum {

    /* Determine the starting index at which
    a sequence of consecutive numbers exists
    whose sum is equal to the target value given
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int sumValue = 7;
        list.add(0);
        list.add(1);
        list.add(5);
        list.add(5);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(6);

        int total = 0;
        int index=0;
        //boolean seguir = true;


        //while(seguir==true){
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i) + " i");

            for (int j = i; j <= list.size() - 1; j++) {
                System.out.println(list.get(i)+" "+list.get(j)+" i & j");
                total = total + list.get(j);
                System.out.println("TOTAL = " +total);
                index++;

                if(total==sumValue){
                    System.out.println("the starting index at which the sum is equal to "+total +" is: "+index );
                    //seguir = false;
                }
            }

            total=0;
            index=0;

        }
    }

}
