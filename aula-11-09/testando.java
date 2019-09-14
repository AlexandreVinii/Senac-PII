import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class testando{
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileReader arquivo;
        arquivo = new FileReader("entrada.txt");
        var leBufferizado = new BufferedReader(arquivo);
        String linha = leBufferizado.readLine();
        System.out.println(linha);
        while ((line = leBufferizado.readLine()) != null) {

        }
        leBufferizado.close();

        String[] dados = linha.split(" ");

        int[] vetor = new int[dados.length];

        for (int i = 0; i < dados.length; i++) {
            vetor[i] = Integer.parseInt(dados[i]);
            // System.out.println(vetor[i]);
        }

        int dif = diferencaAbsoluta(vetor);
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