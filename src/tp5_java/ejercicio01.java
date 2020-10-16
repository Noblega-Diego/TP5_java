/*
 *  Cree un ArrayList<Integer>, que  permita asignar  los valores  numéricos manualmente  (los  que  tú  quieras) 
 * hasta  ingresar  un  valor  menor  a  0, mostrar los números por pantalla. 
 * Solicite los números mediante un bucle.
 */

package tp5_java;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Diego
 */
public class ejercicio01 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<Double>();
        double num;
        Scanner sc = new Scanner(System.in);
        do{
            num = sc.nextDouble();
            if(num < 0) break;              //si el numero es menor a 0 no se sigue con el añadido de numeros
            Double n = num;
            numeros.add(n);
        }while(true);
        System.out.println("numeros ingresados");
        for (Double d : numeros) {
            System.out.println(d);
        }
    }
}
