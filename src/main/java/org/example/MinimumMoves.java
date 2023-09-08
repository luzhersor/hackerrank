package org.example;

import java.util.ArrayList;
import java.util.List;

public class MinimumMoves {

    /*There are two arrays of integers, arr1 and arr2.
    Determine the minimum number of moves to match arr1
    with arr2
     */

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(543);

        List<Integer> list2 = new ArrayList<>();
        list2.add(321);
        list2.add(279);

        System.out.println(list1);

        String str1="";
        String str2="";

        for(int i=0;i<=list1.size()-1;i++){
            str1 = str1 + String.valueOf(list1.get(i));
            str2 = str2 + String.valueOf(list2.get(i));
        }

        System.out.println(str1);
        System.out.println(str2);

        int dif = 0;
        int total = 0;

        for(int i=0;i<=str1.length()-1;i++){

            dif = Math.abs(str1.charAt(i)-str2.charAt(i));
            total = total + dif;
            System.out.println(dif);

        }

        System.out.println(total);








    }
}
