package org.example;

import java.util.ArrayList;
import java.util.*;

public class RobustLanguage {

    // Given a sample string "Java is a very robust
    // language", write a Java 8 program to find all
    // the non-repeated characters in it?

    /*First I have to count every character
     * and delete blank spaces*/

    /*To count every character I have to convert
    the string to char array
    */

    /*I have to save the ocurrences of every character in
    another arrayList, because is a dinamic structure*/

    public static void main(String[] args) {
        String str = "Java is a very robust language";
        //char[] cadena = str.toCharArray();  Se puede hacer sin esto
        //System.out.println(cadena);

        List<Integer> ocurrences = new ArrayList<>();
        List<String> letters = new ArrayList<>();

        for (int i = 0; i <= str.length() - 1; i++) {
            if (letters.contains(String.valueOf(str.charAt(i)))) {
                System.out.println("si");
                ocurrences.set(letters.indexOf(String.valueOf(str.charAt(i))),ocurrences.get(letters.indexOf(String.valueOf(str.charAt(i))))+1);
                //El set lo uso porque tengo que cambiar el valor existente, por eso dentro del set se usa un get.
                //ocurrences.get(letters.indexOf(String.valueOf(str.charAt(i)))+1);
            } else {
                letters.add(String.valueOf(str.charAt(i)));
                ocurrences.add(1);
            }
        }

        for(int i=0;i<=ocurrences.size()-1;i++){

            if(ocurrences.get(i) == 1){
                System.out.println(letters.get(i));
            }
        }

        System.out.println(ocurrences);

        System.out.println(letters);
    }

}

