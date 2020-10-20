/*
 */
package tp5_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ejercicio06 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ingresarNumeros(numeros);
        ArrayList<Integer> numeros1 = new ArrayList<Integer>(numeros);
        ArrayList<Integer> numeros2 = new ArrayList<Integer>(numeros);
        Collections.sort(numeros1);
        Collections.sort(numeros2);
        Collections.reverse(numeros2);
        System.out.print("ArrayList ingresada:");
        mostrarArrayList(numeros);
        System.out.print("ArrayList creciente:");
        mostrarArrayList(numeros1);
        System.out.print("ArrayList decreciente:");
        mostrarArrayList(numeros2);
    }
    
    public static void mostrarArrayList(ArrayList<Integer> numeros) {
        for (Integer integer : numeros) {
            System.out.print(integer+ ",");
        }
        System.out.print("\n");
    }
    public static void ingresarNumeros(ArrayList<Integer> numeros){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            Integer num = sc.nextInt();
            numeros.add(num);
        }
    }
    
}