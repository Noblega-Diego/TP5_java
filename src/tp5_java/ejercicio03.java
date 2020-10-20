/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5_java;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author diego
 */
public class ejercicio03 {
    public static void main(String[] args) {
        Integer promedio;
        int cMayores = 0,cMenores = 0,cIguales = 0;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        llenarRandomList(numeros, 20);
        mostrarList(numeros);
        promedio = promedioAritmetico(numeros);
        for(Integer n: numeros){
            if(n.compareTo(promedio) > 0){
                cMayores ++;
            }else if(n.compareTo(promedio) < 0){
                cMenores ++;
            }else{
                cIguales ++;
            }
        }
        System.out.println("promedio:"+ promedio);
        System.out.println("mayores:"+ cMayores);
        System.out.println("menores:"+ cMenores);
        System.out.println("iguales:"+ cIguales);
        
    }
    
    public static void mostrarList(ArrayList<Integer> numeros){
        for(Integer a : numeros){
            System.out.print(a + " ");
        }
        System.out.print("\n");
    }
    
    public static void llenarRandomList(ArrayList<Integer> numeros, int cantidad){
        Random random = new Random();
        for(int i = 0; i< cantidad; i++){
            Integer num = random.nextInt(100);
            numeros.add(num);
        }
    }
    
    public static Integer promedioAritmetico(ArrayList<Integer> numeros){
        int suma = 0;
        for(Integer n : numeros){
            suma += n;
        }
        Integer promedio = suma/numeros.size();
        return promedio;
    }
    
}
