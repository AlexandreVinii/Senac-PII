package estudos;

public class Pilha {
	// atributos
    private int elementos[];
    private int topo;
    
    // construtor
    public Pilha(int n) {
        elementos = new int[n];
        topo = -1;
    }
    
    // metodos
    public boolean isEmpty() {
        return topo == -1;
    }
    
    public boolean isFull() {
        return topo == elementos.length - 1;
    }
    
    public void push(int e) {
        if (!isFull()) {
            topo++;
            elementos[topo] = e;            
        }
    }
    
    public int pop() {
        int e = elementos[topo];
        topo--;
        return e;
    }
    
    public void binario(int num) {
    	Pilha p = new Pilha(50);
    	
    	do {
    		int r = num % 2;
    		p.push(r);
    		num = num/2;
    		
    	}while(num != 0);
    	while(!p.isEmpty()){
    		System.out.print(p.pop());
    	}
    	System.out.println();
    }
}
