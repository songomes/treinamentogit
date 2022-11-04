package treinamentojava.ordenacao.comparator;

import java.util.Collections;
import java.util.List;

public class ExecutaOrdenacaoCarroComparatorTeste2 {

	public static void main(String[] args) {

		// List<Carro> carros = new ArrayList<Carro>();
		List<Carro> carros = null;
		// carros.add(new Carro(4));
		// carros.add(new Carro(8));
		// carros.add(new Carro(1));
		// carros.add(new Carro(5));
		// carros.add(new Carro(9));

		System.out.println("Lista de carros n�o ordenada:");
		// exibeCarros(carros);

		Collections.sort(carros, new CarroComparator());
		System.out.println("Lista de carros ordenada:");
		exibeCarros(carros);

	}

	public static void exibeCarros(List<Carro> carros) {
		for (Carro c : carros) {
			System.out.println("Carro " + c.getNumero());
		}
	}

}
