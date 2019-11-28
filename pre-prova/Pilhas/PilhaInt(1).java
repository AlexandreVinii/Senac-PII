public class PilhaInt {
    // atributos
    private int elementos[];
    private int topo;
    
    // construtor
    public PilhaInt(int n) {
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
    
    public int top() {
        return elementos[topo];
    }
}
