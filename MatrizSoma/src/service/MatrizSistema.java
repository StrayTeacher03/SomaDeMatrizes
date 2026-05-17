package service;

import javax.swing.JOptionPane;

public class MatrizSistema {
    public int[][] Ler(int[][] matriz, int cont) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String input = JOptionPane.showInputDialog(null, "Digite o valor da posição [" + i + "][" + j + "]",
                        "Inicialização da " + cont + "° Matriz", JOptionPane.QUESTION_MESSAGE);
                int num = Integer.parseInt(
                        (input == null || input.replaceAll("[^0-9]", "").isEmpty()) ? "0"
                                : input.replaceAll("[^0-9]", ""));

                if (input == null) {
                    JOptionPane.showMessageDialog(null, "Entrada cancelada, o número será considerado 0.",
                            "Entrada cancelada", JOptionPane.WARNING_MESSAGE);
                } else if (input.replaceAll("[^0-9]", "").isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida, o número será considerado 0.",
                            "Entrada inválida", JOptionPane.WARNING_MESSAGE);
                }
                matriz[i][j] = num;
            }
        }
        return matriz;
    }
    
    public int[][] Soma(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[2][2];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    public void Exibir(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        StringBuilder sM1 = new StringBuilder();
        StringBuilder sM2 = new StringBuilder();
        StringBuilder sM3 = new StringBuilder();

        sM1 = MontarMatriz(matriz1);
        sM2 = MontarMatriz(matriz2);
        sM3 = MontarMatriz(resultado);

        JOptionPane.showMessageDialog(null, "A matriz 1 é:\n"+sM1.toString(), "Primeira Matriz", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "A matriz 2 é:\n"+sM2.toString(), "Segunda Matriz", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "A soma das matrizes é:\n"+sM3.toString(), "Soma das Matrizes", JOptionPane.INFORMATION_MESSAGE);
    }

    public StringBuilder MontarMatriz(int[][] matriz) {
        StringBuilder sb = new StringBuilder();

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                sb.append(elemento).append(" ");
            }
            sb.append("\n");
        }
        return sb;
    }
}
