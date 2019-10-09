
public class RecursividadeExercicio05 {
	
	public static int buscaLinearRecursiva(int x, int[] v, int i) {
		if (i == v.length) return -1;
		if (v[i] == x) return i;
		return buscaLinearRecursiva(x, v, i + 1);
	}

	public static int menorElemento(int[] v, int n) {
		if (n == 1) return v[0]; 
		int x = menorElemento(v, n - 1);
		if (x < v[n-1]) return x;
		else return v[n-1];
	}
	
	public static int somaRecursiva(int[] v, int n) {
		if (n == v.length) return 0;
		return v[n] + somaRecursiva(v, n + 1);
	}
	
	public static float mediaRecursiva(int[] v, int n) {
		if (n == v.length) return 0;
		float soma =  v[n] + somaRecursiva(v, n + 1);
		if (n == 0) return soma / v.length;
		return soma;
	}

	public static void main(String[] args) {
		int[] v= {3,7,8,11,14,18,21,25};		
		int p = buscaLinearRecursiva(15, v, 0);
		System.out.println("Posicao: " + p);

		int[] v1 = {4, 6, 1, 8};
		System.out.println("Menor Elemento: " + menorElemento(v1, v1.length));
		System.out.println("Soma: " + somaRecursiva(v1, 0));		
		System.out.println("Media: " + mediaRecursiva(v1, 0));
	}
}
