package org.example;

public class excepciones {

    public static void main(String[] args) {

        //Queremos que el flujo continue y que el usuario pueda
        //seguir interactuando

        try{
            int resultado = 3/0;
        }
        catch (Exception e){
            System.out.println("No se puede dividir por cero");
        }

        //ArrayIndexOutOfRange
        int edades[] = {15,12,23,30};
        //System.out.println("La edad de la posición 4 es "+edades[4]);

        try{
            System.out.println("La edad de la posición 4 es "+edades[4]);
        } catch (Exception f){
            System.out.println("Intentaste acceder a un indice que no existe");
        } finally {
            System.out.println("El programa terminó");
        }






    }

}
