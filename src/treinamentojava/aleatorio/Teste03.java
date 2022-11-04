package treinamentojava.aleatorio;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Teste03 {

	public static void main(String[] args) {

		System.out.println(NumberFormat.getInstance(new Locale("pt", "BR")).format(new BigDecimal("123.12")));

	}

}
