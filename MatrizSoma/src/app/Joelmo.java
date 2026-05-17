package app;

import service.MatrizSistema;

public class Joelmo {
    public static void main(String[] args) {
        int[][] matriz1 = new int[2][2], matriz2 = new int[2][2], resultado = new int[2][2];
        MatrizSistema ms = new MatrizSistema();

        matriz1 = ms.Ler(matriz1, 1);
        matriz2 = ms.Ler(matriz2, 2);
        resultado = ms.Soma(matriz1, matriz2);
        ms.Exibir(matriz1, matriz2, resultado);
    }
}
