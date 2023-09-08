package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    /*
    Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        long max = 0;   //64bits
        long min = 0;


        Collections.sort(list);
        System.out.println(list);

        for(int i=0;i<=list.size()-1;i++){

            if(i<=3){
                max = max + list.get(i);
            }

            if(i>0){
                min = min + list.get(i);
            }
        }

        System.out.println(max);
        System.out.println(min);



    }
}
