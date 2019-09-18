
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

 /*
 Nome: Alexandre Vinicius Ferreira da Silva
 */
public class testando{
    
    public static void main(String[] args) throws FileNotFoundException, IOException{

    //  Declaração de variáveis para abertura/leitura de um arquivo
        FileReader arquivo;
        String line;
        ArrayList<String> list = new ArrayList<String>();
        int[] n;

    // Variável recebe um arquivo e o lê
        arquivo = new FileReader("entrada.txt");

    // Cria um espaço na memória para esse arquivo enquanto está aberto
        var leBufferizado = new BufferedReader(arquivo);
        
    // Lê Primeira linha e salva em uma variável 
        String firstLine = leBufferizado.readLine();

        String[] dados = firstLine.split(" ");
        n = new int[dados.length];

        for (int k = 0; k < dados.length; k++) {
            n[k] = Integer.parseInt(dados[k]);
        }
        float[][] data = new float[n[0]][n[1]];
        
        while ((line = leBufferizado.readLine()) != null) {
            // System.out.println(line);
            list.add(line);
        }
        System.out.println(list);
        for (int i = 0; i < data.length; i++) {
            dados = list.get(i).split(" ");
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = Float.parseFloat(dados[j]);
            }
        }
        leBufferizado.close();
        
        System.out.println("COLUNA E LINHA TAL "+data[2][4]);

        
        // System.out.println("Diferença Absoluta: "+dif);
        
    }

    public static int diferencaAbsoluta(int[] v){
        int menor = v[0];
        int maior = v[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i] < menor){
                menor = v[i];

            }
            if (v[i] > maior){
                maior = v[i];
            }
        }
        return maior - menor;
    }
}