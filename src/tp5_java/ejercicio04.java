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
        ArrayList<String> palabrasConcidencias = new ArrayList<String>();
        boolean coincidencia;
        for(String palabra1 : palabras){
            coincidencia = false;
            for(String palabraCoincidencia : palabrasConcidencias){
                if(palabra1.compareToIgnoreCase(palabraCoincidencia) == 0){
                    coincidencia = true;
                    break;
                }
            }
            if(!coincidencia){
                int cantidad;
                cantidad = vuscarPalabra(palabras, palabra1);
                if(cantidad > 1){
                    palabrasConcidencias.add(palabra1);
                    System.out.println("    "+palabra1+":"+cantidad);
                }
            }
        }
    }
    
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
