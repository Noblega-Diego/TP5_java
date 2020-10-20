package tp5_java;
import java.util.ArrayList;
import java.util.Scanner;
public class ejercicio02 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<Double>();
        double mayor,menor,diferencia;
        
        ingresoDeNumeros(numeros);
        mayor = mayorDeList(numeros);
        menor = menorDeList(numeros);
        diferencia = mayor - menor;
        
        System.out.println("mayor:" + mayor);
        System.out.println("menor:" + menor);
        System.out.println("diferencia:" + diferencia);
    }
    public static Double mayorDeList(ArrayList<Double> numeros){
        Double mayor;
        mayor = numeros.get(0);
        for(Double a : numeros){
            if(a.compareTo(mayor)>0){
                mayor = a;
            }
        }       
        return mayor;
    }
    public static Double menorDeList(ArrayList<Double> numeros){
        Double menor;
        menor = numeros.get(0);
        for(Double a : numeros){
            if(a.compareTo(menor)<0){
                menor = a;
            }
        }
        return menor;
    }
    
    public static void ingresoDeNumeros(ArrayList<Double> numeros){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese los numeros");
        for (int i = 0; i < 20; i++) {
            System.out.print("N°"+(i+1)+ ":");
            Double numero = sc.nextDouble();
            numeros.add(numero);
        }
    }
}
