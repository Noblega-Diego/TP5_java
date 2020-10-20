package tp5_java.ejercicio07;

public class Celda {
    private int fila;
    private int columna;
    private String valor;

    public Celda() {}

    public Celda(int fila, int columna, String valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }
    
    public int getColumna() {
        return columna;
    }
    public int getFila() {
        return fila;
    }
    public String getValor() {
        return valor;
    }
    public void setColumna(int columna) {
        this.columna = columna;
    }
    public void setFila(int fila) {
        this.fila = fila;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
}
