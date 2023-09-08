package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BalancedStrings {

    /*A string, s, is composed of the letter a,b,c and d.
    The string is said to be balanced if both of the following conditions
    are satisfied

    -The total count of "a" is equal to the count of "c"
    -The total count of "b" is equal to the count of "d"
     */

    public static void main(String[] args) {

        String str = "abcd";
        //I have to count each of the letters and then
        /*compare them. Since is a string, I can iterate
        it like an array
         */
        int[]  arr={0,1,2,3};

        int a=0;
        int b=0;
        int c=0;
        int d=0;

        for(int i=0; i<=str.length()-1; i++){
            System.out.println(str.charAt(i));
            if(str.charAt(i)=='a'){
                a++;
            } else if(str.charAt(i)=='b'){
                b++;
            } else if(str.charAt(i)=='c'){
                c++;
            } else {
                d++;
            }
        }

        if(a == c && b==d){
            System.out.println("true");
        } else {
            System.out.println("false");;
        }

        System.out.println(Arrays.toString(arr));

    }

}
