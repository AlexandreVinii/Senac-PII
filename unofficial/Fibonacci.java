public class Fibonacci {
    
    public static int fibonacciSemRecusao(int n) {
        int anterior = 0;
        int atual = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                atual = 1;               
            }
            else {
                atual += anterior;
                anterior = atual -  anterior;            
            }
        }
        return atual;
    }
    
    public static int fibonacciComRecursao(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacciComRecursao(n - 1) + fibonacciComRecursao(n - 2);
    }
    
    public static void main (String [] args) {
        int n = 30;
        
        long ini = System.nanoTime();
        int res = fibonacciSemRecusao(n);
        long fim = System.nanoTime();
        long t1 = fim - ini;        
        System.out.println ("Sem Recursao: " + res + " Tempo: " + t1 + " ns");
        
        ini = System.nanoTime();
        res = fibonacciComRecursao(n);
        fim = System.nanoTime();
        long t2 = fim - ini;
        System.out.println ("Com Recursao: " + res + " Tempo: " + t2 + " ns");
        long dif = t2 / t1;
        System.out.println(dif + " vezes");
        
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciComRecursao(i) + " ");
        }
        System.out.println();
    }
}

