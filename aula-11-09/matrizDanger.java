import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class matrizDanger {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = Files.newBufferedReader(Paths.get("entrada.txt"))) {

            // read line by line
            String line;
            String aux = br.readLine();
            System.out.println(aux.split(" "));
            String[] dados;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
                System.out.println(Integer.parseInt(line.split(" ")));
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        // System.out.println(sb);

    }
}
