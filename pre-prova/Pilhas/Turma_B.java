
public class Turma_B {

    public static void main(String[] args) {
        String posfixa = posfixa("1 + 2 * 3 + 4");
        int res = calcular(posfixa);
        System.out.println(posfixa + " = " + res);
    }

    public static int prioridade(char c) {
        switch (c) {
            case '(':
                return 0;
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    static String posfixa(String infixa) {
        PilhaChar p = new PilhaChar(infixa.length());
        String posfixa = "";
        for (int i = 0; i < infixa.length(); i++) {
            char c = infixa.charAt(i);
            if (c == '(') {
                p.push(c);
            } else if (Character.isDigit(c)) {
                posfixa += c;
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!p.isEmpty()
                        && prioridade(p.top()) >= prioridade(c)) {
                    posfixa += p.pop();
                }
                p.push(c);
            } else if (c == ')') {
                while (p.top() != '(') {
                    posfixa += p.pop();
                }
                p.pop();
            }
        }
        while (!p.isEmpty()) {
            posfixa += p.pop();
        }
        return posfixa;
    }

    static int calcular(String s) {
        PilhaInt p = new PilhaInt(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int n = Character.getNumericValue(s.charAt(i));
                p.push(n);
            }
            if (s.charAt(i) == '+' || s.charAt(i) == '-'
                    || s.charAt(i) == '*' || s.charAt(i) == '/') {
                int y = p.pop();
                int x = p.pop();
                switch (s.charAt(i)) {
                    case '+':
                        p.push(x + y);
                        break;
                    case '-':
                        p.push(x - y);
                        break;
                    case '*':
                        p.push(x * y);
                        break;
                    case '/':
                        p.push(x / y);
                        break;
                }
            }            
        }
        return p.pop();
    }
}
