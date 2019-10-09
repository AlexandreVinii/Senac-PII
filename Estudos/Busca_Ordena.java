class Busca_Ordena {

    public static void main(String[] args) {
        int[] vetor = { 9, 23, 54, 6, 1, 27, 47, 21, 3, 2, 153, 251, 532 };
        bolha(vetor);
        imprime(vetor);
        // int x =
        int var = busca_recursiva(532, vetor, 0, vetor.length);
        System.out.printf("Encontrou Vetor[%s]: %s\n", var, vetor[var]);
    }

    public static void bolha(int v[]) {
        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < v.length - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }

        }
    }

    public static int busca_recursiva(int x, int v[], int i, int f) {
        if (i > f)
            return -1;

        int m = (i + f) / 2;

        if (x == v[m])
            return m;

        if (x < v[m]) {
            return busca_recursiva(x, v, i, m - 1);
        } else {
            return busca_recursiva(x, v, m + 1, f);
        }
    }

    public static int busca_binaria(int x, int v[]) {
        int i, m, f;
        i = 0;
        f = v.length - 1;
        while (i <= f) {
            m = (i + f) / 2;

            if (x == v[m]) {
                return m;
            }
            if (x < v[m]) {
                f = m - 1;
            }
            if (x > v[m]) {
                i = m + 1;
            }
        }

        return -1;
    }

    public static void imprime(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf("V[%s]: %s \n", i, v[i]);
        }
    }

}