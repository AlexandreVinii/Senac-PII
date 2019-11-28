package estudos;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Texto: ");
        String s = sc.nextLine();
        Pilha p = new Pilha(100);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                p.push(c);
            }
            else {
                while (!p.isEmpty()) {
                    System.out.print(p.pop());
                }
                System.out.print(' ');
            }            
        }
        while (!p.isEmpty()) {
            System.out.print(p.pop());
        }
        System.out.println();
    }

}
