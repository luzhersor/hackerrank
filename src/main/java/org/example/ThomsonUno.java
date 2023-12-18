package org.example;

import java.util.ArrayList;
import java.util.List;

/*DEGREE OF AN ARRAY
* 1 the degree of the array
* 2 the lenght of the shortest subarray that shares that degree
* */

public class ThomsonUno {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(2);


        List<Integer> ocurrences = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        for(int i=0;i<=arr.size()-1;i++){
            if(numbers.contains(arr.get(i))){
                ocurrences.set(numbers.indexOf(arr.get(i)), ocurrences.get(numbers.indexOf(arr.get(i)))+1);
                //Index, int

            } else {
                numbers.add(arr.get(i));
                ocurrences.add(1);
            }
        }

        int degree = 0;
        for(int i=0;i<=ocurrences.size()-1;i++){
            if(ocurrences.get(i)>degree){
                degree = ocurrences.get(i);
            }
        }

        System.out.println(arr);
        System.out.println(degree+" degree");
        System.out.println(ocurrences.toString()+" Ocurrencias");
        System.out.println(numbers.toString());

        //Obtener los subarray que cumplan con el grado:2
        //Retornar el size del menor

        int size = 0;
        int menor = 0;
        int start = 0;
        int end = 0;
        int contador = 0;
        List<Integer> prueba = new ArrayList<>();

        for(int i=0;i<=arr.size()-1;i++){
            contador  = i+1;
            if(arr.get(i)==2){
                //end = contador;
                start = contador;
                //size = end - start;
                System.out.println(start);
                System.out.println(size);
                //No sé como resolver este problema, de repetir el valor en el contador
                //y que no se asigne nuevamente el valor
            }

        }

        /*for(int i=0; i<=arr.size()-1;i++){

            for(int j=i; j<=arr.size()-1; j++){
                System.out.println(arr.get(j));
                prueba.add(j);


                if(prueba.size()==degree){
                    size = prueba.size();
                    if(size<menor){
                        menor = size;
                    }
                }
            }
        }*/





    }
}
