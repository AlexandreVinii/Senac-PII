import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/*
Nome: Alexandre Vinicius Ferreira da Silva
*/
public class centerGravity {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Declaração de variáveis para abertura/leitura de um arquivo.
        FileReader arquivo;
        String line;
        ArrayList<String> list = new ArrayList<String>();
        int[] n;
        float[] aux;

        // Variável recebe um arquivo e o lê.
        arquivo = new FileReader("entrada.txt");

        // Cria um espaço na memória para esse arquivo enquanto está aberto.
        var leBufferizado = new BufferedReader(arquivo);

        // Lê Primeira linha do arquivo e salva em uma variável.
        String firstLine = leBufferizado.readLine();

        // (String) Guarda a primeira linha do arquivo em um vetor para determinar o
        // (tamanho da Matriz).
        String[] dados = firstLine.split(" ");
        n = new int[dados.length];

        // Laço de repetição converte String em Float para determinar o tamanho da
        // matriz com base na primeira linha do Arquivo.
        for (int k = 0; k < dados.length; k++) {
            n[k] = Integer.parseInt(dados[k]);
        }
        float[][] data = new float[n[0]][n[1]];

        // Adiciona todos os dados em um array list do tipo String
        while ((line = leBufferizado.readLine()) != null) {
            list.add(line);
        }
        System.out.println(list);

        // Laço de repetição que converte um arraylist(String) em uma Matriz do tipo
        // Float
        for (int i = 0; i < data.length; i++) {
            dados = list.get(i).split(" ");
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = Float.parseFloat(dados[j]);
            }
        }

        // Fecha o arquivo.
        leBufferizado.close();

        // Laço que cria duas matrizes que adiciona a
        // diferença absoluta de cada Linha e cada coluna em duas novas Matrizes
        // Matriz diferença Linha e Matriz diferença Coluna.
        float[][] arrayLine = new float[n[0]][n[1]];
        float[][] arrayCol = new float[n[0]][n[1]];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                aux = diferencaAbsoluta(data, i, j);
                arrayLine[i][j] = aux[0];
                arrayCol[i][j] = aux[1];
            }
        }

        System.out.println("Linha Centro : " + arrayLine[3][4]);
        System.out.println("Coluna Centro : " + arrayCol[3][4]);

        // Variáveis que recebem um valor inicial para cálculo do centro de gravidade
        // menorLine = Menor diferença absoluta da linha de uma matriz
        // menorCol = Menor diferença absoluta da coluna de uma matriz
        float menorLine = arrayLine[0][0];
        float menorCol = arrayCol[0][0];
        int ind = 0;
        int col = 0;

        // Laço de repetição que encontra o centro de gravidade de uma matriz.
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (arrayLine[i][j] <= menorLine && arrayCol[i][j] <= menorCol) {
                    menorLine = arrayLine[i][j];
                    menorCol = arrayCol[i][j];
                    ind = i;
                    col = j;
                }
            }
        }
        System.out.print("Centro Gravidade Matriz : ");
        System.out.printf("m[%d][%d] = %.1f\n", ind, col, data[ind][col]);
        System.out.println("Diferença Absoluta Linha: " + menorLine);
        System.out.println("Diferença Absoluta Coluna: " + menorCol);

    }

    // Calcula a diferença absoluta entre duas porções de linha e coluna, retorna um vetor.
    public static float[] diferencaAbsoluta(float[][] v, int l, int c) {
        float lineUp = 0;
        float lineDown = 0;
        float cRight = 0;
        float cLeft = 0;
        float dif_linha = 0;
        float dif_coluna = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (i < l) {
                    lineUp += v[i][j];
                } else if (i > l) {
                    lineDown += v[i][j];
                }
                if (j < c) {
                    cRight += v[i][j];
                } else if (j > c) {
                    cLeft += v[i][j];
                }
            }

        }
        dif_linha = lineUp - lineDown;
        dif_coluna = cRight - cLeft;
        if (dif_linha < 0) {
            dif_linha = -dif_linha;
        }
        if (dif_coluna < 0) {
            dif_coluna = -dif_coluna;
        }
        return new float[] { dif_linha, dif_coluna, l, c };
    }

}