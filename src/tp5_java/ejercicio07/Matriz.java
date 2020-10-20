package tp5_java.ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class Matriz {
    private static ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
    public static void main(String[] args) {
        int fila, columna;
        ingresoDeDatos();
        mostrarArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la fila:");
        fila = sc.nextInt();
        System.out.println("ingrese la columna:");
        columna = sc.nextInt();
        accederAlDato(fila, columna);
    }

    private static void ingresoDeDatos() {
        String dato;
        int fila,columna;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("ingrese el dato:");
            dato = sc.nextLine();

            if(dato.equals("FIN"))
                break;

            System.out.print("fila:");
            fila = sc.nextInt();
            System.out.print("columna:");
            columna = sc.nextInt();
            Celda celda = new Celda(fila,columna,dato);
            matrizCuadrada.add(celda);
            String residuo = sc.nextLine();
        } while (true);
    }

    private static void mostrarArrayList() {
        for (Celda celda : matrizCuadrada) {
            System.out.println(celda.getValor());
        }
    }

    public static void accederAlDato(int fila, int columna) {
        Celda celdaElegida = new Celda();
        boolean encontrada = false;
        for (Celda celda : matrizCuadrada) {
            if(celda.getFila() == fila && celda.getColumna() == columna){
                encontrada = true;
                celdaElegida = celda;
                break;
            }
        }

        if(encontrada){
            System.out.println(celdaElegida.getValor());
        }else{
            System.out.println("la fila y columna indicada no ha sido asignada");
        }
    }
}
