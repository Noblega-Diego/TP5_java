/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5_java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ejercicio04 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<String>();                   //se crea la lista de Arrays
        ingresarPalabras(palabras);                                             //se ingresan las palabras en la lista
        mostrarPalabraConMasLetras(palabras);
        for(String palabra : palabras){
            if(vuscarPalabra(palabras, palabra) >1) {
                System.out.println("se han encontrado repeticiones");
                break;
            }
        }
        palabrasRepetidas(palabras);
    }
    
    private static void ingresarPalabras(ArrayList<String> palabras){
        Scanner sc = new Scanner(System.in);
        do{
            String palabra = sc.next();
            if(palabra.equals("salir")) break;
            palabras.add(palabra);
        }while(true);
    }
    /**
     * comapra las cantidades de lentras entre A y B
     * @param A palabra1 esta se compara con la otra
     * @param B palabra2
     * @return etorna 1 o -1 dependiendo si palabra1 tiene mas o menos palabras
     */
    private static int compararCantidadAB(String A, String B){
        int Alength = A.length();
        int Blength = B.length();
        
        if(Alength > Blength) return 1;
        else if(Alength < Blength) return -1;
        else return 0;
    }
    

    private static void mostrarPalabraConMasLetras(ArrayList<String> palabras){
        String palabraMasLetras = palabras.get(0);
        for (String palabra : palabras) {
            if(compararCantidadAB(palabra, palabraMasLetras) > 0){
                palabraMasLetras = palabra;
            }
        }
        System.out.println("palabra con mas letras: "+ palabraMasLetras);
    }
    
    private static void palabrasRepetidas(ArrayList<String> palabras){
        ArrayList<String> palabrasRepetidas = new ArrayList<String>();  //donde se guardaran las palabras repetidas
        boolean coincidencia;
        for(String palabra1 : palabras){
            coincidencia = false;
            for(String palabraRepetida : palabrasRepetidas){            
                if(palabra1.compareToIgnoreCase(palabraRepetida) == 0){ //si la palabra se encuentra lista de palabras repetidas
                    coincidencia = true;                                //no es necesario que se busquen coincidencias nuevaente
                    break;
                }
            }

            if(!coincidencia){                                          
                int cantidad;
                cantidad = vuscarPalabra(palabras, palabra1);
                if(cantidad > 1){                                       //si se encuentra mas de 1 ves en el ArrayList
                    palabrasRepetidas.add(palabra1);                    //la palbra sera añadida al arrayList que contiene las palabras repetidas
                    System.out.println("    "+palabra1+":"+cantidad);   //se imprime la palabra con la canidad de veces que esta presente en el ArrayList
                }
            }
        }
    }

    //retorna la cantidad de veces que se ha encontrado la palabra en el array list
    private static int vuscarPalabra(ArrayList<String> palabras, String palabra){
        int cantidad = 0;
        for(String p : palabras){
            if(palabra.compareToIgnoreCase(p) == 0){
                cantidad ++;
            }
        }
        return cantidad;
    }
}
