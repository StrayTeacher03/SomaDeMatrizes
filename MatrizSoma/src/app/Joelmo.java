package app;

import service.MatrizSistema;

public class Joelmo {
    public static void main(String[] args) {//Método principal onde o programa roda
        int[][] matriz1 = new int[2][2], matriz2 = new int[2][2], resultado = new int[2][2];//Arrays que serão usadas
        MatrizSistema ms = new MatrizSistema();//Objeto da classe na pasta service para usar seus metódos

        //Metódos para poder gerenciar os arrays
        matriz1 = ms.Ler(matriz1, 1);
        matriz2 = ms.Ler(matriz2, 2);
        resultado = ms.Soma(matriz1, matriz2);
        ms.Exibir(matriz1, matriz2, resultado);
    }
}
