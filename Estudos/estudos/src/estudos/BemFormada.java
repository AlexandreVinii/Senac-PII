package estudos;

public class BemFormada {

	static boolean bemFormada(String s) {
		PilhaChar p = new PilhaChar(100);
		
		for (int i = 0; i < s.length(); i++) {
			char c =s.charAt(i);
			if(c == '(' || c == '['){
			p.push(c);
		}else {
			if(p.isEmpty()) {
				return false;
			}
			char topo = p.pop();
			
		}
		
	}
}
}