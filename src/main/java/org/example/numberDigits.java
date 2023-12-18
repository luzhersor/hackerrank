package org.example;

public class numberDigits {

    public static void main(String[] args) {
        //int i = 1234;
        //String str = String.valueOf(i);
        //System.out.println(str.length());


        //2.) Convert first half of the String
        // in lower case and second half in upper case

        String str = "Mitad 1 Mitad2";
        int mid = str.length()/2;
        String upper = "";
        String lower = "";
        for(int i=0;i<=str.length()-1;i++){
            if(i<mid){
                upper = upper + Character.toUpperCase(str.charAt(i));
            }
            else {
                lower = lower + Character.toLowerCase(str.charAt(i));
            }
        }

        System.out.println(upper);
        System.out.println(lower);

    }
}
