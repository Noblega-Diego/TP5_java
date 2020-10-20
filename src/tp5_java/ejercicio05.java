/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5_java;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ejercicio05 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        llenarRandomList(numeros, 50);
        int posicion;
        System.out.println("Ingrese el numero a búscar");
        Integer numeroIngresado = sc.nextInt();
        posicion = buscarNumero(numeros, numeroIngresado);
        if(posicion != -1){
            System.out.println("posicion:" + posicion);
        }else{
            System.out.println("no se ha encontrado el numero ingresado");
        }
        
    }
    
    public static void llenarRandomList(ArrayList<Integer> numeros, int cantidad){
        Random random = new Random();
        for(int i = 0; i< cantidad; i++){
            Integer num = random.nextInt(100);
            numeros.add(num);
        }
    }
    
    public static int buscarNumero(ArrayList<Integer> numeros, Integer numero){
        for(int i = 0; i < numeros.size(); i++){
            Integer a = numeros.get(i);
            if(numero.compareTo(a) == 0){
                return i;
            }
        }
        return -1;
    }
}
