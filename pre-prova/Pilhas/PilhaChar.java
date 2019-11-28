public class PilhaChar {
    // atributos
    private char elementos[];
    private int topo;
    
    // construtor
    public PilhaChar(int n) {
        elementos = new char[n];
        topo = -1;
    }
    
    // metodos
    public boolean isEmpty() {
        return topo == -1;
    }
    
    public boolean isFull() {
        return topo == elementos.length - 1;
    }
    
    public void push(char e) {
        if (!isFull()) {
            topo++;
            elementos[topo] = e;            
        }
    }
    
    public char pop() {
        char e = elementos[topo];
        topo--;
        return e;
    }
    
    public char top() {
        return elementos[topo];
    }
}
