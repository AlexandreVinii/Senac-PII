public class InverteVetor {
    
    public static void inverter(int v[]) {    
        int aux;
        for (int i = 0; i < v.length / 2; i++) {
            aux = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = aux;
        }
    }
    
    public static void imprimir(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int [] v = {3, 8, 7, 5, 4};
        imprimir(v);
        inverter(v);
        imprimir(v);
    }
}
