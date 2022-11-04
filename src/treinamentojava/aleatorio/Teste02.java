package treinamentojava.aleatorio;

import java.util.ArrayList;
import java.util.List;

public class Teste02 {

	public static void main(String[] args) {
		
		List<Integer> valores = new ArrayList<Integer>();
		valores.add(1);	
		valores.add(2);	
		valores.add(3);	
		valores.add(4);	
		valores.add(5);	
		
		int contador = 0;
		
		outerLoop:
		for (Integer val1 : valores) {
			for (Integer val2 : valores) {
				
				if (!val1.equals(val2)) {
					contador++;
					break outerLoop;
				}
				
			}
		}
		
		System.out.println(contador);
		
	}
	
}
